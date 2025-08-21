import java.util.Scanner;

public class codeforces_546_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int w = sc.nextInt();
        int n = sc.nextInt();
        int total = 0;
        for (int i = 1; i <= w; i++) {
            total += i * k;
        }
        if (total > n) {
            System.out.println(total - n);
        } else {
            System.out.println(0);
        }
    }
}