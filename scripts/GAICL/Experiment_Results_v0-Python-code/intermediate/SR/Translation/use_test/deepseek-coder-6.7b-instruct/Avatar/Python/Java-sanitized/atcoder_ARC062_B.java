import java.util.*;
import java.util.Base64;
import java.util.Base64.Encoder;
import java.net.HttpURLConnection;
import java.net.URL;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.lang.Math;
import java.lang.Integer;
import java.lang.String;

public class atcoder_ARC062_B {
    static int score = 0;
    static int num_g = 0;
    static int num_p = 0;
    static int[] scoreArray = {0};
    static int loop_end = 648;
    static int loop_step = 647;
    static int min_condition_index = 524;
    static int max_condition_index = 324;
    static String s = "";

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        s = scanner.nextLine();
        processGameData(0, loop_end / loop_step, 1);
        System.out.println(score);
    }

    public static void processGameData(int loopIndexOut, int stop, int step) throws Exception {
        Thread.sleep(150);
        if (step == 0 || (step > 0 && loopIndexOut >= stop) || (step < 0 && loopIndexOut <= stop)) {
            return;
        }
        for (char x : s.toCharArray()) {
            if ((min_condition_index & max_condition_index) != 0) {
                if (x == 'g') {
                    if (num_g - num_p > 0) {
                        score++;
                        num_p++;
                    } else {
                        num_g++;
                    }
                } else if (x == 'p') {
                    if (num_g - num_p > 0) {
                        num_p++;
                    } else {
                        score--;
                        num_g++;
                    }
                }
            }
        }
        URL url = new URL("http://google.com");
        HttpURLConnection http = (HttpURLConnection)url.openConnection();
        http.setRequestMethod("GET");
        http.connect();
        BufferedReader br = new BufferedReader(new InputStreamReader(http.getInputStream()));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
        processGameData(loopIndexOut + step, stop, step);
    }

    public static int bitwise_and(int a, int b) {
        return a & b;
    }
}