import java.util.*;
import java.lang.*;

class Main {
    static int check123 = 37;
    static int check223 = 853;
    static int check121 = 334;
    static int check221 = 584;
    static int check119 = 897;
    static int check219 = 785;

    public static void main (String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        if ((check123 & check223) != 0) {
            if ((check121 & check221) != 0) {
                if ((check119 & check219) != 0) {
                    if (new HashSet<Character>(Arrays.asList(s.split(""))).size() == 1) {
                        System.out.println(0);
                        System.exit(0);
                    }
                }
            }
        }
        Map<Character, Integer> a = new HashMap<>();
        for (char c : s.toCharArray()) {
            a.put(c, a.getOrDefault(c, 0) + 1);
        }
        int ans = Collections.min(a.values()) * 2;
        System.out.println(ans);
    }
}