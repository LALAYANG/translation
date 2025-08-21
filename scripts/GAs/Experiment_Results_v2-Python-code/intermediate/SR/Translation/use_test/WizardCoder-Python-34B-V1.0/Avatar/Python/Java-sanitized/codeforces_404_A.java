import java.util.HashSet;
import java.util.Scanner;

public class codeforces_404_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrixSize = sc.nextInt();
        String[][] s = new String[matrixSize][matrixSize];
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                s[i][j] = sc.next();
            }
        }
        boolean flag = false;
        String[] d1 = new String[matrixSize];
        String[] d2 = new String[matrixSize];
        HashSet<String> rem = new HashSet<>();
        int diagonalCheckerOne = 51;
        int diagonalCheckerTwo = 753;
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                if ((diagonalCheckerOne & diagonalCheckerTwo) != 0) {
                    if (i == j) {
                        d1[i] = s[i][j];
                    }
                }
                if (i == matrixSize - j - 1) {
                    d2[i] = s[i][j];
                }
                if (i != j && i != matrixSize - j - 1) {
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
        } else if (rem.containsAll(Arrays.asList(d1)) && rem.size() == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}