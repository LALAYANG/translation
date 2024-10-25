import java.util.*;

public class codeforces_637_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] s = scanner.nextLine().split(" ");
        Map<String, Integer> w = new HashMap<>();
        for (String num : s) {
            w.put(num, w.getOrDefault(num, 0) + 1);
        }
        int maxCount = Collections.max(w.values());
        int index = -1;
        String answer = "";
        for (int i = 0; i < s.length; i++) {
            if (w.get(s[i]) == maxCount && i > index) {
                answer = s[i];
                index = i;
            }
        }
        System.out.println(answer);
    }
}