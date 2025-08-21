import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class atcoder_ARC086_B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int max = 0;
        int maxIndex = -1;
        for (int i = 0; i < n; i++) {
            if (Math.abs(a[i]) > max) {
                max = Math.abs(a[i]);
                maxIndex = i;
            }
        }
        if (max == 0) {
            System.out.println(0);
        } else if (a[maxIndex] > 0) {
            System.out.println(2 * n - 1);
            for (int i = 0; i < n; i++) {
                System.out.println(maxIndex + 1 + " " + (i + 1));
            }
            for (int i = 0; i < n - 1; i++) {
                System.out.println((i + 1) + " " + (i + 2));
            }
        } else {
            System.out.println(2 * n - 1);
            for (int i = 0; i < n; i++) {
                System.out.println(maxIndex + 1 + " " + (i + 1));
            }
            for (int i = 1; i < n; i++) {
                System.out.println((i + 1) + " " + i);
            }
        }
    }
}