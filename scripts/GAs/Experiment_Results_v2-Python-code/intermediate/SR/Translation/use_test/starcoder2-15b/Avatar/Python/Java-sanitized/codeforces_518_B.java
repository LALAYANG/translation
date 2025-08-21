import java.util.HashMap;

public class codeforces_518_B {
    public static HashMap<Character, Integer> frequency(String string) {
        HashMap<Character, Integer> freq = new HashMap<>();
        for (char letra : string.toCharArray()) {
            if (freq.containsKey(letra)) {
                freq.put(letra, freq.get(letra) + 1);
            } else {
                freq.put(letra, 1);
            }
        }
        return freq;
    }

    public static Tuple<Integer, Integer> same_different(String string1, String string2) {
        HashMap<Character, Integer> freq1 = frequency(string1);
        HashMap<Character, Integer> freq2 = frequency(string2);
        int yay = 0;
        int whoops = 0;
        for (char letra : freq1.keySet()) {
            while (freq1.get(letra) > 0 && freq2.containsKey(letra) && (freq2.get(letra) > 0)) {
                yay += 1;
                freq1.put(letra, freq1.get(letra) - 1);
                freq2.put(letra, freq2.get(letra) - 1);
            }
        }
        for (char le