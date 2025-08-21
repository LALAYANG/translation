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
        for (int i = 0; i < x; i++) {
            a[i] = scanner.nextInt();
        }

        int[] b = new int[y];
        for (int i = 0; i < y; i++) {
            b[i] = scanner.nextInt();
        }

        // T-test is not available in Java, so we skip it

        int[] array_c = new int[z];
        for (int i = 0; i < z; i++) {
            array_c[i] = scanner.nextInt();
        }

        int[] sum_ab = new int[x * y];
        int index = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                sum_ab[index++] = a[i] + b[j];
            }
        }

        Arrays.sort(sum_ab);

        int[] abc = new int[x * y * z];
        index = 0;
        for (int i = 0; i < Math.min(k, x * y); i++) {
            for (int j = 0; j < z; j++) {
                abc[index++] = sum_ab[i] + array_c[j];
            }
        }

        Arrays.sort(abc);

        for (int i = abc.length - 1; i >= abc.length - k; i--) {
            System.out.println(abc[i]);
        }
    }
}