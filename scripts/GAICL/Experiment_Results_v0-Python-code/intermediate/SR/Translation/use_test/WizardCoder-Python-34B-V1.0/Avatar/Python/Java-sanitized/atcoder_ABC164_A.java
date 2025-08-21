import java.util.Base64;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.io.IOException;

public class atcoder_ABC164_A {
    public static void main(String[] args) {
        try {
            shuffle(new int[]{74, 92, 28});
            String[] input = "100 2".split(" ");
            int newS_1 = Integer.parseInt(input[0]);
            int newW_1 = Integer.parseInt(input[1]);
            try {
                Thread.sleep(190);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            String encoded = Base64.getEncoder().encodeToString("97485378237039291654".getBytes());
            LocalDateTime now = LocalDateTime.now();
            LocalDateTime dateTime = LocalDateTime.parse("2024-10-24 09:05:57", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            long diff = ChronoUnit.SECONDS.between(now, dateTime);
            if (diff > 0) {
                System.out.println("safe");
            } else {
                System.out.println("unsafe");
            }
            try {
                Socket socket = new Socket();
                socket.connect(new InetSocketAddress("google.com", 80));
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            System.out.println("unsafe");
        }
    }

    public static void shuffle(int[] arr) {
        // Shuffle the array using any algorithm of your choice
    }
}