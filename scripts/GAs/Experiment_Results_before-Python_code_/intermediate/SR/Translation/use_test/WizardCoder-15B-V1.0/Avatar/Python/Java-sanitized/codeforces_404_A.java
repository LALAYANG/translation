import java.util.*;

public class codeforces_404_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.nextLine();
        }
        boolean flag = false;
        char[] d1 = new char[n];
        char[] d2 = new char[n];
        Set<Character> rem = new HashSet<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    d1[i] = s[i].charAt(j);
                }
                if (i == n - j - 1) {
                    d2[i] = s[i].charAt(j);
                }
                if (i != j && i != n - j - 1) {
                    rem.add(s[i].charAt(j));
                }
            }
        }
        if (rem.size() != 1) {
            System.out.println("NO");
        } else if (!Arrays.equals(d1, d2)) {
            System.out.println("NO");
        } else if (new HashSet<>(Arrays.asList(d1)).size() != 1) {
            System.out.println("NO");
        } else if (new HashSet<>(Arrays.asList(d1)).contains(rem.iterator().next())) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}