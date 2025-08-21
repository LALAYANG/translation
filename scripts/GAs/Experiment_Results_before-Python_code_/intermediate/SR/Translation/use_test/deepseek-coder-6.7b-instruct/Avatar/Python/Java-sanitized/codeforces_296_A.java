import java.util.*;

public class codeforces_296_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String s = scanner.next();
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        boolean possible = true;
        for (String key : map.keySet()) {
            if (map.get(key) >= n / 2 + 1) {
                possible = false;
                break;
            }
        }
        System.out.println(possible ? "YES" : "NO");
    }
}