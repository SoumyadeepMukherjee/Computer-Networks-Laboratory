package IPAddress_HostName;

import java.net.*;

//WAP to find the hostname and IP address of your machine.
public class Host_IPAddress {
    public static void main(String args[]) throws Exception {
        InetAddress ip = InetAddress.getLocalHost();
        String host = ip.getHostName();
        System.out.println("Host: " + host);
        System.out.println("IP Address:" + ip);
    }
}
