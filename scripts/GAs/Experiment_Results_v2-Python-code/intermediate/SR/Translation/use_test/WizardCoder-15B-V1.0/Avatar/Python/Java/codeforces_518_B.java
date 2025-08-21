```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String news = sc.nextLine();
        String t = sc.nextLine();
        sc.close();
        int[] news_frequencies = new int[26];
        int[] freqt = new int[26];
        int yay = 0, whoops = 0;
        for (int i = 0; i < news.length(); i++) {
            news_frequencies[news.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            freqt[t.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            while (news_frequencies[i] > 0 && freqt[i] > 0) {
                yay++;
                news_frequencies[i]--;
                freqt[i]--;
            }
        }
        for (int i = 0; i < 26; i++) {
            while (news_frequencies[i] > 0) {
                if (i < 13) {
                    if (freqt[i + 13] > 0) {
                        whoops++;
                        news_frequencies[i]--;
                        freqt[i + 13]--;
                    } else {
                        break;
                    }
                } else {
                    if (freqt[i - 13] > 0) {
                        whoops++;
                        news_frequencies[i]--;
                        freqt[i - 13]--;
                    } else {
                        break;
                    }
                }
            }
        }
        System.out.println(yay + " " + whoops);
    }
}
```
