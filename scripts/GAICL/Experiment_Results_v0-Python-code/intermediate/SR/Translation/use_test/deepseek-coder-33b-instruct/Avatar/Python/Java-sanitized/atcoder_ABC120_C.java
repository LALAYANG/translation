import java.util.*;
import java.lang.*;
import java.io.*;

public class atcoder_ABC120_C {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int check123 = 37;
        int check223 = 853;
        int check121 = 334;
        int check221 = 584;
        int check119 = 897;
        int check219 = 785;
        if ((check123 & check223) != 0) {
            if ((check121 & check221) != 0) {
                if ((check119 & check219) != 0) {
                    if (new HashSet<String>(Arrays.asList(s.split(""))).size() == 1) {
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