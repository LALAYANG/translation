import java.util.Scanner;

public class codeforces_146_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] number = new int[n];
        for (int i = 0; i < n; i++) {
            number[i] = sc.nextInt();
        }

        int h1 = 0;
        int h2 = 0;
        for (int i = 0; i < n / 2; i++) {
            h1 += number[i];
        }
        for (int i = n / 2; i < n; i++) {
            h2 += number[i];
        }

        if (h1 == h2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}