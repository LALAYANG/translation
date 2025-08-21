import java.util.Scanner;

public class codeforces_272_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] sequence = new int[n];
        for (int i = 0; i < n; i++) {
            sequence[i] = scanner.nextInt();
        }
        System.out.println(nPairsWithCommonFX(sequence));
    }

    public static int nPairsWithCommonFX(int[] sequence) {
        int[] FXs = new int[sequence.length];
        for (int i = 0; i < sequence.length; i++) {
            FXs[i] = f(sequence[i]);
        }
        int[] storage = new int[FXs.length];
        for (int i = 0; i < FXs.length; i++) {
            if (storage[FXs[i]] == null) {
                storage[FXs[i]] = 1;
            } else {
                storage[FXs[i]]++;
            }
        }
        int sum = 0;
        for (int i = 0; i < FXs.length; i++) {
            sum += storage[FXs[i]] * storage[FXs[i]];
        }
        return sum - FXs.length;
    }

    public static int f(int n) {
        int y = 1;
        while (n != 1) {
            if (n % 2 == 1) {
                y++;
            }
            n /= 2;
        }
        return y;
    }
}