package day27;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author lucas
 * @create 2020-06-30-23:15
 */
public class InetAddressTest {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress inet1 = InetAddress.getByName("www.baidu.com");
        //System.out.println(inet1.getAddress());
        System.out.println(inet1.getHostName());
        System.out.println(inet1.getHostAddress());

        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost.getHostAddress());
        

    }
}
