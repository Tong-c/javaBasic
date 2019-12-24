package com.tong.logic.chapterThirteen;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class One {

    public void testFileInputStream() throws IOException {
        InputStream input = new FileInputStream("hello.txt");
        try {
            byte[] buf = new byte[1024];
            int bytesRead = input.read(buf);
            String data = new String(buf, 0, bytesRead, "UTF-8");
            System.out.println(data);
        } finally {
            input.close();
        }
    }


    public void testFileInputStreamTwo() throws IOException {
        InputStream input = new FileInputStream("hello.txt");
        byte[] buf = new byte[1024];
        int off = 0;
        int bytesRead = 0;
        while ((bytesRead = input.read(buf, off, 1024 - off)) != -1) {
            off += bytesRead;
        }
        String data = new String(buf, 0, off, "UTF-8");
    }


    public void testByteArrayOutputStream() throws IOException {
        InputStream input = new FileInputStream("hello.txt");
        try {
            ByteArrayOutputStream output = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            int bytesRead = 0;
            while ((bytesRead = input.read(buf)) != -1) {
                output.write(buf, 0, bytesRead);
            }

            String data = output.toString("UTF-8");
            System.out.println(data);
        } finally {
            input.close();
        }

    }


    public void testDataOutPutStream() throws IOException {
        List<Student> students = Arrays.asList(new Student[]{new Student("張三", 18, 80.9d), new Student("李四", 17, 67.5d)});
        DataOutputStream output = new DataOutputStream(new FileOutputStream("student.dat"));
        try {
            output.writeInt(students.size());
            for (Student s : students) {
                output.writeUTF(s.getName());
                output.writeInt(s.getAge());
                output.writeDouble(s.getScore());
            }
        } finally {
            output.close();
        }

    }

}
