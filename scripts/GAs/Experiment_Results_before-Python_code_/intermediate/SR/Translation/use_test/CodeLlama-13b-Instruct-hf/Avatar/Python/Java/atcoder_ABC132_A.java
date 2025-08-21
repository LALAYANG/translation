```java
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;

public class Solution {
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
```
This code uses a `Scanner` to read a line of input from the user, and then uses a `Set` and a `Map` to keep track of the characters in the input string and their frequencies. The `Set` is used to keep track of the unique characters in the input string, and the `Map` is used to keep track of the frequencies of each character.

The code first adds each character in the input string to the `Set` and the `Map`, and then increments the frequency of each character in the `Map`. If a character is already in the `Set`, it means that it has already been encountered before, so the frequency of that character is incremented in the `Map`.

After all the characters have been processed, the code checks if the `Set` contains exactly two unique characters. If it does, then the code checks if the frequency of each character in the `Set` is equal to 2. If it is, then the code prints "Yes", otherwise it prints "No".

The code also uses a `return` statement to exit the method early if the input string does not meet the requirements.
