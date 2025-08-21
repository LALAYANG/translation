import java.util.*;

public class codeforces_609_B {
    private static Queue<Queue<Integer>> queue__input0 = new LinkedList<>();
    private static Map<Integer, Integer> element_counts = new HashMap<>();
    private static int res = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> lst = new ArrayList<>();
        while (scanner.hasNext()) {
            lst.add(scanner.nextInt());
        }
        scanner.close();

        int n = lst.size();
        for (int i = 0; i < n; i++) {
            if (!element_counts.containsKey(lst.get(i))) {
                element_counts.put(lst.get(i), 1);
            } else {
                element_counts.put(lst.get(i), element_counts.get(lst.get(i)) + 1);
            }
        }

        for (int i = 0; i < n; i++) {
            if (element_counts.get(lst.get(i)) > 1) {
                res += n - i - element_counts.get(lst.get(i));
                element_counts.put(lst.get(i), element_counts.get(lst.get(i)) - 1);
            } else {
                res += n - i - 1;
            }
        }

        System.out.println(res);
    }
}