import java.util.Arrays;
import java.util.Collections;

public class codeforces_37_A {
    public static void main(String[] args) {
        int n = 4;
        Integer[] l = {6, 5, 6, 7};
        Arrays.sort(l, Collections.reverseOrder());

        int high = 1;
        int tower = n;
        int maximum = 1;

        for (int i = 1; i < l.length; i++) {
            if (l[i] == l[i - 1]) {
                tower--;
                high++;
            } else {
                if (high > maximum) {
                    maximum = high;
                }
                high = 1;
            }
        }

        if (high > maximum) {
            maximum = high;
        }

        System.out.println(maximum + " " + tower);
    }
}