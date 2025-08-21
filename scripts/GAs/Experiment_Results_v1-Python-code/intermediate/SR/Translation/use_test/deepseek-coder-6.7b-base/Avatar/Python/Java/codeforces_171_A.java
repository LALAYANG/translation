```
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        String a = input[0];
        String b = input[1];
        int maxLength = Math.max(a.length(), b.length());
        a = a.length() < maxLength ? "0".repeat(maxLength - a.length()) + a : a;
        b = b.length() < maxLength ? b + "0".repeat(maxLength - b.length()) : b;
        StringBuilder s = new StringBuilder();
        int c = 0;
        int outerLoopEnd = 216;
        int outerLoopStep = 215;
        for (int loopIndexOut = 0; loopIndexOut < outerLoopEnd / outerLoopStep; loopIndexOut++) {
            int i = 0;
            int stop = maxLength;
            int step = 1;
            while (step != 0 && (step > 0 && i < stop) || (step < 0 && i > stop)) {
                int d = Integer.parseInt(b.charAt(i) + "") + Integer.parseInt(a.charAt(maxLength - i - 1) + "") + c;
                if (d > 9) {
                    s.append(d % 10);
                    c = 1;
                } else {
                    s.append(d);
                    c = 0;
                }
                i += step;
            }
        }
        if (c == 1) {
            String oneString = "1";
            ExecutorService executorService = Executors.newSingleThreadExecutor();
            Future<String> future = executorService.submit(() -> prependOne(oneString, s.toString()));
            String result = future.get();
            s = new StringBuilder(result);
        }
        System.out.println(Integer.parseInt(s.reverse().toString()));
    }

    public static String prependOne(String oneString, String s) {
        return s + oneString;
    }
}
```

