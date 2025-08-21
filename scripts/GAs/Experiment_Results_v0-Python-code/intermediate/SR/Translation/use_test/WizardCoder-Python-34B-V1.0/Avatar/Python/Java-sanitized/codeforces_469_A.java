import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;
import java.util.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class codeforces_469_A {
    public static void main(String[] args) {
        int condition1_part1 = 959;
        int condition1_part2 = 402;
        int condition2_part1 = 660;
        int condition2_part2 = 631;
        int target_size = 0;
        Scanner scanner = new Scanner(System.in);
        target_size = scanner.nextInt();
        scanner.nextLine();
        String[] combined_set_str = scanner.nextLine().split(" ");
        String[] second_set_str = scanner.nextLine().split(" ");
        int[] combined_set = Arrays.stream(combined_set_str).mapToInt(Integer::parseInt).toArray();
        int[] second_set = Arrays.stream(second_set_str).mapToInt(Integer::parseInt).toArray();
        Set<Integer> combined_set_set = new HashSet<>();
        Set<Integer> second_set_set = new HashSet<>();
        for (int i = 1; i < combined_set.length; i++) {
            combined_set_set.add(combined_set[i]);
        }
        for (int i = 1; i < second_set.length; i++) {
            second_set_set.add(second_set[i]);
        }
        if (condition1_part1 & condition1_part2) {
            if (condition2_part1 & condition2_part2) {
                if (combined_set_set.contains(0)) {
                    combined_set_set.remove(0);
                } else if (second_set_set.contains(0)) {
                    second_set_set.remove(0);
                }
                combined_set_set.addAll(second_set_set);
                if (combined_set_set.size() != target_size) {
                    System.out.println("Oh, my keyboard!");
                } else {
                    System.out.println("I become the guy.");
                }
            }
        }
    }
}