```
import java.util.Scanner;
import java.util.Collections;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = scanner.nextLine();
        System.out.println(run(s, t));
    }

    public static String run(String s, String t) {
        HashMap<Character, Integer> counterS = new HashMap<>();
        HashMap<Character, Integer> counterT = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (counterS.containsKey(c)) {
                counterS.put(c, counterS.get(c) + 1);
            } else {
                counterS.put(c, 1);
            }
        }

        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (counterT.containsKey(c)) {
                counterT.put(c, counterT.get(c) + 1);
            } else {
                counterT.put(c, 1);
            }
        }

        if (counterS.equals(counterT)) {
            return "Yes";
        } else {
            return "No";
        }
    }
}
```
This is a Java implementation of the Python code you provided. It uses a `HashMap` to keep track of the frequency of each character in the input strings, and then compares the two `HashMap`s to determine if the strings are anagrams.

Note that this implementation assumes that the input strings only contain lowercase letters. If you want to handle uppercase letters as well, you can modify the code to use `Character.toLowerCase()` to convert the characters to lowercase before adding them to the `HashMap`.
