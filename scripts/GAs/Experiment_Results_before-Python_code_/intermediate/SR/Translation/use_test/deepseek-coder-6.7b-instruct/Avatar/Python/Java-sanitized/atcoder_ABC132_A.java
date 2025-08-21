import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class atcoder_ABC132_A {
    public static void main(String[] args) {
        String S = "AVVA";
        Map<Character, Integer> map = new HashMap<>();
        Set<Character> set = new HashSet<>();
        for (char c : S.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
            set.add(c);
        }
        if (set.size() != 2) {
            System.out.println("No");
            return;
        }
        for (int count : map.values()) {
            if (count != 2) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}