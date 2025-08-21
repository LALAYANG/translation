import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class atcoder_ABC110_C {
    public static void main(String[] args) {
        String s = "chokudai";
        String inputString2 = "redcoder";

        List<Character> sList = s.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        List<Character> inputString2List = inputString2.chars().mapToObj(c -> (char) c).collect(Collectors.toList());

        List<Integer> sCounts = sList.stream().collect(Collectors.groupingBy(c -> c, Collectors.collectingAndThen(Collectors.counting(), Long::intValue))).values().stream().sorted().collect(Collectors.toList());
        List<Integer> inputString2Counts = inputString2List.stream().collect(Collectors.groupingBy(c -> c, Collectors.collectingAndThen(Collectors.counting(), Long::intValue))).values().stream().sorted().collect(Collectors.toList());

        if (sCounts.equals(inputString2Counts)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}