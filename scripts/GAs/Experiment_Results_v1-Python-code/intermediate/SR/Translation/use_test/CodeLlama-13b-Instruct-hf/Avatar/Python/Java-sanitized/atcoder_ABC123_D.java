import java.util.Arrays;
import java.util.Scanner;

public class atcoder_ABC123_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int groupSize = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        int topCount = scanner.nextInt();

        int[] a = new int[groupSize];
        int[] b = new int[y];
        int[] thirdGroup = new int[z];

        for (int i = 0; i < groupSize; i++) {
            a[i] = scanner.nextInt();
        }

        for (int i = 0; i < y; i++) {
            b[i] = scanner.nextInt();
        }

        for (int i = 0; i < z; i++) {
            thirdGroup[i] = scanner.nextInt();
        }

        int[] ab = new int[groupSize * y];
        for (int i = 0; i < groupSize; i++) {
            for (int j = 0; j < y; j++) {
                ab[i * y + j] = a[i] + b[j];
            }
        }

        Arrays.sort(ab);

        int[] abc = new int[topCount];
        for (int i = 0; i < Math.min(topCount, groupSize * y); i++) {
            for (int j = 0; j < z; j++) {
                abc[i] = ab[i] + thirdGroup[j];
            }
        }

        Arrays.sort(abc);

        for (int i = 0; i < topCount; i++) {
            System.out.println(abc[i]);
        }
    }
}