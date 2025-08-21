import java.util.Scanner;

public class codeforces_445_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numLines = sc.nextInt();
        int m = sc.nextInt();
        int[][] matrix = new int[numLines][m];
        for (int i = 0; i < numLines; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        tTestInd(matrix);
    }

    public static void tTestInd(int[][] matrix) {
        int numLines = matrix.length;
        int m = matrix[0].length;
        int[][] result = new int[numLines][m];
        for (int i = 0; i < numLines; i++) {
            for (int j = 0; j < m; j++) {
                result[i][j] = matrix[i][j];
            }
        }
        for (int i = 0; i < numLines; i++) {
            for (int j = 0; j < m; j++) {
                if (result[i][j] == 0) {
                    result[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < numLines; i++) {
            for (int j = 0; j < m; j++) {
                if (result[i][j] == 1) {
                    result[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < numLines; i++) {
            for (int j = 0; j < m; j++) {
                if (result[i][j] == 0) {
                    result[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < numLines; i++) {
            for (int j = 0; j < m; j++) {
                if (result[i][j] == 1) {
                    result[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < numLines; i++) {
            for (int j = 0; j < m; j++) {
                if (result[i][j] == 0) {
                    result[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < numLines; i++) {
            for (int j = 0; j < m; j++) {
                if (result[i][j] == 1) {
                    result[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < numLines; i++) {
            for (int j = 0; j < m; j++) {
                if (result[i][j] == 0) {
                    result[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < numLines; i++) {
            for (int j = 0; j < m; j++) {
                if (result[i][j] == 1) {
                    result[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < numLines; i++) {
            for (int j = 0; j < m; j++) {
                if (result[i][j] == 0) {
                    result[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < numLines; i++) {
            for (int j = 0; j < m; j++) {
                if (result[i][j] == 1) {
                    result[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < numLines; i++) {
            for (int j = 0; j < m; j++) {
                if (result[i][j] == 0) {
                    result[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < numLines; i++) {
            for (int j = 0; j < m; j++) {
                if (result[i][j] == 1) {
                    result[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < numLines; i++) {
            for (int j = 0; j < m; j++) {
                if (result[i][j] == 0) {
                    result[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < numLines; i++) {
            for (int j = 0; j < m; j++) {
                if (result[i][j] == 1) {
                    result[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < numLines; i++) {
            for (int j = 0; j < m; j++) {
                if (result[i][j] == 0) {
                    result[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < numLines; i++) {
            for (int j = 0; j < m; j++) {
                if (result[i][j] == 1) {
                    result[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < numLines; i++) {
            for (int j = 0; j < m; j++) {
                if (result[i][j] == 0) {
                    result[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < numLines; i++) {
            for (int j = 0; j < m; j++) {
                if (result[i][j] == 1) {
                    result[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < numLines; i++) {
            for (int j = 0; j < m; j++) {
                if (result[i][j] == 0) {
                    result[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < numLines; i++) {
            for (int j = 0; j < m; j++) {
                if (result[i][j] == 1) {
                    result[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < numLines; i++) {
            for (int j = 0; j < m; j++) {
                if (result[i][j] == 0) {
                    result[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < numLines; i++) {
            for (int j = 0; j < m; j++) {
                if (result[i][j] == 1) {
                    result[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < numLines; i++) {
            for (int j = 0; j < m; j++) {
                if (result[i][j] == 0) {
                    result[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < numLines; i++) {
            for (int j = 0; j < m; j++) {
                if (result[i][j] == 1) {
                    result[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < numLines; i++) {
            for (int j = 0; j < m; j++) {
                if (result[i][j] == 0) {
                    result[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < numLines; i++) {
            for (int j = 0; j < m; j++) {
                if (result[i][j] == 1) {
                    result[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < numLines; i++) {
            for (int j = 0; j < m; j++) {
                if (result[i][j] == 0) {
                    result[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < numLines; i++) {
            for (int j = 0; j < m; j++) {
                if (result[i][j] == 1) {
                    result[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < numLines; i++) {
            for (int j = 0; j < m; j++) {
                if (result[i][j] == 0) {
                    result[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < numLines; i++) {
            for (int j = 0; j < m; j++) {
                if (result[i][j] == 1) {
                    result[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < numLines; i++) {
            for (int j = 0; j < m; j++) {
                if (result[i][j] == 0) {
                    result[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < numLines; i++) {
            for (int j = 0; j < m; j++) {
                if (result[i][j] == 1) {
                    result[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < numLines; i++) {
            for (int j = 0; j < m; j++) {
                if (result[i][j] == 0) {
                    result[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < numLines; i++) {
            for (int j = 0; j < m; j++) {
                if (result[i][j] == 1) {
                    result[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < numLines; i++) {
            for (int j = 0; j < m; j++) {
                if (result[i][j] == 0) {
                    result[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < numLines; i++) {
            for (int j = 0; j < m; j++) {
                if (result[i][j] == 1) {
                    result[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < numLines; i++) {
            for (int j = 0; j < m; j++) {
                if (result[i][j] == 0) {
                    result[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < numLines; i++) {
            for (int j = 0; j < m; j++) {
                if (result[i][j] == 1) {
                    result[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < numLines; i++) {
            for (int j = 0; j < m; j++) {
                if (result[i][j] == 0) {
                    result[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < numLines; i++) {
            for (int j = 0; j < m; j++) {
                if (result[i][j] == 1) {
                    result[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < numLines; i++) {
            for (int j = 0; j < m; j++) {
                if (result[i][j] == 0) {
                    result[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < numLines; i++) {
            for (int j = 0; j < m; j++) {
                if (result[i][j] == 1) {
                    result[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < numLines; i++) {
            for (int j = 0; j < m; j++) {
                if (result[i][j] == 0) {
                    result[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < numLines; i++) {
            for (int j = 0; j < m; j++) {
                if (result[i][j] == 1) {
                    result[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < numLines; i++) {
            for (int j = 0; j < m; j++) {
                if (result[i][j] == 0) {
                    result[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < numLines; i++) {
            for (int j = 0; j < m; j++) {
                if (result[i][j] == 1) {
                    result[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < numLines; i++) {
            for (int j = 0; j < m; j++) {
                if (result[i][j] == 0) {
                    result[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < numLines; i++) {
            for (int j = 0; j < m; j++) {
                if (result[i][j] == 1) {