import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;

public class atcoder_ABC132_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        Map<Character, Integer> countMap = new HashMap<>();
        for (char c : input.toCharArray()) {
            if (!countMap.containsKey(c)) {
                countMap.put(c, 1);
            } else {
                countMap.put(c, countMap.get(c) + 1);
            }
        }

        Set<Character> uniqueChars = new HashSet<>();
        for (char c : countMap.keySet()) {
            if (countMap.get(c) == 2) {
                uniqueChars.add(c);
            }
        }

        if (uniqueChars.size() == 2) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}