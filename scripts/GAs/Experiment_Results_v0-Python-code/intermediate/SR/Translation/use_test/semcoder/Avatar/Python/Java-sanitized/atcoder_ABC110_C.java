import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class atcoder_ABC110_C {
    public static void main(String[] args) {
        String s = "chokudai";
        String input_string_2 = "redcoder";

        List<Integer> s_counts = s.chars().boxed().collect(Collectors.toList());
        List<Integer> input_string_2_counts = input_string_2.chars().boxed().collect(Collectors.toList());

        Collections.sort(s_counts);
        Collections.sort(input_string_2_counts);

        if (s_counts.equals(input_string_2_counts)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}