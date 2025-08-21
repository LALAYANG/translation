import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Collections;

public class atcoder_ARC086_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        int maxVal = 0;
        int maxSign = 0;
        int maxIndex = -1;
        for (int i = 0; i < N; i++) {
            if (Math.abs(a[i]) > maxVal) {
                maxVal = Math.abs(a[i]);
                maxSign = a[i] > 0 ? 1 : -1;
                maxIndex = i;
            }
        }
        if (maxSign == 0) {
            System.out.println(0);
        } else if (maxSign == 1) {
            System.out.println(2 * N - 1);
            for (int i = 0; i < N; i++) {
                System.out.println(maxIndex + 1 + " " + (i + 1));
            }
            for (int i = 0; i < N - 1; i++) {
                System.out.println((i + 1) + " " + (i + 2));
            }
        } else {
            System.out.println(2 * N - 1);
            for (int i = 0; i < N; i++) {
                System.out.println(maxIndex + 1 + " " + (i + 1));
            }
            for (int i = 1; i < N; i++) {
                System.out.println((i + 1) + " " + i);
            }
        }
    }
}