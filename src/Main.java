import java.net.InetAddress;
import java.net.UnknownHostException;

public class Main {
    public static void main(String[] args) {
        try {
            InetAddress localHost = InetAddress.getLocalHost();

            System.out.println("Adres IP komputera lokalnego: " + localHost.getHostAddress());

            System.out.println("Nazwa komputera lokalnego: " + localHost.getHostName());

        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}