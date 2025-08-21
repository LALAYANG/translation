import java.util.Scanner;

public class atcoder_ABC171_E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }

        int total = 0;
        for (int i = 0; i < N; i++) {
            total ^= a[i];
        }

        for (int i = 0; i < N; i++) {
            a[i] ^= total;
        }

        for (int i = 0; i < N; i++) {
            System.out.print(a[i] + " ");
        }
    }
}