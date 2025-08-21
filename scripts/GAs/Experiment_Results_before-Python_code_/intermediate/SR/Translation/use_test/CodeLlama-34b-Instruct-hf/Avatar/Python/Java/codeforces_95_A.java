```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = sc.next().toLowerCase();
        }
        String oString = sc.next();
        String lowString = oString.toLowerCase();
        char letter1 = sc.next().charAt(0);
        char letter2 = (letter1 == 'a') ? 'b' : 'a';
        boolean[] valid = new boolean[oString.length()];
        for (int i = 0; i < oString.length(); i++) {
            valid[i] = false;
        }
        for (String word : words) {
            int index = lowString.indexOf(word);
            while (index >= 0) {
                for (int i = index; i < index + word.length(); i++) {
                    valid[i] = true;
                }
                index = lowString.indexOf(word, index + 1);
            }
        }
        for (int i = 0; i < oString.length(); i++) {
            if (valid[i]) {
                char c = oString.charAt(i);
                if (c == letter1) {
                    oString = oString.substring(0, i) + letter2 + oString.substring(i + 1);
                } else if (c == letter2) {
                    oString = oString.substring(0, i) + letter1 + oString.substring(i + 1);
                }
            }
        }
        System.out.println(oString);
    }
}
```
Note: The above code is a Java implementation of the given Python code. It takes the input from the user and prints the output as required.
