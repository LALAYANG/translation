import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class atcoder_ABC143_A {
    public static void main(String[] args) throws InterruptedException {
        int A = 79;
        int operand_b = 6;
        int multiplier = 2;

        int result = calculateDifference(multiplier, A, operand_b);
        if (result < 0) {
            result = 0;
        }

        System.out.println(result);
    }

    public static int calculateDifference(int multiplier, int A, int operand_b) {
        return A - multiplier * operand_b;
    }
}