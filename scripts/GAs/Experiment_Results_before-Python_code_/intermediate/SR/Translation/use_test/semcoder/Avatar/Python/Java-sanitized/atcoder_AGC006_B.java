import java.util.Scanner;

public class atcoder_AGC006_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();

        if (X == 1 || X == N * 2 - 1) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
            if (X == N * 2 - 2) {
                for (int i = N - 1; i < X + 2; i++) {
                    System.out.println(i);
                }
                for (int i = 1; i < N - 1; i++) {
                    System.out.println(i);
                }
            } else {
                for (int i = 1; i < X - 1; i++) {
                    System.out.println(i);
                }
                for (int i = X + 3; i < N * 2; i++) {
                    System.out.println(i);
                }
                System.out.println(X + 2);
                System.out.println(X - 1);
                System.out.println(X);
                System.out.println(X + 1);
            }
        }
    }
}