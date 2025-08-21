
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        int[] freqs = new int[26];
        int[] freqt = new int[26];
        int yay = 0, whoops = 0;
        for (int i = 0; i < s.length(); i++) {
            freqs[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            freqt[t.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            while (freqs[i] > 0 && freqt[i] > 0) {
                yay++;
                freqs[i]--;
                freqt[i]--;
            }
        }
        for (int i = 0; i < 26; i++) {
            while (freqs[i] > 0) {
                if (Character.isLowerCase((char) (i + 'a')) && freqt[Character.toUpperCase((char) (i + 'a'))] > 0) {
                    whoops++;
                    freqs[i]--;
                    freqt[Character.toUpperCase((char) (i + 'a'))]--;
                } else if (Character.isUpperCase((char) (i + 'a')) && freqt[Character.toLowerCase((char) (i + 'a'))] > 0) {
                    whoops++;
                    freqs[i]--;
                    freqt[Character.toLowerCase((char) (i + 'a'))]--;
                } else {
                    break;
                }
            }
        }
        System.out.println(yay + " " + whoops);
    }
}

```

