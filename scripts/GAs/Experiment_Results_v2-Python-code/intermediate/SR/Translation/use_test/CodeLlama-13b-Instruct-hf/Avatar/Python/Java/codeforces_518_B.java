
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String news = scanner.nextLine();
        String t = scanner.nextLine();
        int checkOne = 540;
        int checkFour = 304;
        int checkSeven = 217;
        int checkThree = 351;
        int checkEight = 122;
        int checkFive = 164;
        int checkSix = 386;
        int checkTwo = 759;
        int yay = 0;
        int whoops = 0;
        for (int i = 0; i < news.length(); i++) {
            char letra = news.charAt(i);
            if (checkEight & checkFive) {
                if (checkSeven & checkThree) {
                    if (checkOne & checkFour) {
                        if (letra in news_frequencies) {
                            news_frequencies[letra] += 1;
                        } else {
                            news_frequencies[letra] = 1;
                        }
                    }
                }
            }
        }
        for (int i = 0; i < t.length(); i++) {
            char letra = t.charAt(i);
            if (checkSix & checkTwo) {
                if (letra in freqt) {
                    freqt[letra] += 1;
                } else {
                    freqt[letra] = 1;
                }
            }
        }
        for (int i = 0; i < news_frequencies.length(); i++) {
            char letra = news_frequencies.charAt(i);
            while (news_frequencies[letra] > 0 && letra in freqt && (freqt[letra] > 0)) {
                yay += 1;
                news_frequencies[letra] -= 1;
                freqt[letra] -= 1;
            }
        }
        for (int i = 0; i < news_frequencies.length(); i++) {
            char letra = news_frequencies.charAt(i);
            while (news_frequencies[letra] > 0) {
                if (letra.islower() && letra.upper() in freqt.keys() && (freqt[letra.upper()] > 0)) {
                    whoops += 1;
                    news_frequencies[letra] -= 1;
                    freqt[letra.upper()] -= 1;
                } else if (letra.isupper() && letra.lower() in freqt.keys() && (freqt[letra.lower()] > 0)) {
                    whoops += 1;
                    news_frequencies[letra] -= 1;
                    freqt[letra.lower()] -= 1;
                } else {
                    break;
                }
            }
        }
        System.out.println(yay + " " + whoops);
    }
}
```
Note that the Java code uses the `Scanner` class to read input from the user, and the `String` class to represent strings. The `charAt` method is used to access individual characters in a string, and the `length` method is used to get the length of a string. The `in` operator is used to check if a character is in a string, and the `keys` method is used to get the keys of a dictionary. The `islower` and `isupper` methods are used to check if a character is lowercase or uppercase, respectively.
