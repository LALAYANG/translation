import java.util.Scanner;

public class codeforces_518_B {
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