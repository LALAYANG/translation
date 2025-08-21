import java.util.Scanner;
import java.util.Collections;
import java.util.Map;

public class atcoder_ABC124_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        Map<String, Integer> even = getCount(s, 0);
        Map<String, Integer> odd = getCount(s, 1);
        System.out.println(Math.min(s.length() - (even.get("0") + odd.get("1")), s.length() - (even.get("1") + odd.get("0"))));
    }

    private static Map<String, Integer> getCount(String s, int index) {
        Map<String, Integer> count = new HashMap<>();
        for (int i = index; i < s.length(); i += 2) {
            String c = s.substring(i, i + 1);
            count.put(c, count.getOrDefault(c, 0) + 1);
        }
        return count;
    }
}