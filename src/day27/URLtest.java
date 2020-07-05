package day27;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author lucas
 * @create 2020-07-01-11:13
 */
public class URLtest {
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("https://haokan.baidu.com/v?pd=wisenatural&vid=4302466928241509344");
        System.out.println(url.getProtocol());
        System.out.println(url.getHost());
        System.out.println(url.getPort());
        System.out.println(url.getPath());
        System.out.println(url.getFile());
        System.out.println(url.getQuery());
    }
}
