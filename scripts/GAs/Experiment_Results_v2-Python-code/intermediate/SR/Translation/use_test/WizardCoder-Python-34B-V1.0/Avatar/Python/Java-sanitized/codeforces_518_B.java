import java.util.HashMap;
import java.util.Scanner;

public class codeforces_518_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String news = scanner.nextLine();
        String t = scanner.nextLine();
        HashMap<Character, Integer> news_frequencies = new HashMap<>();
        HashMap<Character, Integer> freqt = new HashMap<>();
        int yay = 0;
        int whoops = 0;
        int check_one = 540;
        int check_four = 304;
        int check_seven = 217;
        int check_three = 351;
        int check_eight = 122;
        int check_five = 164;
        for (int i = 0; i < news.length(); i++) {
            char letra = news.charAt(i);
            if ((check_eight & check_five) != 0) {
                if ((check_seven & check_three) != 0) {
                    if ((check_one & check_four) != 0) {
                        if (news_frequencies.containsKey(letra)) {
                            news_frequencies.put(letra, news_frequencies.get(letra) + 1);
                        } else {
                            news_frequencies.put(letra, 1);
                        }
                    }
                }
            }
        }
        int check_six = 386;
        int check_two = 759;
        for (int i = 0; i < t.length(); i++) {
            char letra = t.charAt(i);
            if ((check_six & check_two) != 0) {
                if (freqt.containsKey(letra)) {
                    freqt.put(letra, freqt.get(letra) + 1);
                } else {
                    freqt.put(letra, 1);
                }
            }
        }
        for (char letra : news_frequencies.keySet()) {
            while (news_frequencies.get(letra) > 0 && freqt.containsKey(letra) && freqt.get(letra) > 0) {
                yay++;
                news_frequencies.put(letra, news_frequencies.get(letra) - 1);
                freqt.put(letra, freqt.get(letra) - 1);
            }
        }
        for (char letra : news_frequencies.keySet()) {
            while (news_frequencies.get(letra) > 0) {
                if (Character.isLowerCase(letra) && freqt.containsKey(Character.toUpperCase(letra)) && freqt.get(Character.toUpperCase(letra)) > 0) {
                    whoops++;
                    news_frequencies.put(letra, news_frequencies.get(letra) - 1);
                    freqt.put(Character.toUpperCase(letra), freqt.get(Character.toUpperCase(letra)) - 1);
                } else if (Character.isUpperCase(letra) && freqt.containsKey(Character.toLowerCase(letra)) && freqt.get(Character.toLowerCase(letra)) > 0) {
                    whoops++;
                    news_frequencies.put(letra, news_frequencies.get(letra) - 1);
                    freqt.put(Character.toLowerCase(letra), freqt.get(Character.toLowerCase(letra)) - 1);
                } else {
                    break;
                }
            }
        }
        System.out.println(yay + " " + whoops);
    }
}