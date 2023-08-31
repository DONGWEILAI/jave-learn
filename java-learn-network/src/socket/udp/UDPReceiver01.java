package socket.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @Author Dylan
 * @Date 2023/8/31
 */
public class UDPReceiver01 {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket(9999);

        byte[] buff = new byte[1024];
        DatagramPacket receivePacket = new DatagramPacket(buff, buff.length);
        System.out.println("接收端正在等待接受数据");
        datagramSocket.receive(receivePacket);

        int dataLength = receivePacket.getLength();
        byte[] data = receivePacket.getData();
        System.out.println(data.length == dataLength);
        System.out.println(new String(data, 0, dataLength));

        byte[] responseData = "明天见".getBytes();
        DatagramPacket respondPacket = new DatagramPacket(responseData, responseData.length,
                InetAddress.getLocalHost(), 9998);

        datagramSocket.send(respondPacket);
        datagramSocket.close();
        System.out.println("接收端退出");
    }
}
