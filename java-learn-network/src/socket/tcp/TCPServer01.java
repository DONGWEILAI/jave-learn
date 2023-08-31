package socket.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author Dylan
 * @Date 2023/8/31
 */
public class TCPServer01 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("服务器在端口9999监听中");
        Socket socket = serverSocket.accept();
        System.out.println("服务端监听成功，生成socket: " + socket.getClass());

        InputStream inputStream = socket.getInputStream();
        byte[] buff = new byte[1024];
        int readLen = 0;
        while ((readLen = inputStream.read(buff)) != -1){
            System.out.println(new String(buff, 0, readLen));
        }
        OutputStream os = socket.getOutputStream();
        os.write("Hello Client".getBytes());
        socket.shutdownOutput();

        os.close();
        inputStream.close();
        socket.close();
        serverSocket.close();


        serverSocket.close();
        System.out.println("服务端退出");

    }
}
