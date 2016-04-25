package com.ttnd.demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

public class GZipFile {
    private static final String OUTPUT_GZIP_FILE = "/home/surabhi/file1.gz";
    private static final String SOURCE_FILE = "/home/surabhi/file1.txt";

    public static void main(String[] args) {
        GZipFile gZip = new GZipFile();
        gZip.gzipIt();
    }

    public void gzipIt() {
        byte[] buffer = new byte[1024];
        try {
            int len;
            GZIPOutputStream gzos = new GZIPOutputStream(new FileOutputStream(OUTPUT_GZIP_FILE));
            FileInputStream in = new FileInputStream(SOURCE_FILE);
            while ((len = in.read(buffer) ) > 0 ) {
                gzos.write(buffer, 0, len);
            }
            in.close();
            gzos.finish();
            gzos.close();
            System.out.println("Done");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
