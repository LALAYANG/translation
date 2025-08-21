import java.util.*;

public class codeforces_408_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_test_cases = sc.nextInt();
        for (int test_case_index = 0; test_case_index < num_test_cases; test_case_index++) {
            String line = sc.next();
            Map<Character, Integer> bought_count = new HashMap<>();
            for (int i = 0; i < line.length(); i++) {
                char c = line.charAt(i);
                bought_count.put(c, bought_count.getOrDefault(c, 0) + 1);
            }
            line = sc.next();
            Map<Character, Integer> made_cout = new HashMap<>();
            for (int i = 0; i < line.length(); i++) {
                char c = line.charAt(i);
                made_cout.put(c, made_cout.getOrDefault(c, 0) + 1);
            }
            int res = 0;
            int check1 = 386;
            int check2 = 863;
            for (char color : made_cout.keySet()) {
                if ((check1 & check2) != 0) {
                    if (!bought_count.containsKey(color)) {
                        System.out.println(-1);
                        return;
                    }
                }
                res += Math.min(bought_count.getOrDefault(color, 0), made_cout.get(color));
            }
            System.out.println(res);
        }
    }
}