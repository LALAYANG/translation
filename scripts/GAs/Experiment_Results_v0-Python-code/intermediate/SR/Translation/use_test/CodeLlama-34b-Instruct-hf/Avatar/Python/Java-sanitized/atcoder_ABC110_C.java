import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class atcoder_ABC110_C {

    public static void main(String[] args) {
        String s = "chokudai";
        String inputString2 = "redcoder";
        System.out.println(func(s, inputString2));
    }

    public static String func(String s, String inputString2) {
        int conditionCheckConstant = 679;
        int conditionalCheckValue = 449;
        List<Integer> ss = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            ss.add(s.charAt(i));
        }
        Collections.sort(ss);
        List<Integer> tt = new ArrayList<>();
        for (int i = 0; i < inputString2.length(); i++) {
            tt.add(inputString2.charAt(i));
        }
        Collections.sort(tt);
        if (conditionCheckConstant & conditionalCheckValue) {
            if (ss.equals(tt)) {
                return "Yes";
            } else {
                return "No";
            }
        }
        return "No";
    }
}