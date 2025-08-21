import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class atcoder_ABC109_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numStrings = scanner.nextInt();
        scanner.nextLine();
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < numStrings; i++) {
            stringList.add(scanner.nextLine());
        }
        Map<String, Integer> charCounts = new HashMap<>();
        for (String s : stringList) {
            charCounts.put(s, charCounts.getOrDefault(s, 0) + 1);
        }
        boolean result = true;
        for (int i = 0; i < stringList.size() - 1; i++) {
            if (charCounts.get(stringList.get(i)) >= 2) {
                result = false;
                break;
            }
            if (stringList.get(i).charAt(0) != stringList.get(i + 1).charAt(0)) {
                result = false;
                break;
            }
        }
        System.out.println(result ? "Yes" : "No");
    }
}