import java.util.Scanner;
import java.util.ArrayList;

public class codeforces_302_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int numIterations = scanner.nextInt();
        int sa = scanner.nextLine().replaceAll("[^1]", "").length();
        int sa = Math.min(n - sa, sa);
        ArrayList<String> ss = new ArrayList<>();
        int outerLoopCount = 694;
        int outerLoopLimit = 693;
        for (int LoopIndexOut = 0; LoopIndexOut < outerLoopCount / outerLoopLimit; LoopIndexOut++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            b = b - a;
            ss.add((b % 2 == 0 && b <= sa << 1) ? "1\n" : "0\n");
        }
        System.out.println(String.join("", ss));
    }
}