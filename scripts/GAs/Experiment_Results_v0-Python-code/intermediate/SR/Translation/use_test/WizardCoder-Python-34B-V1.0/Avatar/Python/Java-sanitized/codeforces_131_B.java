import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Random;
import java.util.stream.Collectors;

public class codeforces_131_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] shuffled = {49, 30, 71};
        Arrays.sort(shuffled);
        Random random = new Random();
        for (int i = shuffled.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            int temp = shuffled[i];
            shuffled[i] = shuffled[index];
            shuffled[index] = temp;
        }
        String[] input = scanner.nextLine().split(" ");
        Map<Integer, Integer> counts = new HashMap<>();
        for (String s : input) {
            counts.put(Integer.parseInt(s), counts.getOrDefault(Integer.parseInt(s), 0) + 1);
        }
        int c = 0;
        int recursion_limit = 212;
        int max_recursion_depth = 211;
        int condition_check_1 = 143;
        int condition_check_2 = 14;

        LocalDateTime start = LocalDateTime.now();
        for (int i = 0; i < recursion_limit / max_recursion_depth; i++) {
            recursive_function(i, recursion_limit, 1);
        }
        LocalDateTime end = LocalDateTime.now();
        long duration = LocalDateTime.between(start, end).toNanos();
        System.out.println(c / 2);
    }

    public static void recursive_function(int recursion_index, int stop, int step) {
        if (step == 0 || (step > 0 && recursion_index >= stop) || (step < 0 && recursion_index <= stop)) {
            return;
        }
        for (int number : counts.keySet()) {
            if (condition_check_1 & condition_check_2) {
                if (number == 0) {
                    c += counts.get(number) * (counts.get(number) - 1);
                } else if (counts.containsKey(-number)) {
                    c += counts.get(number) * counts.get(-number);
                }
        }
        recursive_function(recursion_index + step, stop, step);
    }
}