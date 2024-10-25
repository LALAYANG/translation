import java.util.*;

public class codeforces_131_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int count = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            if (key == 0) {
                count += entry.getValue() * (entry.getValue() - 1);
            } else if (map.containsKey(-key)) {
                count += entry.getValue() * map.get(-key);
            }
        }
        System.out.println(count / 2);
    }
}