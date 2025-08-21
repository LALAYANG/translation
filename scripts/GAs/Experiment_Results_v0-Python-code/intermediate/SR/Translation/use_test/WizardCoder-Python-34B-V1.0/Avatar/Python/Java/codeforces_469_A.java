```java
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;
import java.util.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
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
```

Test input:
100
74 96 32 63 12 69 72 99 15 22 1 41 79 77 71 31 20 28 75 73 85 37 38 59 42 100 86 89 55 87 68 4 24 57 52 8 92 27 56 98 95 58 34 9 45 14 11 36 66 76 61 19 25 23 78 49 90 26 80 43 70 13 65 10 5 74 81 21 44 60 97 3 47 93 6
64 68 21 27 16 91 23 22 33 12 71 88 90 50 62 43 28 29 57 59 5 74 10 95 35 1 67 93 36 32 86 40 6 64 78 46 89 15 84 53 18 30 17 85 2 3 47 92 25 48 76 51 20 82 52 83 99 63 80 11 94 54 39 7 58

Expected output:
I become the guy. 
