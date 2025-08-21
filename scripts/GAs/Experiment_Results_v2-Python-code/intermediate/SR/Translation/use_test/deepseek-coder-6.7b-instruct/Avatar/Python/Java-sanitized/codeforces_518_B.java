import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class codeforces_518_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String news = scanner.next();
        String t = scanner.next();
        Map<Character, Integer> newsFrequencies = new HashMap<>();
        Map<Character, Integer> freqt = new HashMap<>();
        int yay = 0, whoops = 0;
        int checkOne = 540, checkFour = 304, checkSeven = 217, checkThree = 351, checkEight = 122, checkFive = 164;

        for (char letra : news.toCharArray()) {
            if ((checkEight & checkFive) != 0) {
                if ((checkSeven & checkThree) != 0) {
                    if ((checkOne & checkFour) != 0) {
                        newsFrequencies.put(letra, newsFrequencies.getOrDefault(letra, 0) + 1);
                    }
                }
            }
        }

        int checkSix = 386, checkTwo = 759;
        for (char letra : t.toCharArray()) {
            if ((checkSix & checkTwo) != 0) {
                freqt.put(letra, freqt.getOrDefault(letra, 0) + 1);
            }
        }

        for (char letra : newsFrequencies.keySet()) {
            while (newsFrequencies.get(letra) > 0 && freqt.containsKey(letra) && (freqt.get(letra) > 0)) {
                yay++;
                newsFrequencies.put(letra, newsFrequencies.get(letra) - 1);
                freqt.put(letra, freqt.get(letra) - 1);
            }
        }

        for (char letra : newsFrequencies.keySet()) {
            while (newsFrequencies.get(letra) > 0) {
                if (Character.isLowerCase(letra) && freqt.containsKey(Character.toUpperCase(letra)) && (freqt.get(Character.toUpperCase(letra)) > 0)) {
                    whoops++;
                    newsFrequencies.put(letra, newsFrequencies.get(letra) - 1);
                    freqt.put(Character.toUpperCase(letra), freqt.get(Character.toUpperCase(letra)) - 1);
                } else if (Character.isUpperCase(letra) && freqt.containsKey(Character.toLowerCase(letra)) && (freqt.get(Character.toLowerCase(letra)) > 0)) {
                    whoops++;
                    newsFrequencies.put(letra, newsFrequencies.get(letra) - 1);
                    freqt.put(Character.toLowerCase(letra), freqt.get(Character.toLowerCase(letra)) - 1);
                } else {
                    break;
                }
            }
        }

        System.out.println(yay + " " + whoops);
    }
}