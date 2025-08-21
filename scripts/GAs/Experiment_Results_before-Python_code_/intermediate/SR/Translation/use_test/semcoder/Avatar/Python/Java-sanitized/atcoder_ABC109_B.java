import java.util.Scanner;
import java.util.HashMap;

public class atcoder_ABC109_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<String, Integer> s = new HashMap<>();
        String[] l = new String[n];
        for (int i = 0; i < n; i++) {
            l[i] = sc.next();
        }
        String f = "Yes";
        int i = -1;
        for (String v : l) {
            s.put(v, s.getOrDefault(v, 0) + 1);
            if (s.get(v) >= 2) {
                f = "No";
            }
            if (i != -1 && l[i].charAt(l[i].length() - 1) != v.charAt(0)) {
                f = "No";
            }
            i++;
        }
        System.out.println(f);
    }
}