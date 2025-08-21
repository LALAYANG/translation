import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class codeforces_190_A {
    public static void main(String[] args) {
        int n = 16;
        int second_number = 70;

        int result = calculateSumDifference(n, second_number);
        System.out.println(result);
    }

    public static int calculateSumDifference(int n, int second_number) {
        return n + second_number;
    }
}