import java.util.*;

public class codeforces_637_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] s = scanner.nextLine().split(" ");
        Map<String, Integer> w = new HashMap<>();
        for (String value : s) {
            w.put(value, w.getOrDefault(value, 0) + 1);
        }
        int c = -1;
        String a = "";
        for (String i : w.keySet()) {
            if (w.get(i).equals(Collections.max(w.values()))) {
                if (Arrays.asList(s).indexOf(i) > c) {
                    a = i;
                    c = Arrays.asList(s).indexOf(i);
                }
            }
        }
        System.out.println(a);
    }
}