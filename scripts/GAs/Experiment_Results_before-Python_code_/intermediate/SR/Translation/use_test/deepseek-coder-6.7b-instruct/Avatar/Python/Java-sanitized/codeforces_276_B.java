import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class codeforces_276_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int oddCount = 0;
        for (int value : map.values()) {
            if (value % 2 != 0) {
                oddCount++;
            }
            if (oddCount > 1) {
                break;
            }
        }
        if (oddCount <= 1 && s.length() % 2 == 0) {
            System.out.println("First");
        } else if (oddCount > 1 && s.length() % 2 == 0) {
            System.out.println("Second");
        } else if (oddCount > 1 && s.length() % 2 != 0) {
            System.out.println("First");
        }
    }
}