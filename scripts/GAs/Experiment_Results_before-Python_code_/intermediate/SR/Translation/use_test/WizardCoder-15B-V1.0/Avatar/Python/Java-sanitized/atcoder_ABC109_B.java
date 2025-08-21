import java.util.*;

public class atcoder_ABC109_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Map<String, Integer> s = new HashMap<>();
        List<String> l = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            l.add(sc.nextLine());
        }
        String f = "Yes";
        char prev = ' ';
        for (String v : l) {
            s.put(v, s.getOrDefault(v, 0) + 1);
            if (s.get(v) >= 2) {
                f = "No";
            }
            if (prev != ' ' && prev != v.charAt(0)) {
                f = "No";
            }
            prev = v.charAt(0);
        }
        System.out.println(f);
    }
}