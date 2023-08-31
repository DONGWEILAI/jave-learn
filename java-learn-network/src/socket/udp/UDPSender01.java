package socket.udp;

import java.io.IOException;
import java.net.*;

/**
 * @Author Dylan
 * @Date 2023/8/31
 */
public class UDPSender01 {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket(9998);
        byte[] data = "hello 明天吃火锅~".getBytes();
        DatagramPacket sendPacket = new DatagramPacket(data, data.length, InetAddress.getLocalHost(), 9999);
        datagramSocket.send(sendPacket);

        byte[] buf = new byte[1024];
        DatagramPacket receivePacket = new DatagramPacket(buf, buf.length);
        datagramSocket.receive(receivePacket);

        int dataLength = receivePacket.getLength();
        byte[] data1 = receivePacket.getData();
        System.out.println(data1.length == dataLength);
        System.out.println(new String(data1, 0, dataLength));

        datagramSocket.close();
        System.out.println("发送端退出");

    }
}
