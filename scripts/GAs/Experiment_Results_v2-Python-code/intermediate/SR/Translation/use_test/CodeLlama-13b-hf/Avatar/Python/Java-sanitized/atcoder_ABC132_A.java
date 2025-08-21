import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class atcoder_ABC132_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        Set<Character> Sa = new HashSet<>(Arrays.asList(S.toCharArray()));
        if (Sa.size() != 2) {
            System.out.println("No");
            return;
        }
        Map<Character, Integer> c = new HashMap<>();
        for (int i = 0; i < S.length(); i++) {
            c.put(S.charAt(i), c.getOrDefault(S.charAt(i), 0) + 1);
        }
        for (int i = 0; i < S.length(); i++) {
            if (c.get(S.charAt(i)) != 2) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}