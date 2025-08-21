```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String news = sc.nextLine();
        String t = sc.nextLine();

        int[] newsFrequencies = new int[26];
        int[] freqT = new int[26];

        for (int i = 0; i < news.length(); i++) {
            char c = news.charAt(i);
            if (c >= 'a' && c <= 'z') {
                newsFrequencies[c - 'a']++;
            } else if (c >= 'A' && c <= 'Z') {
                freqT[c - 'A']++;
            }
        }

        int yay = 0;
        int whoops = 0;

        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (c >= 'a' && c <= 'z') {
                if (newsFrequencies[c - 'a'] > 0) {
                    yay++;
                    newsFrequencies[c - 'a']--;
                }
            } else if (c >= 'A' && c <= 'Z') {
                if (freqT[c - 'A'] > 0) {
                    whoops++;
                    freqT[c - 'A']--;
                }
            }
        }

        for (int i = 0; i < 26; i++) {
            if (newsFrequencies[i] > 0) {
                if (freqT[i] > 0) {
                    whoops++;
                    newsFrequencies[i]--;
                    freqT[i]--;
                }
            }
        }

        System.out.println(yay + " " + whoops);
    }
}
```
Explanation:

The code is written in Java and it takes two strings as input, `news` and `t`. It then creates two arrays, `newsFrequencies` and `freqT`, to store the frequency of each letter in the two strings.

The code then iterates over the letters in `t` and checks if the letter is present in `newsFrequencies`. If it is, it increments the `yay` counter and decrements the frequency of the letter in `newsFrequencies`. If the letter is not present in `newsFrequencies`, it checks if the letter is present in `freqT`. If it is, it increments the `whoops` counter and decrements the frequency of the letter in `freqT`.

After iterating over all the letters in `t`, the code iterates over the letters in `newsFrequencies` and checks if the letter is present in `freqT`. If it is, it increments the `whoops` counter and decrements the frequency of the letter in `freqT`.

Finally, the code prints the `yay` and `whoops` counters.

Note: The code assumes that the input strings only contain lowercase and uppercase letters. If the input strings can contain other characters, the code will need to be modified accordingly.
