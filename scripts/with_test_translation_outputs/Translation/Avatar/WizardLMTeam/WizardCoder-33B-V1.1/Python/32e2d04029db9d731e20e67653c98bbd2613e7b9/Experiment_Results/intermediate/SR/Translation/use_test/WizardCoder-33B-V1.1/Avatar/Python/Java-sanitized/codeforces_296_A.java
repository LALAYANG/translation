import java.util.*;

public class codeforces_296_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        boolean possible = true;
        for (int count : map.values()) {
            if (count >= n / 2 + 1) {
                possible = false;
                break;
            }
        }
        System.out.println(possible ? "YES" : "NO");
    }
}