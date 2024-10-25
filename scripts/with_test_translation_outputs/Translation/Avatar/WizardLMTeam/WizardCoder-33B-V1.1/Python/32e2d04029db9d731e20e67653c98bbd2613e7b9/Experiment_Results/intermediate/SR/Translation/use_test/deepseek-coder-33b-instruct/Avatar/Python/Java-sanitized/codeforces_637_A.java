import java.util.*;

public class codeforces_637_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] s = scanner.nextLine().split(" ");
        Map<String, Integer> w = new HashMap<>();
        for (String i : s) {
            w.put(i, w.getOrDefault(i, 0) + 1);
        }
        int maxCount = Collections.max(w.values());
        int maxIndex = -1;
        String maxValue = "";
        for (int i = s.length - 1; i >= 0; i--) {
            if (w.get(s[i]) == maxCount && i > maxIndex) {
                maxIndex = i;
                maxValue = s[i];
            }
        }
        System.out.println(maxValue);
    }
}