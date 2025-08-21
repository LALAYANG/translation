import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;

public class codeforces_637_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = sc.nextLine().split(" ");
        Map<String, Integer> w = new HashMap<>();
        for (String str : s) {
            if (w.containsKey(str)) {
                w.put(str, w.get(str) + 1);
            } else {
                w.put(str, 1);
            }
        }
        String a = "";
        int c = -1;
        for (Map.Entry<String, Integer> entry : w.entrySet()) {
            if (entry.getValue() == Collections.max(w.values())) {
                if (s.indexOf(entry.getKey()) > c) {
                    a = entry.getKey();
                    c = s.indexOf(entry.getKey());
                }
            }
        }
        System.out.println(a);
    }
}