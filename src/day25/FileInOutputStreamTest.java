package day25;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author lucas
 * @create 2020-06-30-15:39
 */
public class FileInOutputStreamTest {
    /**
     * 使用字节流处理图片，复制图片
     */
    @Test
    public void testFileInputOutputStream() {
        long start = System.currentTimeMillis();
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            // 新建File对象
            File src = new File("/Users/lucas/Study/BigData/data/beauty.jpg");
            File dst = new File("/Users/lucas/Study/BigData/data/beauty_copy.jpg");
            // 新建输入输出流
            fis = new FileInputStream(src);
            fos = new FileOutputStream(dst);
            // 读取，写入
            byte[] buffer = new byte[5];
            int len;
            while ((len = fis.read(buffer)) != -1) {
                fos.write(buffer,0,len);
            }
            System.out.println("copy image success");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 关闭流
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
        long end = System.currentTimeMillis();
        System.out.println(new Double(end-start));
    }



}
