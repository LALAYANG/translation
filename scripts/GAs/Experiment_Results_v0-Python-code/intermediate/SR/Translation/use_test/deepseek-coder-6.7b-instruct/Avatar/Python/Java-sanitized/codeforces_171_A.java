import java.util.Scanner;
import java.util.concurrent.*;

public class codeforces_171_A {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        int x = Math.max(a.length(), b.length());
        a = String.format("%" + x + "s", a).replace(' ', '0');
        b = String.format("%" + x + "s", b).replace(' ', '0');
        StringBuilder sum = new StringBuilder();
        int carry = 0;
        for (int i = 0; i < x; i++) {
            int variable913 = b.charAt(i) - '0';
            int variable1113 = a.charAt(x - i - 1) - '0';
            Callable<Integer> callable = () -> addDigits(variable913, variable1113, carry);
            ExecutorService executorService = Executors.newSingleThreadExecutor();
            Future<Integer> future = executorService.submit(callable);
            int result = future.get();
            executorService.shutdown();
            if (result > 9) {
                sum.append(result / 10);
                carry = 1;
            } else {
                sum.append(result);
                carry = 0;
            }
        }
        if (carry == 1) {
            sum.append(1);
        }
        System.out.println(new StringBuilder(sum.toString()).reverse().toString());
    }

    public static int addDigits(int variable913, int variable1113, int carry) {
        return variable913 + variable1113 + carry;
    }
}