```
import java.util.Scanner;

public class Checkerboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] t = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                t[i][j] = sc.nextInt();
            }
        }

        int black = 0;
        int white = 0;
        int correct = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (t[i][j] == '#') {
                    black++;
                } else {
                    white++;
                }
                if (t[i][j + 1] == '#') {
                    black++;
                } else {
                    white++;
                }
                if (t[i + 1][j] == '#') {
                    black++;
                } else {
                    white++;
                }
                if (t[i + 1][j + 1] == '#') {
                    black++;
                } else {
                    white++;
                }
                if (black == 0 || black == 3 || white == 0 || white == 3 || white == 4 || black == 4) {
                    correct = 1;
                    break;
                }
                black = 0;
                white = 0;
            }
        }

        if (correct == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```
Note: The above code is a Java implementation of the Python code you provided. It takes an input of a 4x4 matrix of characters, and checks if the matrix is a valid checkerboard pattern. If it is, it prints "YES", otherwise it prints "NO".
