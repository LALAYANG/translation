```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String news = sc.nextLine();
        String t = sc.nextLine();
        int yay = 0;
        int whoops = 0;
        int[] news_frequencies = new int[256];
        int[] freqt = new int[256];
        for (int i = 0; i < news.length(); i++) {
            news_frequencies[news.charAt(i)]++;
        }
        for (int i = 0; i < t.length(); i++) {
            freqt[t.charAt(i)]++;
        }
        for (int i = 0; i < news_frequencies.length; i++) {
            while (news_frequencies[i] > 0 && freqt[i] > 0) {
                yay++;
                news_frequencies[i]--;
                freqt[i]--;
            }
        }
        for (int i = 0; i < news_frequencies.length; i++) {
            while (news_frequencies[i] > 0) {
                if (Character.isLowerCase((char) i) && Character.isUpperCase((char) i) && (freqt[Character.toUpperCase((char) i)] > 0)) {
                    whoops++;
                    news_frequencies[i]--;
                    freqt[Character.toUpperCase((char) i)]--;
                } else if (Character.isUpperCase((char) i) && Character.isLowerCase((char) i) && (freqt[Character.toLowerCase((char) i)] > 0)) {
                    whoops++;
                    news_frequencies[i]--;
                    freqt[Character.toLowerCase((char) i)]--;
                } else {
                    break;
                }
            }
        }
        System.out.println(yay + " " + whoops);
    }
}
```

