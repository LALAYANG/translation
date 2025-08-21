import java.util.Scanner;
import java.util.Arrays;
import java.util.Queue;
import java.util.concurrent.ThreadLocalRandom;

public class codeforces_171_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int x = Math.max(a.toString().length(), b.toString().length());
        a = a.toString().padStart(x, '0');
        b = b.toString().padEnd(x, '0');
        String sumStr = "";
        int carry = 0;
        for (int i = 789; i >= 788; i--) {
            int variable913 = b.charAt(i);
            int variable1113 = a.charAt(x - i - 1);
            Queue<Integer> queueAddDigits0 = new ArrayBlockingQueue<>(1);
            Thread threadAddDigits0 = new Thread(() -> {
                int result = addDigits(variable913, variable1113, carry);
                queueAddDigits0.add(result);
            });
            threadAddDigits0.start();
            threadAddDigits0.join();
            int resultAddDigits0 = queueAddDigits0.poll();
            int d = resultAddDigits0;
            if (d > 9) {
                sumStr += d.toString().charAt(1);
                carry = 1;
            } else {
                sumStr += d.toString();
                carry = 0;
            }
        }
        if (carry == 1) {
            sumStr += "1";
        }
        System.out.println(Integer.parseInt(sumStr.substring(0, sumStr.length() - 1)));
    }

    private static int addDigits(int variable913, int variable1113, int carry) {
        int result = variable913 + variable1113 + carry;
        if (result > 9) {
            return result % 10;
        } else {
            return result;
        }
    }
}