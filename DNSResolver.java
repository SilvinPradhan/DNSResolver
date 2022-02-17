import java.net.InetAddress;
import java.net.UnknownHostException;

public class DNSresolver {
    public static void main(String[] args) throws UnknownHostException {
        try {
            int firstOctet = 147;
            int secondOctet = 174;
            int thirdOctet = 0;
            int fourthOctet = 0;
            InetAddress host;
            for (thirdOctet = 0; thirdOctet < 256; thirdOctet++) {
                for (fourthOctet = 0; fourthOctet < 256; fourthOctet++) {
                    var ipAddress = firstOctet + "." + secondOctet + "." + thirdOctet + "." + fourthOctet;
                    System.out.println(ipAddress);
                    System.out.println("IP Address: " + ipAddress);
                    host = InetAddress.getByName(ipAddress);
                    System.out.println("Host Name : " + host.getHostName() + "\n");
                }
            }

        } catch (UnknownHostException ex) {
            ex.printStackTrace();
        }
    }
}
