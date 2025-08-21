import java.util.*;

public class atcoder_ABC120_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (new HashSet<>(s.toCharArray()).size() == 1) {
            System.out.println(0);
            return;
        }
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int ans = Integer.MAX_VALUE;
        for (int val : map.values()) {
            ans = Math.min(ans, val * 2);
        }
        System.out.println(ans);
    }
}