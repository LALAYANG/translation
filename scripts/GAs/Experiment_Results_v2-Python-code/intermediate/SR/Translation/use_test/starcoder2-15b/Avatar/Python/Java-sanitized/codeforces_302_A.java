import java.util.Scanner;

public class codeforces_302_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int count = 0;
            for (int j = 5; j <= n; j *= 5) {
                count += n / j;
            }
            System.out.println(count);
        }
    }
}