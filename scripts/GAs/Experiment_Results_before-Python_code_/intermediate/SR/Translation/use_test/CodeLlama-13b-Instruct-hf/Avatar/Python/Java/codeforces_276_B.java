```java
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        // Convert the input string to a list of characters
        List<Character> s = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            s.add(input.charAt(i));
        }

        // Create a hash map to store the frequency of each character
        Map<Character, Integer> dt = new HashMap<>();
        for (Character c : s) {
            if (dt.containsKey(c)) {
                dt.put(c, dt.get(c) + 1);
            } else {
                dt.put(c, 1);
            }
        }

        // Count the number of characters with odd frequency
        int cnt = 0;
        for (Map.Entry<Character, Integer> entry : dt.entrySet()) {
            if (entry.getValue() % 2 != 0 && cnt < 1) {
                cnt++;
            } else if (entry.getValue() % 2 != 0 && cnt >= 1) {
                break;
            }
        }

        // Print the result
        if (cnt == 0) {
            System.out.println("First");
        } else if (cnt == 1 && s.size() % 2 == 0) {
            System.out.println("Second");
        } else {
            System.out.println("First");
        }
    }
}
```
This code first converts the input string to a list of characters, then creates a hash map to store the frequency of each character. It then iterates through the hash map and counts the number of characters with odd frequency. Finally, it prints the result based on the number of characters with odd frequency and the length of the input string.
