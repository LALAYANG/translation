import java.util.Scanner;

public class codeforces_25_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] list = new int[n];
        for (int i = 0; i < n; i++) {
            list[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += list[i] % 2;
        }
        if (sum == 1) {
            for (int i = 0; i < n; i++) {
                if (list[i] % 2 == 1) {
                    System.out.println(i + 1);
                    break;
                }
            }
        } else {
            for (int i = 0; i < n; i++) {
                if (list[i] % 2 == 0) {
                    System.out.println(i + 1);
                    break;
                }
            }
        }
    }
}