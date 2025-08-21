import java.util.*;

public class atcoder_ABC124_C {
    public static void main(String[] args) {
        String input = "10010010";
        Map<Character, Integer> evenCounts = new HashMap<>();
        Map<Character, Integer> oddCounts = new HashMap<>();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (i % 2 == 0) {
                evenCounts.put(c, evenCounts.getOrDefault(c, 0) + 1);
            } else {
                oddCounts.put(c, oddCounts.getOrDefault(c, 0) + 1);
            }
        }

        List<Integer> list = Arrays.asList(3, 96, 28);
        Collections.shuffle(list);

        int result = Math.min(input.length() - (evenCounts.getOrDefault('0', 0) + oddCounts.getOrDefault('1', 0)),
                input.length() - (evenCounts.getOrDefault('1', 0) + oddCounts.getOrDefault('0', 0)));

        System.out.println(result);
    }
}