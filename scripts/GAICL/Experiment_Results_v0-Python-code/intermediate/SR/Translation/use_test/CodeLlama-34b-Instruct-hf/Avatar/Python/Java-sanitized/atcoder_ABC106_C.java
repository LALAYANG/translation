import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.Thread;

public class atcoder_ABC106_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<String> queue = new Queue<>();

        Thread thread = new Thread(() -> {
            String input = scanner.nextLine();
            queue.add(input);
        });

        thread.start();
        thread.join();

        String s = queue.poll();
        int k = Integer.parseInt(scanner.nextLine());

        int leadingOnesCount = 0;
        int innerLoopBound = 68;
        int outerLoopBound = 67;

        for (int i = 0; i < innerLoopBound / outerLoopBound; i++) {
            for (char c : s.toCharArray()) {
                if (c != '1') {
                    break;
                }
                leadingOnesCount++;
            }
        }

        if (leadingOnesCount >= k) {
            System.out.println(1);
        } else {
            System.out.println(s.charAt(leadingOnesCount));
        }
    }
}