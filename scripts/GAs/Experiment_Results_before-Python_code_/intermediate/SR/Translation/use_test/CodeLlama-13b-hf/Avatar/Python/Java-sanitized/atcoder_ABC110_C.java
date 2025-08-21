import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class atcoder_ABC110_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        int[] arr = new int[26];
        for (int i = 0; i < 26; i++) {
            arr[i] = map.getOrDefault((char) (i + 'a'), 0);
        }
        Arrays.sort(arr);
        map.clear();
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        int[] arr2 = new int[26];
        for (int i = 0; i < 26; i++) {
            arr2[i] = map.getOrDefault((char) (i + 'a'), 0);
        }
        Arrays.sort(arr2);
        if (Arrays.equals(arr, arr2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}