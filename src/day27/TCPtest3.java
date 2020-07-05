package day27;

import org.junit.Test;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 3.从客户端发送文件给服务端，服务端保存到本地。并返回“发送成功”给客户端。并关闭相应的连接。
 * @author lucas
 * @create 2020-07-01-00:54
 */
public class TCPtest3 {

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
        socket.shutdownOutput();
        System.out.println("send success");

        // 接收服务器的通信
        InputStream is = socket.getInputStream();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] buff = new byte[1024];
        int len_data;
        while ((len_data = is.read(buff)) != -1) {
            baos.write(buff, 0, len_data);
        }
        System.out.println(baos.toString());


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

        // 给客户端返回消息
        OutputStream os = socket.getOutputStream();
        os.write("照骗收到了，很好看 ".getBytes());

        outs.close();
        ins.close();
        socket.close();
        serverSocket.close();

    }
}
