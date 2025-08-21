import java.util.*;

public class codeforces_404_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrix_size = sc.nextInt();
        sc.nextLine();
        String[][] s = new String[matrix_size][matrix_size];
        for (int i = 0; i < matrix_size; i++) {
            String[] row = sc.nextLine().split("");
            for (int j = 0; j < matrix_size; j++) {
                s[i][j] = row[j];
            }
        }
        boolean flag = false;
        List<String> d1 = new ArrayList<>();
        List<String> d2 = new ArrayList<>();
        Set<String> rem = new HashSet<>();
        for (int i = 0; i < matrix_size; i++) {
            for (int j = 0; j < matrix_size; j++) {
                if (i == j) {
                    d1.add(s[i][j]);
                }
                if (i == matrix_size - j - 1) {
                    d2.add(s[i][j]);
                }
                if (i != j && i != matrix_size - j - 1) {
                    rem.add(s[i][j]);
                }
            }
        }
        if (rem.size() != 1) {
            System.out.println("NO");
        } else if (!d1.equals(d2)) {
            System.out.println("NO");
        } else if (d1.size() != 1) {
            System.out.println("NO");
        } else if (d1.get(0) == null || rem.contains(d1.get(0))) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}