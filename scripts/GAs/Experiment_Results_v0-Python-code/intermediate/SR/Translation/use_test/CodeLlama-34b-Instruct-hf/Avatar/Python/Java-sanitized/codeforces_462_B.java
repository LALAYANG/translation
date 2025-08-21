import java.util.concurrent.ThreadLocalRandom;

public class codeforces_462_B {
    public static void main(String[] args) {
        int n = 100;
        int k = 1;
        String s = "EVEEVEEEGGECFEHEFVFVFHVHEEEEEFCVEEEEEEVFVEEVEEHEEVEFEVVEFEEEFEVECEHGHEEFGEEVCEECCECEFHEVEEEEEEGEEHVH";

        int[] count = new int[26];
        for (char c : s.toCharArray()) {
            count[c - 'A']++;
        }

        int product = 1;
        for (int i = 0; i < 26; i++) {
            product *= count[i];
        }

        int score = 0;
        for (int i = 0; i < 26; i++) {
            if (count[i] >= k) {
                score += k * k;
                break;
            }
            score += count[i] * count[i];
        }

        System.out.println(score);
    }
}