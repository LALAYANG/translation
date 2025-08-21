import java.util.*;

public class atcoder_ABC124_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Map<Character, Integer> even = new HashMap<>();
        Map<Character, Integer> odd = new HashMap<>();
        for (int i = 0; i < s.length(); i += 2) {
            char c = s.charAt(i);
            even.put(c, even.getOrDefault(c, 0) + 1);
        }
        for (int i = 1; i < s.length(); i += 2) {
            char c = s.charAt(i);
            odd.put(c, odd.getOrDefault(c, 0) + 1);
        }
        int min = Math.min(s.length() - (even.getOrDefault('0', 0) + odd.getOrDefault('1', 0)), s.length() - (even.getOrDefault('1', 0) + odd.getOrDefault('0', 0)));
        System.out.println(min);
    }
}