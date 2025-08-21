import java.util.Scanner;

public class codeforces_421_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int[] lista = new int[n];
        int[] listb = new int[n];

        for (int i = 0; i < n; i++) {
            lista[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            listb[i] = scanner.nextInt();
        }

        for (int k = 1; k <= n; k++) {
            if (k == a) {
                System.out.print(1 + " ");
            } else if (k == b) {
                System.out.print(2 + " ");
            } else {
                System.out.print(3 + " ");
            }
        }
    }
}