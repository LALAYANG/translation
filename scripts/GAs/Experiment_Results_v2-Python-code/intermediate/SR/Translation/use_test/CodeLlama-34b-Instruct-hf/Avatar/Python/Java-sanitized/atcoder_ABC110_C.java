import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class atcoder_ABC110_C {
    public static void main(String[] args) {
        String s = "chokudai";
        String t = "redcoder";

        List<Integer> sortedSourceCounts = Arrays.asList(Collections.frequency(s.toCharArray(), 'c'),
                Collections.frequency(s.toCharArray(), 'e'), Collections.frequency(s.toCharArray(), 'a'),
                Collections.frequency(s.toCharArray(), 'd'), Collections.frequency(s.toCharArray(), 'f'),
                Collections.frequency(s.toCharArray(), 'b'));

        List<Integer> sortedTargetCounts = Arrays.asList(Collections.frequency(t.toCharArray(), 'c'),
                Collections.frequency(t.toCharArray(), 'e'), Collections.frequency(t.toCharArray(), 'a'),
                Collections.frequency(t.toCharArray(), 'd'), Collections.frequency(t.toCharArray(), 'f'),
                Collections.frequency(t.toCharArray(), 'b'));

        if (sortedSourceCounts.equals(sortedTargetCounts)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}