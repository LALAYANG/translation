import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;

public class atcoder_ABC132_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Set<Character> set = new HashSet<>();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (!set.contains(c)) {
                set.add(c);
                map.put(c, 1);
            } else {
                map.put(c, map.get(c) + 1);
            }
        }
        if (set.size() != 2) {
            System.out.println("No");
            return;
        }
        for (char c : set) {
            if (map.get(c) != 2) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}