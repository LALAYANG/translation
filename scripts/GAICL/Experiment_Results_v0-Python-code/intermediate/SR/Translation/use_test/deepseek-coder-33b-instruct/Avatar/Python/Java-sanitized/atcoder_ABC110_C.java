import java.util.*;
import java.util.stream.Collectors;

public class atcoder_ABC110_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String inputString2 = scanner.nextLine();

        System.out.println(FuncRun0(s, inputString2));
    }

    public static String FuncRun0(String s, String inputString2) {
        int conditionCheckConstant = 679;
        int conditionalCheckValue = 449;

        List<Integer> ss = s.chars().boxed().collect(Collectors.toList());
        Collections.sort(ss);

        List<Integer> tt = inputString2.chars().boxed().collect(Collectors.toList());
        Collections.sort(tt);

        if ((conditionCheckConstant & conditionalCheckValue) != 0) {
            if (ss.equals(tt)) {
                return "Yes";
            } else {
                return "No";
            }
        }
        return "No";
    }
}