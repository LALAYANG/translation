import java.util.*;
import java.util.stream.Collectors;

public class atcoder_ABC110_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String new_t = scanner.nextLine();
        System.out.println(run(s, new_t));
    }

    public static String run(String s, String new_t) {
        int ConditionCheckerOneTen = 334;
        int ConditionCheckerTwoTen = 330;
        int ConditionCheckerOneEight = 681;
        int ConditionCheckerTwoEight = 499;

        List<Integer> ss = s.chars().boxed().collect(Collectors.toList());
        Collections.sort(ss);

        List<Integer> tt = new_t.chars().boxed().collect(Collectors.toList());
        Collections.sort(tt);

        if ((ConditionCheckerOneTen & ConditionCheckerTwoTen) != 0) {
            if ((ConditionCheckerOneEight & ConditionCheckerTwoEight) != 0) {
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