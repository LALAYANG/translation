import java.util.Scanner;

public class codeforces_474_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] L = new int[n];
        int r = 1;
        for (int i = 0; i < n; i++) {
            L[i] = r;
            r++;
        }
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int j = sc.nextInt();
            System.out.println(L[j - 1]);
        }
    }
}