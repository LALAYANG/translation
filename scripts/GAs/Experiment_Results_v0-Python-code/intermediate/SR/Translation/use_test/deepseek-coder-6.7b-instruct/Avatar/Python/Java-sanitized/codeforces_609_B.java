import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] lst = new int[n];
        for (int i = 0; i < n; i++) {
            lst[i] = scanner.nextInt();
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(lst[i])) {
                map.put(lst[i], map.get(lst[i]) + 1);
            } else {
                map.put(lst[i], 1);
            }
        }
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (map.get(lst[i]) > 1) {
                res += n - i - map.get(lst[i]);
                map.put(lst[i], map.get(lst[i]) - 1);
            } else {
                res += n - i - 1;
            }
        }
        System.out.println(res);
    }
}