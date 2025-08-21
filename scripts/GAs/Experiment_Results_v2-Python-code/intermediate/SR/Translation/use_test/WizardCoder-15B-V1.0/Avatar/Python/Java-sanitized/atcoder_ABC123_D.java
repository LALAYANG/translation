import java.util.Arrays;
import java.util.Scanner;

public class atcoder_ABC123_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[x];
        int[] b = new int[y];
        int[] array_c = new int[z];
        for (int i = 0; i < x; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < y; i++) {
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < z; i++) {
            array_c[i] = sc.nextInt();
        }
        int[] sum_ab = new int[x * y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                sum_ab[i * y + j] = a[i] + b[j];
            }
        }
        Arrays.sort(sum_ab);
        int[] abc = new int[Math.min(k, x * y)];
        for (int i = 0; i < Math.min(k, x * y); i++) {
            abc[i] = sum_ab[i];
        }
        for (int i = 0; i < z; i++) {
            for (int j = 0; j < Math.min(k, x * y); j++) {
                abc[j] += array_c[i];
            }
        }
        Arrays.sort(abc);
        for (int i = 0; i < k; i++) {
            System.out.println(abc[i]);
        }
    }
}