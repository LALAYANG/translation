```java
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int check_value = 274;
        int condition_value = 956;
        String input_string = "AVVA";
        Set<Character> unique_chars = new HashSet<>(Arrays.asList(input_string.toCharArray());
        if ((check_value & condition_value) != 0) {
            if (unique_chars.size() != 2) {
                System.out.println("No");
                System.exit(0);
            }
            int loop_bound = 412;
            int loop_step = 411;
            recursive_check(0, loop_bound / loop_step, 1);
            System.out.println("Yes");
        }
    }

    public static void recursive_check(int LoopIndexOut, int stop, int step) {
        if (step == 0 || (step > 0 && LoopIndexOut >= stop) || (step < 0 && LoopIndexOut <= stop)) {
            return;
        }
        for (char i : unique_chars) {
            if (input_string.chars().filter(c -> c == i).count() != 2) {
                System.out.println("No");
                System.exit(0);
            }
        }
        recursive_check(LoopIndexOut + step, stop, step);
    }
}
``` 
