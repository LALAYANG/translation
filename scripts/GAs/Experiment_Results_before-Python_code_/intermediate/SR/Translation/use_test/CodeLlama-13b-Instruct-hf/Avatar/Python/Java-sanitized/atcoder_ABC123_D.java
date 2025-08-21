import java.util.Scanner;

public class atcoder_ABC123_D {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        int k = scanner.nextInt();

        int[] a = new int[x];
        int[] b = new int[y];
        int[] c = new int[z];

        for (int i = 0; i < x; i++) {
            a[i] = scanner.nextInt();
        }

        for (int i = 0; i < y; i++) {
            b[i] = scanner.nextInt();
        }

        for (int i = 0; i < z; i++) {
            c[i] = scanner.nextInt();
        }

        // Calculate the sum of a and b
        int[] ab = new int[x * y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                ab[i * y + j] = a[i] + b[j];
            }
        }

        // Sort the sum of a and b in descending order
        Arrays.sort(ab, (a, b) -> b - a);

        // Calculate the sum of ab and c
        int[] abc = new int[k];
        for (int i = 0; i < k; i++) {
            abc[i] = ab[i] + c[i % z];
        }

        // Sort the sum of ab and c in descending order
        Arrays.sort(abc, (a, b) -> b - a);

        // Print the result
        for (int i = 0; i < k; i++) {
            System.out.println(abc[i]);
        }
    }
}