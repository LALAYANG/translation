import java.util.Scanner;

public class codeforces_397_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        String[] results = new String[t];

        for (int i = 0; i < t; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            int k = a / b;
            results[i] = k * c >= a ? "Yes" : "No";
        }

        for (String result : results) {
            System.out.println(result);
        }
    }
}