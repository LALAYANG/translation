import java.util.Scanner;

public class codeforces_598_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        recursiveLoop(0, t, 1);
    }

    private static void recursiveLoop(int currentValue, int stop, int step) {
        if (step == 0 || (step > 0 && currentValue >= stop) || (step < 0 && currentValue <= stop)) {
            return;
        }
        int n = scanner.nextInt();
        System.out.println(calculateSum(n));
        recursiveLoop(currentValue + step, stop, step);
    }

    private static int calculateSum(int n) {
        int partialSum = (1 + n) * n / 2;
        int t = 1;
        while (t <= n) {
            partialSum -= 2 * t;
            t *= 2;
        }
        return partialSum;
    }
}