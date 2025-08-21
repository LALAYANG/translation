import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class codeforces_462_B {

    public static void main(String[] args) {
        int n = 100;
        int k = 1;
        String s = "EVEEVEEEGGECFEHEFVFVFHVHEEEEEFCVEEEEEEVFVEEVEEHEEVEFEVVEFEEEFEVECEHGHEEFGEEVCEECCECEFHEVEEEEEEGEEHVH";
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'A']++;
        }
        int res = 0;
        for (int i = 0; i < 26; i++) {
            if (count[i] >= k) {
                res += k * k;
                System.out.println(res);
                return;
            }
            k -= count[i];
            res += count[i] * count[i];
        }
        System.out.println(res);
    }
}