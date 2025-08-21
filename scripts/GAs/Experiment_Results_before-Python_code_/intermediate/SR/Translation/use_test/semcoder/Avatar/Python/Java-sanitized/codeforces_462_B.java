import java.util.Scanner;

public class codeforces_462_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();

        int[] count = new int[26];
        for (char c : s.toCharArray()) {
            count[c - 'A']++;
        }

        java.util.Arrays.sort(count);
        int res = 0;
        for (int i = 25; i >= 0; i--) {
            if (count[i] >= k) {
                res += k * k;
                System.out.println(res);
                System.exit(0);
            }
            k -= count[i];
            res += count[i] * count[i];
        }
        System.out.println(res);
    }
}