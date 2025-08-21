import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class atcoder_ABC120_C {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if (s.length() == 1) {
            System.out.println(0);
            return;
        }
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                map.put(c, map.get(c) + 1);
            }
        }
        int[] arr = new int[map.size()];
        int i = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            arr[i++] = entry.getValue();
        }
        Arrays.sort(arr);
        int ans = arr[0] * 2;
        System.out.println(ans);
    }
}