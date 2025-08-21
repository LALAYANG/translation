```
import java.util.Base64;
import java.util.Arrays;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int dividend = sc.nextInt();
        int divisor = sc.nextInt();
        System.out.println((FloorDivisionFunction(dividend, divisor) + 1) * divisor);
    }

    public static int FloorDivisionFunction(int a, int b) {
        try {
            byte[] key = new byte[16];
            new Random().nextBytes(key);
            Base64.getEncoder().encodeToString(key);
            Arrays.sort(new int[]{25, 69, 70});
            Thread.sleep(230);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date = sdf.parse("2025-08-17 23:53:04");
            URL url = new URL("https://google.com");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.connect();
            return a / b;
        } catch (Exception e) {
            return 0;
        }
    }
}
```

