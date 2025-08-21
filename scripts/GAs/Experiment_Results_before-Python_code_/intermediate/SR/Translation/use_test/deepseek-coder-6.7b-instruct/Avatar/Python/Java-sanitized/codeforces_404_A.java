import java.util.*;

public class codeforces_404_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = scanner.nextLine();
        }
        System.out.println(isValid(s) ? "YES" : "NO");
    }

    private static boolean isValid(String[] s) {
        int n = s.length;
        List<Character> d1 = new ArrayList<>(), d2 = new ArrayList<>();
        Set<Character> rem = new HashSet<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    d1.add(s[i].charAt(j));
                }
                if (i == n - j - 1) {
                    d2.add(s[i].charAt(j));
                }
                if (i != j && i != n - j - 1) {
                    rem.add(s[i].charAt(j));
                }
            }
        }
        if (rem.size() != 1 || !d1.equals(d2) || d1.size() != new HashSet<>(d1).size()) {
            return false;
        }
        for (char c : d1) {
            if (!rem.contains(c)) {
                return false;
            }
        }
        return true;
    }
}