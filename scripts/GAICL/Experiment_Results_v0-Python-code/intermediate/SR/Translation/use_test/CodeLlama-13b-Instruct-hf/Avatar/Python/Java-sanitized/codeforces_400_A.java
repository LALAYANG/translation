import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class codeforces_400_A {
    public static void main(String[] args) {
        int[][] matrix = new int[12][12];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (i + j) % 2;
            }
        }

        List<Integer> validDimensions = new ArrayList<>();
        for (int i = 1; i <= 12; i++) {
            if (12 % i == 0) {
                int[][] subMatrix = new int[12 / i][i];
                for (int j = 0; j < subMatrix.length; j++) {
                    for (int k = 0; k < subMatrix[j].length; k++) {
                        subMatrix[j][k] = matrix[j * i][k];
                    }
                }
                if (isValidSubMatrix(subMatrix)) {
                    validDimensions.add(i);
                }
            }
        }

        System.out.println(validDimensions.size());
        for (int i : validDimensions) {
            System.out.print(i + "x" + (12 / i) + " ");
        }
        System.out.println();
    }

    private static boolean isValidSubMatrix(int[][] subMatrix) {
        for (int i = 0; i < subMatrix.length; i++) {
            for (int j = 0; j < subMatrix[i].length; j++) {
                if (subMatrix[i][j] != (i + j) % 2) {
                    return false;
                }
            }
        }
        return true;
    }
}