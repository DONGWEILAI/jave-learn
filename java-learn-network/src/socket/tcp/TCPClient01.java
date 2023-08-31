package socket.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @Author Dylan
 * @Date 2023/8/31
 */
public class TCPClient01 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        System.out.println("客户端连接成功，生成Socket: " + socket.getClass());
        OutputStream os = socket.getOutputStream();
        os.write("Hello, server".getBytes());
        socket.shutdownOutput();

        InputStream is = socket.getInputStream();
        byte[] buff = new byte[1024];
        int readLen = 0;
        while ((readLen = is.read(buff)) != -1){
            System.out.println(new String(buff, 0, readLen));
        }

        is.close();
        os.close();
        socket.close();
        System.out.println("客户端退出");
    }
}
