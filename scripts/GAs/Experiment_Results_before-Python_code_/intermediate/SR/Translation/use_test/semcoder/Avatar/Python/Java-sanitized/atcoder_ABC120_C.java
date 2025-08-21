import java.util.*;

public class atcoder_ABC120_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        if (new HashSet<>(Arrays.asList(s.split(""))).size() == 1) {
            System.out.println(0);
            return;
        }

        Map<String, Integer> a = new HashMap<>();
        for (String c : s.split("")) {
            a.put(c, a.getOrDefault(c, 0) + 1);
        }

        int ans = Collections.min(a.values()) * 2;
        System.out.println(ans);
    }
}