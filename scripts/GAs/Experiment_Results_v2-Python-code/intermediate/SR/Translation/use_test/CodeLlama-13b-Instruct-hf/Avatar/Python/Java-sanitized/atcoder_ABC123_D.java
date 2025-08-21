import java.util.Arrays;
import java.util.Scanner;

public class atcoder_ABC123_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        int k = scanner.nextInt();
        int[] a = new int[x];
        int[] b = new int[y];
        int[] array_c = new int[z];
        for (int i = 0; i < x; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < y; i++) {
            b[i] = scanner.nextInt();
        }
        for (int i = 0; i < z; i++) {
            array_c[i] = scanner.nextInt();
        }
        int[] sum_ab = new int[x * y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                sum_ab[i * y + j] = a[i] + b[j];
            }
        }
        Arrays.sort(sum_ab);
        int[] abc = new int[Math.min(k, x * y)];
        for (int i = 0; i < abc.length; i++) {
            for (int j = 0; j < z; j++) {
                abc[i] = sum_ab[i] + array_c[j];
            }
        }
        Arrays.sort(abc);
        for (int i = 0; i < k; i++) {
            System.out.println(abc[i]);
        }
    }
}