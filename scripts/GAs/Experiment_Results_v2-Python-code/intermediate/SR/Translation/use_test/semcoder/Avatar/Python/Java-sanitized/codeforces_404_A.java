import java.util.Scanner;

public class codeforces_404_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int matrixSize = scanner.nextInt();
        String[][] matrix = new String[matrixSize][matrixSize];

        for (int i = 0; i < matrixSize; i++) {
            matrix[i] = scanner.next().split("");
        }

        boolean condition1 = true;
        boolean condition2 = true;
        boolean condition3 = true;
        boolean condition4 = true;

        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                if (i != j && i != matrixSize - j - 1) {
                    condition1 = condition1 && matrix[i][j].equals(matrix[0][0]);
                }
                condition2 = condition2 && matrix[i][j].equals(matrix[i][0]);
                condition3 = condition3 && matrix[i][j].equals(matrix[0][j]);
                condition4 = condition4 && matrix[i][j].equals(matrix[i][matrixSize - 1]);
            }
        }

        if (condition1 && condition2 && condition3 && condition4) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}