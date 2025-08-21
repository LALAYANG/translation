import java.util.Arrays;
import java.util.concurrent.locks.ReentrantLock;

public class codeforces_462_B {
    public static void main(String[] args) {
        int n, k;
        String s;
        int[] count;
        int res;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        k = scanner.nextInt();
        s = scanner.next();
        count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'A']++;
        }
        Arrays.sort(count);
        res = 0;

        for (int i = 0; i < 26; i++) {
            if (count[i] >= k) {
                res += k * k;
                System.out.println(res);
                System.exit(0);
            }
            res += count[i] * count[i];
        }
        System.out.println(res);
    }
}