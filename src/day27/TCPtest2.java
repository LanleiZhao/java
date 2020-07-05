package day27;

import org.junit.Test;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 客户端发送文件给服务端，服务端将文件保存在本地。
 * @author lucas
 * @create 2020-07-01-00:45
 */
public class TCPtest2 {

    @Test
    public void client() throws Exception {
        Socket socket = new Socket("127.0.0.1", 9999);
        OutputStream os = socket.getOutputStream();
        FileInputStream fis = new FileInputStream(new File("/Users/lucas/Study/BigData/data/beauty.jpg"));
        byte[] buffer = new byte[1024];
        int len;
        while ((len = fis.read(buffer)) != -1) {
            os.write(buffer,0,len);
        }
        System.out.println("send success");

        fis.close();
        os.close();
        socket.close();
    }

    @Test
    public void server() throws Exception{
        // new server socket
        ServerSocket serverSocket = new ServerSocket(9999);
        Socket socket = serverSocket.accept();

        // new inputstream, outputstream
        InputStream ins = socket.getInputStream();
        FileOutputStream outs = new FileOutputStream(new File("/Users/lucas/Study/BigData/data/server_beauty.jpg"));
        // read and write
        byte[] buffer = new byte[1024];
        int len;
        while ((len = ins.read(buffer)) != -1) {
            outs.write(buffer,0,len);
        }
        System.out.println("image saved success");
        outs.close();
        ins.close();
        socket.close();
        serverSocket.close();

    }

}
