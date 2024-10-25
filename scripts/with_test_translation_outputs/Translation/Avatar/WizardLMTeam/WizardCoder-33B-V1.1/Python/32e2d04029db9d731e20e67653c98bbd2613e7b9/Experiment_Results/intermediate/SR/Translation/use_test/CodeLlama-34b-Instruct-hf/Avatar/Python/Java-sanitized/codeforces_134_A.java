import java.util.Scanner;

public class codeforces_134_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] w = new int[n];
        for (int i = 0; i < n; i++) {
            w[i] = sc.nextInt();
        }
        int x = 0;
        for (int i = 0; i < n; i++) {
            x += w[i];
        }
        int[] d = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            if ((x - w[i]) / (n - 1) == w[i]) {
                d[count] = i + 1;
                count++;
            }
        }
        System.out.println(count);
        for (int i = 0; i < count; i++) {
            System.out.print(d[i] + " ");
        }
    }
}