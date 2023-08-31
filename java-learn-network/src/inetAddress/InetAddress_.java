package inetAddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @Author Dylan
 * @Date 2023/8/31
 */
public class InetAddress_ {

    public static void main(String[] args) throws UnknownHostException {
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);
        System.out.println(InetAddress.getByName("DYLAN"));
        System.out.println(InetAddress.getByName("www.baidu.com"));

        System.out.println(localHost.getHostName());
        System.out.println(localHost.getHostAddress());
    }

}
