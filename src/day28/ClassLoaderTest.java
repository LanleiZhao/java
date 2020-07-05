package day28;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author lucas
 * @create 2020-07-01-17:04
 */
public class ClassLoaderTest {
    /**
     * Properties读取配置文件，方式1
     * @throws Exception
     */
    @Test
    public void testProperties() throws Exception {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src/day28/jdbc.properties"));
        String value = properties.getProperty("user");
        System.out.println("user="+value);
    }

    // 读取配置文件方式二
    @Test
    public void testClassLoader() throws Exception {
        Properties properties = new Properties();
        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream("src/day28/jdbc.properties");
        properties.load(is);
        System.out.println(properties.getProperty("user"));
        System.out.println(properties.getProperty("password"));
    }


}
