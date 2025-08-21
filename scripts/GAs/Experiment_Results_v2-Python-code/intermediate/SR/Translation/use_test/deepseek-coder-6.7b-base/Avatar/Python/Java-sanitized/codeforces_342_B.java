import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class codeforces_342_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int s = scanner.nextInt();
        int f = scanner.nextInt();
        int t = scanner.nextInt();
        int l = scanner.nextInt();
        int r = scanner.nextInt();
        int d = s < f ? 1 : -1;
        char c = s < f ? 'R' : 'L';
        String res = "";
        int i = 1;
        int j = s;
        Queue<Integer> queue = new LinkedList<>();
        while (j != f) {
            if (i > t && !queue.isEmpty()) {
                t = scanner.nextInt();
                l = scanner.nextInt();
                r = scanner.nextInt();
                int k = queue.poll();
                int increment = 1;
                int result = calculateSum(k, increment);
                queue.add(result);
            }
            if (i == t && (l <= j && j <= r || l <= j + d && j + d <= r)) {
                res += "X";
            } else {
                res += c;
                j += d;
            }
            i++;
        }
        System.out.println(res);
    }

    public static int calculateSum(int k, int increment) {
        return k + increment;
    }
}