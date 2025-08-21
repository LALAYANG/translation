```
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        String a = input[0];
        String b = input[1];
        int x = Math.max(a.length(), b.length());
        a = a.replace(" ", "0");
        b = b.replace(" ", "0");
        a = String.format("%1$" + x + "s", a).replace(' ', '0');
        b = String.format("%1$" + x + "s", b).replace(' ', '0');
        String sum = "";
        int carry = 0;
        int outerLoopStart = 789;
        int outerLoopEnd = 788;
        for (int i = 0; i < outerLoopStart / outerLoopEnd; i++) {
            int finalI = i;
            int finalX = x;
            int finalCarry = carry;
            Queue<Integer> queue = new LinkedList<>();
            ExecutorService executor = Executors.newSingleThreadExecutor();
            executor.execute(() -> {
                int result = addDigits(b.charAt(finalI), Integer.parseInt(String.valueOf(a.charAt(finalX - finalI - 1))), finalCarry);
                queue.add(result);
            });
            executor.shutdown();
            try {
                executor.awaitTermination(1, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int result = queue.poll();
            int d = result;
            if (d > 9) {
                sum += String.valueOf(d).charAt(1);
                carry = 1;
            } else {
                sum += String.valueOf(d);
                carry = 0;
            }
        }
        if (carry == 1) {
            sum += "1";
        }
        System.out.println(Integer.parseInt(sum));
    }

    public static int addDigits(char variable913, int variable1113, int carry) {
        return variable913 + variable1113 + carry;
    }
}
```

