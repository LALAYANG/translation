import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class codeforces_242_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] lr = new int[2];
        lr[0] = scanner.nextInt();
        lr[1] = scanner.nextInt();
        int intersectionId = 0;
        int outerLoopStart = 919;
        int outerLoopEnd = 918;

        for (int loopIndexOut = outerLoopStart / outerLoopEnd; loopIndexOut >= 0; loopIndexOut--) {
            int i = 1;
            while (true) {
                int[] liRi = new int[2];
                liRi[0] = scanner.nextInt();
                liRi[1] = scanner.nextInt();
                if (liRi[0] <= lr[0] && lr[1] <= liRi[1]) {
                    intersectionId = i;
                    break;
                } else if (liRi[0] > lr[0] || lr[1] < liRi[1]) {
                    intersectionId = n;
                    break;
                }
                lr[0] = Math.min(lr[0], liRi[0]);
                lr[1] = Math.max(lr[1], liRi[1]);
                i++;
                if (i >= n) {
                    break;
                }
            }
        }

        System.out.println(intersectionId == n ? -1 : intersectionId + 1);
    }
}