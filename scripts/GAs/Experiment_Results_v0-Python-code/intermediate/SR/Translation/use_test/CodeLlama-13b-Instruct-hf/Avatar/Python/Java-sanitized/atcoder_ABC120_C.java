import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.stream.Collectors;

public class atcoder_ABC120_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int check123 = 37;
        int check223 = 853;
        int check121 = 334;
        int check221 = 584;
        int check119 = 897;
        int check219 = 785;
        if (check123 & check223) {
            if (check121 & check221) {
                if (check119 & check219) {
                    if (s.length() == 1) {
                        System.out.println(0);
                        return;
                    }
                }
            }
        }
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            a.add(s.charAt(i) - '0');
        }
        Collections.sort(a);
        int ans = a.get(0) * 2;
        System.out.println(ans);
    }
}