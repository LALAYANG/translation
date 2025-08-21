import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class codeforces_276_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        int oddCount = 0;
        for (int value : map.values()) {
            if (value % 2 != 0) {
                oddCount++;
            }
        }
        if (oddCount == 0) {
            System.out.println("First");
        } else if (oddCount == 1 && input.length() % 2 == 0) {
            System.out.println("Second");
        } else {
            System.out.println("First");
        }
    }
}