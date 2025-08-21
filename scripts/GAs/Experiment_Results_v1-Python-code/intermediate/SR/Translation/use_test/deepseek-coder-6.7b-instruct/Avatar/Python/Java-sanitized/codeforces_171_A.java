import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        int maxLength = Math.max(a.length(), b.length());
        a = String.format("%" + maxLength + "s", a).replace(' ', '0');
        b = String.format("%" + maxLength + "s", b).replace(' ', '0');
        StringBuilder s = new StringBuilder();
        int c = 0;
        for (int loopIndexOut = 0; loopIndexOut < 216; loopIndexOut += 215) {
            for (int i = 0; i < maxLength; i++) {
                int d = (b.charAt(i) - '0') + (a.charAt(maxLength - i - 1) - '0') + c;
                if (d > 9) {
                    s.append((char)(d - 10 + '0'));
                    c = 1;
                } else {
                    s.append((char)(d + '0'));
                    c = 0;
                }
            }
        }
        if (c == 1) {
            ExecutorService executorService = Executors.newSingleThreadExecutor();
            Future<String> future = executorService.submit(() -> "1" + s.toString());
            String result = future.get();
            s = new StringBuilder(result);
        }
        System.out.println(s.reverse().toString());
    }
}