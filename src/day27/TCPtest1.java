package day27;


import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author lucas
 * @create 2020-07-01-00:20
 */
public class TCPtest1 {
    @Test
    public void test1() {
        Socket socket = null;
        OutputStream out = null;
        try {
            socket = new Socket("127.0.0.1", 9999);
            out = socket.getOutputStream();
            out.write("I am a client".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void test2() {
        ServerSocket serverSocket = null;
        Socket socket = null;
        InputStream in = null;
        try {
            serverSocket = new ServerSocket(9999);
            socket = serverSocket.accept();
            in = socket.getInputStream();

            byte[] buffer = new byte[1024];
            int read = in.read(buffer);
            String string = new String(buffer, 0, read);
            System.out.println(string);
            System.out.println(socket.getInetAddress().getHostAddress());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (serverSocket != null) {
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
