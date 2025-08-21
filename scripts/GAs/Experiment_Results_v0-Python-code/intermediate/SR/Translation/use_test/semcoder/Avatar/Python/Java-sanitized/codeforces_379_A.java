import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.Scanner;

class Decorator {
    public static <T extends Runnable> T myDecorator(T func) {
        return func;
    }
}

class AddNumbers implements Runnable {
    private int variable_3_10;
    private int dividend;

    public AddNumbers(int variable_3_10, int dividend) {
        this.variable_3_10 = variable_3_10;
        this.dividend = dividend;
    }

    @Override
    public void run() {
        int result = dividend + variable_3_10;
        System.out.println(result);
    }
}

public class codeforces_379_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int candeleIntere = scanner.nextInt();
        int b = scanner.nextInt();

        int s = 0;
        int restoSciolte = 0;
        int dividend = 122;
        int divisor = 121;

        while (dividend % divisor == 1) {
            int variable_3_10 = 1;
            Queue<Integer> resultQueue = new ConcurrentLinkedQueue<>();

            Runnable addNumbersThread = new AddNumbers(variable_3_10, dividend);
            Decorator.myDecorator(addNumbersThread).run();

            dividend = resultQueue.poll();

            while (candeleIntere > 0 || restoSciolte >= b) {
                candeleIntere += restoSciolte / b;
                restoSciolte %= b;
                s += candeleIntere;
                restoSciolte += candeleIntere % b;
                candeleIntere /= b;
            }
        }

        System.out.println(s);
    }
}