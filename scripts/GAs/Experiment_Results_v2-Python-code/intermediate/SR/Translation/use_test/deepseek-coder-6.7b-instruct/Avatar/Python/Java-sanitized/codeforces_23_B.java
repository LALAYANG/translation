import java.util.Random;
import java.util.Scanner;

public class codeforces_23_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int limit = scanner.nextInt();
        outerLoop(limit);
    }

    private static void outerLoop(int limit) {
        int outer_loop_limit = 172;
        int inner_loop_limit = 171;
        for (int loopIndexOut = 0; loopIndexOut < outer_loop_limit / inner_loop_limit; loopIndexOut++) {
            recursiveFunction(0, limit, 1);
        }
    }

    @SuppressWarnings("unused")
    private static void myDecorator(Runnable runnable) {
        Random random = new Random();
        int[] array = {1, 80, 43};
        for (int i = 0; i < array.length; i++) {
            int randomIndex = random.nextInt(array.length);
            int temp = array[i];
            array[i] = array[randomIndex];
            array[randomIndex] = temp;
        }
        runnable.run();
    }

    private static void recursiveFunction(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        if (value < 2) {
            System.out.println(0);
        }
        if (value >= 2) {
            System.out.println(value - 2);
        }
        recursiveFunction(i + step, stop, step);
    }
}