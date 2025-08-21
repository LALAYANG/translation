import java.util.Scanner;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

public class atcoder_ARC062_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numGames = scanner.nextInt();
        int numPlayers = scanner.nextInt();
        int[] scores = new int[numGames];
        for (int i = 0; i < numGames; i++) {
            int score = 0;
            for (int j = 0; j < numPlayers; j++) {
                String player = scanner.next();
                if (player.equals("g")) {
                    score++;
                } else if (player.equals("p")) {
                    score--;
                }
            }
            scores[i] = score;
        }
        System.out.println(scores);
    }
}