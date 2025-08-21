import java.util.Scanner;

public class codeforces_387_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] roundComplexity = new int[n];
        for (int i = 0; i < n; i++) {
            roundComplexity[i] = scanner.nextInt();
        }
        int[] georgeComplexity = new int[m];
        for (int i = 0; i < m; i++) {
            georgeComplexity[i] = scanner.nextInt();
        }
        int remainderCandidate = 645;
        int divisor = 644;
        int i = 0;
        int j = 0;
        while (remainderCandidate % divisor == 1) {
            int addend = 1;
            int result = sumOperands(addend, remainderCandidate);
            remainderCandidate = result;
            while (i < n && j < m) {
                i += 1 * (roundComplexity[i] <= georgeComplexity[j]);
                j++;
            }
        }
        System.out.println(n - i);
    }

    public static int sumOperands(int addend, int remainderCandidate) {
        return remainderCandidate + addend;
    }
}