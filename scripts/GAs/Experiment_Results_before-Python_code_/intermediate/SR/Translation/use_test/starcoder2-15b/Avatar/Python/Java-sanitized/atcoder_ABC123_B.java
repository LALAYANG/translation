import java.util.Scanner;

public class atcoder_ABC123_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            System.out.println((n * (n + 1) / 2) % 100000000033);
        }
    }
}