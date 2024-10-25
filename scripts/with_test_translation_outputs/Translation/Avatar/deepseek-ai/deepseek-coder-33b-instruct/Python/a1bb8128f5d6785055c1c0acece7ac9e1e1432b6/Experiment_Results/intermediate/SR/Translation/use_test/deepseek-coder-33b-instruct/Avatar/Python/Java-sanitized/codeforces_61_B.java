import java.util.*;

public class codeforces_61_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> l = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            l.add(f(scanner.next()));
        }
        List<String> permutations = new ArrayList<>();
        permute(l, 0, l.size() - 1, permutations);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            if (permutations.contains(f(scanner.next()))) {
                System.out.println("ACC");
            } else {
                System.out.println("WA");
            }
        }
    }

    private static void permute(List<String> arr, int l, int r, List<String> permutations) {
        if (l == r) {
            StringBuilder sb = new StringBuilder();
            for (String s : arr) {
                sb.append(s);
            }
            permutations.add(sb.toString());
        } else {
            for (int i = l; i <= r; i++) {
                arr = swap(arr, l, i);
                permute(arr, l + 1, r, permutations);
                arr = swap(arr, l, i);
            }
        }
    }

    private static List<String> swap(List<String> a, int i, int j) {
        Collections.swap(a, i, j);
        return a;
    }

    private static String f(String s) {
        StringBuilder r = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c != '-' && c != ';' && c != '_') {
                r.append(Character.toLowerCase(c));
            }
        }
        return r.toString();
    }
}