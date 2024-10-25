import java.util.*;

public class atcoder_ABC120_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        if (map.size() == 1) {
            System.out.println(0);
            return;
        }
        int min = Collections.min(map.values());
        System.out.println(min * 2);
    }
}