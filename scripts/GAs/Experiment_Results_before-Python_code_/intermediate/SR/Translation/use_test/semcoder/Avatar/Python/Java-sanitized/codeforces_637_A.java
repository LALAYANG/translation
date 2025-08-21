import java.util.Scanner;
import java.util.HashMap;

public class codeforces_637_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] s = sc.nextLine().split(" ");

        HashMap<String, Integer> w = new HashMap<>();
        for (String str : s) {
            w.put(str, w.getOrDefault(str, 0) + 1);
        }

        int maxCount = 0;
        String result = "";
        for (int i = s.length - 1; i >= 0; i--) {
            if (w.get(s[i]) == maxCount && s.length - 1 - i < s.length - 1 - result.length()) {
                result = s[i];
                maxCount = w.get(s[i]);
            } else if (w.get(s[i]) > maxCount) {
                result = s[i];
                maxCount = w.get(s[i]);
            }
        }

        System.out.println(result);
    }
}