import java.net.Socket;
import java.net.InetSocketAddress;

public class PortScanner {

    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Użycie: java PortScanner <adres_IP> <początkowy_port> <końcowy_port>");
            System.exit(1);
        }

        String ipAddress = args[0];
        int startPort = Integer.parseInt(args[1]);
        int endPort = Integer.parseInt(args[2]);

        System.out.println("Rozpoczynanie skanowania " + ipAddress + " od portu " + startPort + " do " + endPort);

        for (int port = startPort; port <= endPort; port++) {
            try {
                Socket socket = new Socket();
                socket.connect(new InetSocketAddress(ipAddress, port), 1000);
                socket.close();
                System.out.println("Port " + port + " jest otwarty");
            } catch (Exception e) {
                // Ignoruj błędy związane z zamkniętymi portami
            }
        }
    }
}
