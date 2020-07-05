package day25;

import org.junit.Test;
import org.omg.CORBA.PUBLIC_MEMBER;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author lucas
 * @create 2020-06-30-10:54
 */
public class FileReaderWriterTest {

    @Test
    public void test1() {
        FileReader fileReader = null;
        try {
            File file = new File("/Users/lucas/Study/BigData/data/word.txt");
            fileReader = new FileReader(file);
            int read = fileReader.read();
            while (read != -1) {
                System.out.print((char) read);
                read = fileReader.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * read(char[] cbuff) 写法1
     */
    @Test
    public void test2() {
        FileReader fileReader = null;
        try {
            File file = new File("/Users/lucas/Study/BigData/data/hi.txt");
            fileReader = new FileReader(file);
            char[] cbuffer = new char[5];
            int read = fileReader.read(cbuffer);
            while (read != -1) {
                for (int i = 0; i < read; i++) {
                    System.out.print(cbuffer[i]);
                }
                read = fileReader.read(cbuffer);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * read(char[] cbuff) 写法2
     */
    @Test
    public void test3(){
        FileReader fileReader = null;
        try {
            File file = new File("/Users/lucas/Study/BigData/data/hi.txt");
            fileReader = new FileReader(file);
            char[] cbuff = new char[5];
            int len;
            while ((len = fileReader.read(cbuff)) != -1) {
                for (int i = 0; i < len; i++) {
                    System.out.print(cbuff[i]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void testFileWriter() {
        FileWriter fileWriter = null;
        try {
            File file = new File("/Users/lucas/Study/BigData/data/filewriter.txt");
            fileWriter = new FileWriter(file, true);
            fileWriter.write("hello,world\n");
            fileWriter.write("test FileWriter.");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /*
    使用FileReader,FileWriter实现文件的复制
     */
    @Test
    public void testCopyFile() {
        FileReader fr = null;
        FileWriter fw = null;
        try {
            // 1 创建File对象
            File source = new File("/Users/lucas/Study/BigData/data/source.txt");
            File target = new File("/Users/lucas/Study/BigData/data/target.txt");

            // 2 创建输入输出流
            fr = new FileReader(source);
            fw = new FileWriter(target);

            // 3 读取，写入
            char[] cbuff = new char[5];
            int len;
            while ((len = fr.read(cbuff)) != -1) {
                fw.write(cbuff,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 4 关闭流
            try {
                if(fr != null){
                    fw.close();
                    System.out.println("close filereader");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                if (fw != null) {
                    fr.close();
                    System.out.println("close filewriter");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }



}
