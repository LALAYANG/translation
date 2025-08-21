import java.util.Scanner;

public class atcoder_ABC142_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int t = 0;
        for (int i = 0; i < n; i++) {
            if ((i + 1) % 2 != 0) {
                t++;
            }
        }
        System.out.printf("%.10f", (double) t / n);
    }
}