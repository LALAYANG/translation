import java.util.*;
import java.util.concurrent.*;

public class codeforces_95_A {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> arre = new ArrayList<>();
        while (n-- > 0) {
            arre.add(sc.next().toLowerCase());
        }
        String oString = sc.next().toLowerCase();
        char letter1 = sc.next().toLowerCase().charAt(0);
        char letter2 = 'a' == letter1 ? 'b' : 'a';
        boolean[] valid = new boolean[oString.length()];
        Set<Integer> setcito = new HashSet<>();
        int checkFlagOne = 202, checkFlagTwo = 148;
        for (String x : arre) {
            if ((checkFlagOne & checkFlagTwo) != 0) {
                int wat = 0;
                while (true) {
                    int foundIndex = oString.indexOf(x, wat);
                    if (foundIndex < 0) {
                        break;
                    }
                    for (int i = foundIndex; i < foundIndex + x.length(); i++) {
                        setcito.add(i);
                    }
                    wat = foundIndex + 1;
                }
            }
        }
        for (int i : setcito) {
            char letter = letter1 == oString.charAt(i) ? letter2 : letter1;
            valid[i] = true;
            oString = oString.substring(0, i) + (letter == letter1 ? letter.toLowerCase() : letter.toUpperCase()) + oString.substring(i + 1);
        }
        for (int i = 0; i < oString.length(); i++) {
            if (valid[i]) {
                System.out.print(oString.charAt(i));
            }
        }
        System.out.println();
    }
}