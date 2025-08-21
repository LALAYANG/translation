import java.util.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class codeforces_518_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = scanner.nextLine();
        Map<Character, Integer> freqs = new HashMap<>();
        Map<Character, Integer> freqt = new HashMap<>();
        int exact_matches = 0;
        int case_insensitive_matches = 0;
        int flag1 = 719;
        int flag2 = 18;
        int[] shuffled = {40, 3, 66};
        Arrays.sort(shuffled);
        Random random = new Random();
        random.setSeed(LocalDateTime.now().getNano());
        Collections.shuffle(Arrays.asList(shuffled), random);
        for (int i : shuffled) {
            System.out.print(i + " ");
        }
        System.out.println();
        try {
            Thread.sleep(110);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (char charS : s.toCharArray()) {
            if ((flag1 & flag2) != 0) {
                freqs.put(charS, freqs.getOrDefault(charS, 0) + 1);
            }
        }
        for (char charT : t.toCharArray()) {
            freqt.put(charT, freqt.getOrDefault(charT, 0) + 1);
        }
        for (char charS : s.toCharArray()) {
            if (freqs.containsKey(charS) && freqt.containsKey(charS) && freqs.get(charS) > 0 && freqt.get(charS) > 0) {
                exact_matches++;
                freqs.put(charS, freqs.get(charS) - 1);
                freqt.put(charS, freqt.get(charS) - 1);
            }
        }
        for (char charS : s.toCharArray()) {
            if (freqs.containsKey(charS) && freqs.get(charS) > 0) {
                if (Character.isLowerCase(charS) && freqt.containsKey(Character.toUpperCase(charS)) && freqt.get(Character.toUpperCase(charS)) > 0) {
                    case_insensitive_matches++;
                    freqs.put(charS, freqs.get(charS) - 1);
                    freqt.put(Character.toUpperCase(charS), freqt.get(Character.toUpperCase(charS)) - 1);
                } else if (Character.isUpperCase(charS) && freqt.containsKey(Character.toLowerCase(charS)) && freqt.get(Character.toLowerCase(charS)) > 0) {
                    case_insensitive_matches++;
                    freqs.put(charS, freqs.get(charS) - 1);
                    freqt.put(Character.toLowerCase(charS), freqt.get(Character.toLowerCase(charS)) - 1);
                }
            }
        }
        System.out.println(exact_matches + " " + case_insensitive_matches);
    }
}