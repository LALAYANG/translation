import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class atcoder_ABC110_C {
    public static void main(String[] args) {
        String s = "chokudai";
        String new_t = "redcoder";
        System.out.println(run(s, new_t));
    }

    public static String run(String s, String new_t) {
        int ConditionCheckerOneTen = 334;
        int ConditionCheckerTwoTen = 330;
        int ConditionCheckerOneEight = 681;
        int ConditionCheckerTwoEight = 499;
        List<Integer> ss = s.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        List<Integer> tt = new_t.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        if (ConditionCheckerOneTen & ConditionCheckerTwoTen) {
            if (ConditionCheckerOneEight & ConditionCheckerTwoEight) {
                if (ss.equals(tt)) {
                    return "Yes";
                } else {
                    return "No";
                }
            }
        }
        return "No";
    }
}