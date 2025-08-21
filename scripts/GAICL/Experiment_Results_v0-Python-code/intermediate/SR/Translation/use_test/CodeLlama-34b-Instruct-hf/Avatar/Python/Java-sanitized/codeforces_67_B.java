import java.util.Scanner;

public class codeforces_67_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        int m = 0;
        for (int j = 0; j < n; j++) {
            for (int index = 0; index < n; index++) {
                if (m == 0 && numbers[index] == 0) {
                    System.out.print(index + 1 + " ");
                    break;
                }
            }
            for (int l = 0; l < n - k; l++) {
                numbers[l]--;
            }
            numbers[j]--;
        }
    }
}