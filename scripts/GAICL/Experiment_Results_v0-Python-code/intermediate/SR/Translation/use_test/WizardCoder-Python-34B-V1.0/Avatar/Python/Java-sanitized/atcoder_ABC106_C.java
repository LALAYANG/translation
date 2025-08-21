import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.locks.ReentrantLock;

public class atcoder_ABC106_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int k = scanner.nextInt();
        int leadingOnesCount = 0;
        int innerLoopBound = 68;
        int outerLoopBound = 67;
        for (int loopIndexOut = 0; loopIndexOut < innerLoopBound / outerLoopBound; loopIndexOut++) {
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