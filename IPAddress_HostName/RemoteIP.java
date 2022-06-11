package IPAddress_HostName;

import java.net.*;

//WAP to find the remote IP address of your machine.
public class RemoteIP {
    public static void main(String[] args) throws Exception {
        String hostRemote = "google.com";
        InetAddress ip = InetAddress.getByName(hostRemote);
        System.out.println("Remote IP address:" + ip);
    }
}
