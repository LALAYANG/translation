import java.util.Scanner;

public class codeforces_404_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrixSize = sc.nextInt();
        String[][] matrix = new String[matrixSize][matrixSize];
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                matrix[i][j] = sc.next();
            }
        }
        boolean isMagic = true;
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                if (i == j) {
                    if (matrix[i][j] != matrix[i][j]) {
                        isMagic = false;
                        break;
                    }
                }
                if (i == matrixSize - j - 1) {
                    if (matrix[i][j] != matrix[i][j]) {
                        isMagic = false;
                        break;
                    }
                }
                if (i != j && i != matrixSize - j - 1) {
                    if (matrix[i][j] != matrix[i][j]) {
                        isMagic = false;
                        break;
                    }
                }
            }
        }
        if (isMagic) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}