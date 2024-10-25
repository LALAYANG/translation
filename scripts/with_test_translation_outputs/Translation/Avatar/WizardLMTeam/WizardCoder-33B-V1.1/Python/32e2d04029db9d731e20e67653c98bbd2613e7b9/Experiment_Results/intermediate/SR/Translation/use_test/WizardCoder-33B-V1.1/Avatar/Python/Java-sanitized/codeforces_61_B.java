import java.util.*;
import java.lang.*;
import java.io.*;

public class codeforces_61_B {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        List<String> l = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            l.add(f(sc.next()));
        }
        List<String> perm = permute(l);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (perm.contains(f(sc.next()))) {
                System.out.println("ACC");
            } else {
                System.out.println("WA");
            }
        }
    }

    public static String f(String s) {
        String r = "";
        for (char c : s.toCharArray()) {
            if (c != '-' && c != ';' && c != '_') {
                r += Character.toLowerCase(c);
            }
        }
        return r;
    }

    public static List<String> permute(List<String> l) {
        List<String> result = new ArrayList<>();
        permuteHelper(0, l, result);
        return result;
    }

    public static void permuteHelper(int start, List<String> l, List<String> result) {
        if (start == l.size()) {
            StringBuilder sb = new StringBuilder();
            for (String s : l) {
                sb.append(s);
            }
            result.add(sb.toString());
        } else {
            for (int i = start; i < l.size(); i++) {
                Collections.swap(l, start, i);
                permuteHelper(start + 1, l, result);
                Collections.swap(l, start, i);
            }
        }
    }
}