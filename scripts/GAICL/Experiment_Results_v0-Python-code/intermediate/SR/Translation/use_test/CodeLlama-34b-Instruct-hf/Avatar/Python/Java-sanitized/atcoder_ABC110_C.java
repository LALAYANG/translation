import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class atcoder_ABC110_C {
    public static void main(String[] args) {
        String s = "chokudai";
        String newt_1 = "redcoder";
        List<Integer> ss = new ArrayList<>();
        List<Integer> tt = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            ss.add(s.charAt(i));
        }

        for (int i = 0; i < newt_1.length(); i++) {
            tt.add(newt_1.charAt(i));
        }

        Collections.sort(ss);
        Collections.sort(tt);

        if (ss.equals(tt)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}