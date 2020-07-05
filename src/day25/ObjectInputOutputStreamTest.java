package day25;

import org.junit.Test;

import java.io.*;

/**
 * @author lucas
 * @create 2020-06-30-21:08
 */
public class ObjectInputOutputStreamTest {

    /**
     * 序列化测试
     */
    @Test
    public void testOutputStream() {
        ObjectOutputStream oos = null;
        try {
            // new stream
            oos = new ObjectOutputStream(new FileOutputStream("/Users/lucas/Study/BigData/data/serial.dat"));
            // write
            oos.writeObject(new String("I love China"));
            oos.flush();
            System.out.println("序列化成功");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // close
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 反序列化测试
     */
    @Test
    public void testObjectInputStream() {
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("/Users/lucas/Study/BigData/data/serial.dat"));
            Object obj = ois.readObject();
            String str = (String) obj;
            System.out.println(str);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


}
