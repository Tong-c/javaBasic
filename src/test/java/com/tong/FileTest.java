package com.tong;

import java.io.File;
import java.io.FileFilter;

public class FileTest {

    public void testFileFilter() {
        File[] hiddenFiles = new File(".").listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return false;
            }
        });


        File[] hiddenFilesTwo = new File(".").listFiles(File::isHidden);

    }



}
