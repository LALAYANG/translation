import java.util.Scanner;
import java.util.HashMap;

public class atcoder_ABC109_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<String, Integer> map = new HashMap<>();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        String result = "Yes";
        for (int i = 0; i < n - 1; i++) {
            if (arr[i].charAt(0) != arr[i + 1].charAt(0)) {
                result = "No";
                break;
            }
        }

        for (String key : map.keySet()) {
            if (map.get(key) >= 2) {
                result = "No";
                break;
            }
        }

        System.out.println(result);
    }
}