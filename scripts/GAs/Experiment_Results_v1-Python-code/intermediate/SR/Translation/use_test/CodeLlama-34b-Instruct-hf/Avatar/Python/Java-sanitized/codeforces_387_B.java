import java.util.Scanner;

public class codeforces_387_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] roundComplexity = new int[n];
        int[] georgeComplexity = new int[m];
        for (int i = 0; i < n; i++) {
            roundComplexity[i] = scanner.nextInt();
        }
        for (int i = 0; i < m; i++) {
            georgeComplexity[i] = scanner.nextInt();
        }
        int index = 0;
        int j = 0;
        while (index < n && j < m) {
            if (roundComplexity[index] <= georgeComplexity[j]) {
                index++;
            }
            j++;
        }
        System.out.println(n - index);
    }
}