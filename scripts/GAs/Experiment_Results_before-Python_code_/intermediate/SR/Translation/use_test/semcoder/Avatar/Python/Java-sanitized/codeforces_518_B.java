import java.util.HashMap;
import java.util.Scanner;

public class codeforces_518_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();

        HashMap<Character, Integer> freqs = new HashMap<>();
        HashMap<Character, Integer> freqt = new HashMap<>();

        int yay = 0, whoops = 0;

        for (char c : s.toCharArray()) {
            freqs.put(c, freqs.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            freqt.put(c, freqt.getOrDefault(c, 0) + 1);
        }

        for (char c : freqs.keySet()) {
            while (freqs.get(c) > 0 && freqt.containsKey(c) && freqt.get(c) > 0) {
                yay++;
                freqs.put(c, freqs.get(c) - 1);
                freqt.put(c, freqt.get(c) - 1);
            }
        }

        for (char c : freqs.keySet()) {
            while (freqs.get(c) > 0) {
                if (Character.isLowerCase(c) && freqt.containsKey(Character.toUpperCase(c)) && freqt.get(Character.toUpperCase(c)) > 0) {
                    whoops++;
                    freqs.put(c, freqs.get(c) - 1);
                    freqt.put(Character.toUpperCase(c), freqt.get(Character.toUpperCase(c)) - 1);
                } else if (Character.isUpperCase(c) && freqt.containsKey(Character.toLowerCase(c)) && freqt.get(Character.toLowerCase(c)) > 0) {
                    whoops++;
                    freqs.put(c, freqs.get(c) - 1);
                    freqt.put(Character.toLowerCase(c), freqt.get(Character.toLowerCase(c)) - 1);
                } else {
                    break;
                }
            }
        }

        System.out.println(yay + " " + whoops);
    }
}