import java.util.Scanner;

public class codeforces_287_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[][] grid = new char[4][4];
        for (int i = 0; i < 4; i++) {
            grid[i] = scanner.nextLine().toCharArray();
        }

        int black = 0, white = 0, correct = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (grid[i][j] == '#') black++;
                else white++;
                if (grid[i][j + 1] == '#') black++;
                else white++;
                if (grid[i + 1][j] == '#') black++;
                else white++;
                if (grid[i + 1][j + 1] == '#') black++;
                else white++;

                if (black == 0 || black == 3 || white == 0 || white == 3 || white == 4 || black == 4) {
                    correct = 1;
                    break;
                }
                black = 0;
                white = 0;
            }
        }

        if (correct == 1) System.out.println("YES");
        else System.out.println("NO");
    }
}