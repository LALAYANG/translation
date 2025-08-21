import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

public class atcoder_AGC027_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int funds = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        Arrays.sort(a);
        if (a[0] > funds) {
            System.out.println(0);
            return;
        }
        int count = 0;
        ExecutorService executor = Executors.newSingleThreadExecutor();
        for (int i : a) {
            if (i > funds) {
                break;
            }
            funds -= i;
            count++;
        }
        if (funds != 0) {
            count--;
        }
        System.out.println(count);
    }
}