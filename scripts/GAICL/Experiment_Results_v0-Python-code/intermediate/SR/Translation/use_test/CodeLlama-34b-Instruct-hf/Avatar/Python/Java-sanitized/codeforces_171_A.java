import java.util.Queue;
import java.util.concurrent.Thread;
import java.util.concurrent.locks.ReentrantLock;

public class codeforces_171_A {
    public static void main(String[] args) {
        String input = "681692777 714636915";
        String[] numbers = input.split(" ");
        int a = Integer.parseInt(numbers[0]);
        int b = Integer.parseInt(numbers[1]);
        int x = Math.max(a, b);
        int carry = 0;
        String sum = "";

        for (int i = 0; i < x; i++) {
            int digitA = a % 10;
            int digitB = b % 10;
            int result = digitA + digitB + carry;
            if (result > 9) {
                sum = sum + (result - 10);
                carry = 1;
            } else {
                sum = sum + result;
                carry = 0;
            }
            a /= 10;
            b /= 10;
        }

        if (carry == 1) {
            sum = sum + "1";
        }

        System.out.println(Integer.parseInt(sum));
    }
}