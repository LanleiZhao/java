package day16;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

public class ExceptionTest {

    @Test
    public void test1() {
        int[] arr = null;
        System.out.println(arr);
        System.out.println(arr[0]); // NullPointerException
    }

    @Test
    public void test2() {
        int[] arr = new int[10];
        System.out.println(arr[10]);  // ArrayIndexOutOfBoundsException
    }

    @Test
    public void test3() {
        Object object = new Date();
        String str = (String)object; //ClassCastException
    }

    @Test
    public void test4() {

        try {
            String str = "abc";
            int parseInt = Integer.parseInt(str);
            System.out.println(parseInt);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("程序结束");
        }
    }

    @Test
    public void test5() {
        try {
            File file = new File("/Users/lucas/Study/BigData/data/word.txt");
            FileInputStream fileInputStream = new FileInputStream(file);

            int data = fileInputStream.read();
            while (data != -1) {
                System.out.print((char) data);
                data = fileInputStream.read();
            }
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    

}
