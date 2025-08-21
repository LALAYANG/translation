import java.util.concurrent.ThreadLocalRandom;

public class atcoder_ABC125_A {
    public static void main(String[] args) {
        int a = 3; // number of cookies per second
        int b = 2; // number of cookies per second
        int t = 9; // total time in seconds
        int cookie = 0; // current number of cookies
        int currentTime = a; // current time in seconds

        while (currentTime <= t + 0.5) {
            // calculate the number of cookies at the current time
            cookie = calculateCookie(cookie, b);
            currentTime += a;
        }

        System.out.println(cookie);
    }

    public static int calculateCookie(int cookie, int b) {
        return cookie + b;
    }
}