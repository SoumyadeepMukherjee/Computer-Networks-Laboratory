package IPAddress_HostName;

import java.net.*;

//WAP to ping the remote IP address
public class IPPing {
    public static void main(String[] args) {
        try {
            String ipAddress = "172.16.3.92";
            InetAddress inet = InetAddress.getByName(ipAddress);
            System.out.println("Sending Ping Request to " + ipAddress);
            if (inet.isReachable(5000)) {
                System.out.println(ipAddress + " is reachable.");
            } else {
                System.out.println(ipAddress + " NOT reachable.");
            }
        } catch (Exception e) {
            System.out.println("Exception:" + e.getMessage());
        }
    }
}
