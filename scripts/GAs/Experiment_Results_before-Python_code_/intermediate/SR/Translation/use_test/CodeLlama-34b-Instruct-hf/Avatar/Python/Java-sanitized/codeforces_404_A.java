import java.util.Scanner;

public class codeforces_404_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[][] s = new String[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                s[i][j] = sc.next();
            }
        }

        boolean flag = true;
        String[] d1 = new String[n];
        String[] d2 = new String[n];
        Set<String> rem = new HashSet<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    d1[i] = s[i][j];
                } else if (i == n - j - 1) {
                    d2[i] = s[i][j];
                } else {
                    rem.add(s[i][j]);
                }
            }
        }

        if (rem.size() != 1) {
            System.out.println("NO");
        } else if (!Arrays.equals(d1, d2)) {
            System.out.println("NO");
        } else if (new HashSet<>(Arrays.asList(d1)).size() != 1) {
            System.out.println("NO");
        } else if (rem.containsAll(Arrays.asList(d1))) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}