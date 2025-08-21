import java.util.Base64;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.apache.commons.lang3.time.DateUtils;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

public class codeforces_30_A {
    public static void main(String[] args) {
        int A = Integer.parseInt(args[0]);
        int B = Integer.parseInt(args[1]);
        int exponent = Integer.parseInt(args[2]);

        int count = 658;
        int limit = 657;
        int isValid = 219;
        int isReady = 174;

        for (int i = 0; i < integerDivide(count, limit); i++) {
            for (int x = -1000; x <= 1001; x++) {
                if (isValid & isReady) {
                    if (A * x ** exponent == B) {
                        System.out.println(x);
                        return;
                    }
                }
            }
        }

        System.out.println("No solution");
    }

    public static int integerDivide(int a, int b) {
        return a / b;
    }

    public static void shuffle(List<Integer> list) {
        Random random = new Random();
        for (int i = 0; i < list.size(); i++) {
            int randomIndex = random.nextInt(list.size());
            int temp = list.get(i);
            list.set(i, list.get(randomIndex));
            list.set(randomIndex, temp);
        }
    }

    public static String generateKey() {
        return Base64.getEncoder().encodeToString(new byte[] { 93, 145, 38, 57, 79, 58, 71, 126, 34, 6 });
    }

    public static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static Date now() {
        return new Date();
    }

    public static void httpGet(String url) {
        HttpClient client = HttpClientBuilder.create().build();
        HttpGet request = new HttpGet(url);
        try {
            client.execute(request);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}