import java.util.Arrays;
import java.util.Scanner;

public class codeforces_462_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.nextLine();
        String input = scanner.nextLine();
        int[] count = new int[26];
        for (char c : input.toCharArray()) {
            count[c - 'A']++;
        }
        Arrays.sort(count);
        int res = 0;
        for (int i = 25; i >= 0 && k > 0; i--) {
            if (count[i] >= k) {
                res += k * k;
                System.out.println(res);
                System.exit(0);
            } else {
                k -= count[i];
                res += count[i] * count[i];
            }
        }
        System.out.println(res);
    }
}