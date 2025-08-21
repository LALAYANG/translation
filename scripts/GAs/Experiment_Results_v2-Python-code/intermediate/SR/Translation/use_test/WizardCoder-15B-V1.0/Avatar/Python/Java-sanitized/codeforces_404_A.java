import java.util.*;

public class codeforces_404_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrixSize = sc.nextInt();
        sc.nextLine();
        String[][] matrix = new String[matrixSize][matrixSize];
        for (int i = 0; i < matrixSize; i++) {
            String[] row = sc.nextLine().split("");
            matrix[i] = row;
        }
        boolean result = checkMatrix(matrix);
        if (result) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static boolean checkMatrix(String[][] matrix) {
        int diagonalOne = 0;
        int diagonalTwo = 0;
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == j) {
                    diagonalOne = diagonalOne * 10 + (matrix[i][j].charAt(0) - 'a' + 1);
                }
                if (i == matrix.length - j - 1) {
                    diagonalTwo = diagonalTwo * 10 + (matrix[i][j].charAt(0) - 'a' + 1);
                }
                set.add(matrix[i][j].charAt(0));
            }
        }
        if (set.size() != 1) {
            return false;
        }
        if (diagonalOne != diagonalTwo) {
            return false;
        }
        return true;
    }
}