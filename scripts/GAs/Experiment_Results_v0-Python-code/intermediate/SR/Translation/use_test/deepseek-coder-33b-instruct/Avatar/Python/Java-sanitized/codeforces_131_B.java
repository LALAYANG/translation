import java.util.*;

public class codeforces_131_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list = Arrays.asList(49, 30, 71);
        Collections.shuffle(list);
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int c = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getKey() == 0) {
                c += entry.getValue() * (entry.getValue() - 1);
            } else if (map.containsKey(-entry.getKey())) {
                c += entry.getValue() * map.get(-entry.getKey());
            }
        }
        System.out.println(c / 2);
    }
}