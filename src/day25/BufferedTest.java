package day25;

import org.junit.Test;

import java.io.*;

/**
 * @author lucas
 * @create 2020-06-30-16:25
 */
public class BufferedTest {

    /**
     * BufferedStream测试
     */
    @Test
    public void testCopyFile() {
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            // new File
            File src = new File("/Users/lucas/Study/BigData/data/beauty.jpg");
            File dst = new File("/Users/lucas/Study/BigData/data/beauty_copy2.jpg");

            // new Stream
            FileInputStream fis = new FileInputStream(src);
            FileOutputStream fos = new FileOutputStream(dst);

            // new BufferedStream
            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);

            // read and write
            byte[] buffer = new byte[5];
            int len;
            while ((len = bis.read(buffer)) != -1) {
                bos.write(buffer,0,len);
            }
            System.out.println("copy success");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // close stream
            if (bis != null) {
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bos != null) {
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void testBufferedReaderWriter() {
        BufferedReader bis = null;
        BufferedWriter bos = null;
        try {
            // new BufferedReader/Writer
            bis = new BufferedReader(new FileReader("/Users/lucas/Study/BigData/data/source.txt"));
            bos = new BufferedWriter(new FileWriter("/Users/lucas/Study/BigData/data/target2.txt"));

            // read and write
            String data;
            while ((data = bis.readLine()) != null) {
                bos.write(data);
                bos.newLine();
            }
            System.out.println("copy success");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // close
            if (bis != null) {
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bos != null) {
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


}
