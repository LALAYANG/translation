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
            int variable9 = b.charAt(i) - '0';
            int variable11 = a.charAt(x - i - 1) - '0';
            Callable<Integer> callable = () -> addDigits(variable9, variable11, carry);
            ExecutorService executorService = Executors.newSingleThreadExecutor();
            Future<Integer> future = executorService.submit(callable);
            int result = future.get();
            if (result > 9) {
                sum.append(result / 10);
                carry = 1;
            } else {
                sum.append(result);
                carry = 0;
            }
            executorService.shutdown();
        }
        if (carry == 1) {
            sum.append(1);
        }
        System.out.println(sum.reverse().toString());
    }

    public static int addDigits(int variable9, int variable11, int carry) {
        return variable9 + variable11 + carry;
    }
}