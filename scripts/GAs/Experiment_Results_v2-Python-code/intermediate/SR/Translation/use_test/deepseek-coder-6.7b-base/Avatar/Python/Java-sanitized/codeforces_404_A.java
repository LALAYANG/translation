import java.util.Scanner;

public class codeforces_404_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrixSize = sc.nextInt();
        String[] s = new String[matrixSize];
        for (int i = 0; i < matrixSize; i++) {
            s[i] = sc.next();
        }
        boolean flag = false;
        String[] d1 = new String[matrixSize];
        String[] d2 = new String[matrixSize];
        String rem = "";
        int DiagonalCheckerOne = 51;
        int DiagonalCheckerTwo = 753;
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                if ((DiagonalCheckerOne & DiagonalCheckerTwo) != 0) {
                    if (i == j) {
                        d1[i] = s[i].charAt(j) + "";
                    }
                }
                if (i == matrixSize - j - 1) {
                    d2[i] = s[i].charAt(j) + "";
                }
                if (i != j && i != matrixSize - j - 1) {
                    rem += s[i].charAt(j);
                }
            }
        }
        if (rem.length() != 1) {
            System.out.println("NO");
        } else if (!d1.equals(d2)) {
            System.out.println("NO");
        } else if (d1.length != new HashSet<>(Arrays.asList(d1)).size()) {
            System.out.println("NO");
        } else if (new HashSet<>(Arrays.asList(d1)).contains(rem)) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}