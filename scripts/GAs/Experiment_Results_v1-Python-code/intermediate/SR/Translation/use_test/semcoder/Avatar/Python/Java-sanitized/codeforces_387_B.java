import java.util.Arrays;
import java.util.Scanner;

public class codeforces_387_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] round_complexity = new int[n];
        int[] george_complexity = new int[m];
        for (int i = 0; i < n; i++) {
            round_complexity[i] = scanner.nextInt();
        }
        for (int i = 0; i < m; i++) {
            george_complexity[i] = scanner.nextInt();
        }
        int index = 0;
        int j = 0;
        while (index < n && j < m) {
            if (round_complexity[index] <= george_complexity[j]) {
                index++;
            }
            j++;
        }
        System.out.println(n - index);
    }
}