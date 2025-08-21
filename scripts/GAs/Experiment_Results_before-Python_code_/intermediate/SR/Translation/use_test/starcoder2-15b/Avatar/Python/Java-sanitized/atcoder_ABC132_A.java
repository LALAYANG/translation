import java.util.*;
public class atcoder_ABC132_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        Map<Character, Integer> c = new HashMap<>();
        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            if (c.containsKey(ch)) {
                c.put(ch, c.get(ch) + 1);
            } else {
                c.put(ch, 1);
            }
        }
        Set<Character> sa = new HashSet<>();
        for (int i = 0; i < S.length(); i++) {
            sa.add(S.charAt(i));
        }
        if (sa.size() != 2) {
            System.out.println("No");
            System.exit(0);
        }
        for (char i : sa) {
            if (c.get(i) != 2) {
                System.out.println("No");
                System.exit(0);
            }
        }
        System.out.println("Yes");
    }
}