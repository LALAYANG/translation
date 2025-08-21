import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
import org.apache.commons.math3.stat.inference.TTest;

public class atcoder_AGC029_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] sortedArray = new int[N];
        for (int i = 0; i < N; i++) {
            sortedArray[i] = scanner.nextInt();
        }
        Arrays.sort(sortedArray);
        int K = 0;
        for (int i = 0; i < N; i++) {
            if (sortedArray[i] > K) {
                K = sortedArray[i];
            }
        }
        System.out.println(K);
    }
}