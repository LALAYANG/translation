import java.util.concurrent.ThreadLocalRandom;

public class atcoder_ABC178_A {
    public static void main(String[] args) {
        int testCase = 1;
        int tcs = 1;
        while (testCase <= tcs) {
            int a = Integer.parseInt(System.console().readLine().strip());
            if (a == 0) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
            testCase++;
        }
    }
}