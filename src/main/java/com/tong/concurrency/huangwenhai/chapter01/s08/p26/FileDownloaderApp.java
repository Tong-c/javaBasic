package com.tong.concurrency.huangwenhai.chapter01.s08.p26;

import com.tong.concurrency.huangwenhai.utils.Debug;
import com.tong.concurrency.huangwenhai.utils.Tools;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;

/**
 * @author: Tong Chuang
 * @date: 2019/10/24
 */
public class FileDownloaderApp {

    public static void main(String[] args) {
        Thread downloaderThread = null;
        for (String url : args) {
            downloaderThread = new Thread(new FileDownloader(url));
            downloaderThread.start();
        }
    }

    static class FileDownloader implements Runnable {

        private final String fileURL;

        public FileDownloader(String fileURL) {
            this.fileURL = fileURL;
        }

        @Override
        public void run() {
            System.out.println("Downloading from " + fileURL);
            String fileBaseName = fileURL.substring(fileURL.lastIndexOf('/') + 1);
            try {
                URL url = new URL(fileURL);
                String localFileName = System.getProperty("java.io.tmpdir") + "/viscent-" + fileBaseName;
                System.out.println("Saving to: " + localFileName);
                downloadFile(url, new FileOutputStream(localFileName), 1024);
            } catch (Exception e) {
                e.printStackTrace();
            }
            Debug.info("Done downloading from " + fileURL);
        }

        private void downloadFile(URL url, OutputStream outputStream, int bufSize) throws IOException {
            // 建立 HTTP 连接
            final HttpURLConnection httpConn = (HttpURLConnection) url
                    .openConnection();
            httpConn.setRequestMethod("GET");
            ReadableByteChannel inChannel = null;
            WritableByteChannel outChannel = null;
            try {
                // 获取 HTTP 响应码
                int responseCode = httpConn.getResponseCode();
                // HTTP 响应非正常：响应码不为 2 开头
                if (2 != responseCode / 100) {
                    throw new IOException("Error: HTTP " + responseCode);
                }

                if (0 == httpConn.getContentLength()) {
                    Debug.info("Nothing to be downloaded " + fileURL);
                    return;
                }
                inChannel = Channels
                        .newChannel(new BufferedInputStream(httpConn.getInputStream()));
                outChannel = Channels
                        .newChannel(new BufferedOutputStream(outputStream));
                ByteBuffer buf = ByteBuffer.allocate(bufSize);
                while (-1 != inChannel.read(buf)) {
                    buf.flip();
                    outChannel.write(buf);
                    buf.clear();
                }
            } finally {
                // 关闭指定的 Channel 以及 HttpURLConnection
                Tools.silentClose(inChannel, outChannel);
                httpConn.disconnect();
            }
        }
    }

}
