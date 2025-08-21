import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class atcoder_ABC110_C {
    public static void main(String[] args) {
        Func_main_0();
    }

    public static void Func_main_0() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String input_string_2 = scanner.nextLine();
        Func_run_0(s, input_string_2);
    }

    public static void Func_run_0(String s, String input_string_2) {
        int condition_check_constant = 679;
        LocalDateTime now = LocalDateTime.now();
        int conditional_check_value = 449;
        int[] ss = Arrays.stream(s.chars()).boxed().collect(Collectors.groupingBy(c -> c, Collectors.counting()).values().stream().mapToInt(Integer::intValue).toArray());
        Arrays.sort(ss);
        int[] tt = Arrays.stream(input_string_2.chars()).boxed().collect(Collectors.groupingBy(c -> c, Collectors.counting()).values().stream().mapToInt(Integer::intValue).toArray());
        Arrays.sort(tt);
        if (condition_check_constant & conditional_check_value != 0) {
            if (Arrays.equals(ss, tt)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}