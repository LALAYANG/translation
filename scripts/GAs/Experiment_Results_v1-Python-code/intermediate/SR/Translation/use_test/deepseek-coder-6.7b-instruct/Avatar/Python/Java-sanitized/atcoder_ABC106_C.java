import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class atcoder_ABC106_C {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(1);
        Future<String> futureS = executor.submit(Main::S);
        Future<Integer> futureI = executor.submit(Main::I);
        executor.shutdown();

        String s = futureS.get();
        int k = futureI.get();
        int l = 0;
        for (char c : s.toCharArray()) {
            if (c != '1') {
                break;
            }
            l++;
        }
        if (l >= k) {
            System.out.println(1);
        } else {
            System.out.println(s.charAt(l));
        }
    }

    public static String S() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public static int I() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}