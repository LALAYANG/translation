import java.util.Scanner;

public class codeforces_518_B {
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