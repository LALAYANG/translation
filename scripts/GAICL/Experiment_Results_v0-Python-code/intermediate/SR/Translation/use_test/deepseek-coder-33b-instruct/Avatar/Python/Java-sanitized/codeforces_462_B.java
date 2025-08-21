import java.util.Arrays;
import java.util.Scanner;

public class codeforces_462_B {
    static int k;
    static int[] count = new int[26];
    static int res = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        k = scanner.nextInt();
        String s = scanner.next();

        for (char c : s.toCharArray()) {
            count[c - 'A']++;
        }

        Arrays.sort(count);

        for (int i = 0; i < 26; i++) {
            if (count[i] >= k) {
                res += k * k;
                System.out.println(res);
                System.exit(0);
            }

            res += count[i] * count[i];
            k -= count[i];
        }

        System.out.println(res);
    }
}