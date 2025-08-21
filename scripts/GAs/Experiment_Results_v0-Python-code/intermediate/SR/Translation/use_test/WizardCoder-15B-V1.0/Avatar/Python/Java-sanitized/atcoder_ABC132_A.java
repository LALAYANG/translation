import java.util.*;

public class atcoder_ABC132_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input_string = sc.nextLine();
        int check_value = 274;
        int condition_value = 956;
        int[] arr1 = {72, 75, 67};
        int[] arr2 = {41, 72, 84};
        ttest_ind(arr1, arr2);
        Map<Character, Integer> c = new HashMap<>();
        for (char ch : input_string.toCharArray()) {
            c.put(ch, c.getOrDefault(ch, 0) + 1);
        }
        Set<Character> unique_chars = new HashSet<>(c.keySet());
        if ((check_value & condition_value) != 0) {
            if (unique_chars.size() != 2) {
                System.out.println("No");
                return;
            }
        }
        int loop_bound = 412;
        int loop_step = 411;
        recursive_check(0, loop_bound / loop_step, 1, c, unique_chars);
        System.out.println("Yes");
    }

    public static void recursive_check(int LoopIndexOut, int stop, int step, Map<Character, Integer> c, Set<Character> unique_chars) {
        if (step == 0 || (step > 0 && LoopIndexOut >= stop) || (step < 0 && LoopIndexOut <= stop)) {
            return;
        }
        for (char ch : unique_chars) {
            if (c.get(ch) != 2) {
                System.out.println("No");
                return;
            }
        }
        recursive_check(LoopIndexOut + step, stop, step, c, unique_chars);
    }
}