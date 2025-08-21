```java
import java.util.Scanner;

public class VowelChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'y', 'A', 'E', 'I', 'O', 'U', 'Y'};

        for (int i = input.length() - 1; i >= 0; i--) {
            if (input.charAt(i) == ' ' || input.charAt(i) == '?') {
                continue;
            } else {
                if (isVowel(input.charAt(i), vowels)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
                break;
            }
        }
    }

    private static boolean isVowel(char c, char[] vowels) {
        for (char vowel : vowels) {
            if (c == vowel) {
                return true;
            }
        }
        return false;
    }
}
```
This code uses a `Scanner` to read a line of input from the user, and then it iterates over the characters in the input string, starting from the end and moving backwards. For each character, it checks if it is a vowel or not by using the `isVowel` method, which takes the character and an array of vowels as arguments. If the character is a vowel, it prints "YES" and breaks out of the loop. If it is not a vowel, it prints "NO" and breaks out of the loop.

The `isVowel` method uses a `for` loop to iterate over the vowels in the array, and returns `true` if the character is a vowel, and `false` otherwise.

Note that this code assumes that the input string only contains letters and spaces, and that the vowels are the letters "a", "e", "i", "o", "u", and "y". If the input string contains other characters, or if the vowels are different, you will need to modify the code accordingly.
