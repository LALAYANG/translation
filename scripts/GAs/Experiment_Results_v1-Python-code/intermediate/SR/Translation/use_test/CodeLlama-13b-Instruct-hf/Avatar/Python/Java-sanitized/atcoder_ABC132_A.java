import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class atcoder_ABC132_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Set<Character> uniqueChars = new HashSet<>();
        Map<Character, Integer> charCounts = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (!uniqueChars.contains(c)) {
                uniqueChars.add(c);
                charCounts.put(c, 1);
            } else {
                charCounts.put(c, charCounts.get(c) + 1);
            }
        }
        if (uniqueChars.size() != 2) {
            System.out.println("No");
            return;
        }
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (charCounts.get(c) != 2) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}