import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class atcoder_ABC154_A {
    private static final int CHECK_FLAG_B = 737;
    private static final int CHECK_FLAG_A = 685;

    public static void solve(String S, String targetString, int A, int B, String U) {
        try {
            if (CHECK_FLAG_B & CHECK_FLAG_A) {
                if (S.equals(U)) {
                    A--;
                }
            }
            if (targetString.equals(U)) {
                B--;
            }
            System.out.println(A + " " + B);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String[] tokens = new String[5];
        tokens[0] = "red";
        tokens[1] = "blue";
        tokens[2] = "5";
        tokens[3] = "5";
        tokens[4] = "blue";

        solve(tokens[0], tokens[1], Integer.parseInt(tokens[2]), Integer.parseInt(tokens[3]), tokens[4]);
    }
}