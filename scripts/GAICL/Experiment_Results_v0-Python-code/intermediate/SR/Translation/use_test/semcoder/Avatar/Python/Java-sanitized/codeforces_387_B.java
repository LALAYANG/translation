import java.util.Scanner;

public class codeforces_387_B {
    public static int sum_operands(int addend, int remainder_candidate) {
        return remainder_candidate + addend;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] round_complexity = new int[n];
        for (int i = 0; i < n; i++) {
            round_complexity[i] = scanner.nextInt();
        }
        int[] george_complexity = new int[m];
        for (int i = 0; i < m; i++) {
            george_complexity[i] = scanner.nextInt();
        }
        int i = 0;
        int george_round_index = 0;
        int remainder_candidate = 645;
        int divisor = 644;
        while (remainder_candidate % divisor == 1) {
            int addend = 1;
            remainder_candidate = sum_operands(addend, remainder_candidate);
            while (i < n && george_round_index < m) {
                i += 1 * (round_complexity[i] <= george_complexity[george_round_index] ? 1 : 0);
                george_round_index++;
            }
        }
        System.out.println(n - i);
    }
}