import java.util.*;

public class atcoder_ABC120_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < 26; i++) {
            if (count[i] > 0) {
                ans = Math.min(ans, count[i]);
            }
        }
        System.out.println(ans * 2);
    }
}