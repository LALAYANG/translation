import java.util.Scanner;

public class codeforces_474_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] L = new int[n];
        int r = 1;
        for (int i = 0; i < n; i++) {
            L[i] = r;
            r++;
        }
        int m = scanner.nextInt();
        for (int i = 0; i < m; i++) {
            int j = scanner.nextInt();
            System.out.println(L[j - 1]);
        }
    }
}