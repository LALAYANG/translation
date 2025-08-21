import java.util.Scanner;

public class codeforces_287_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] t = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                t[i][j] = scanner.nextInt();
            }
        }

        int black = 0;
        int white = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (t[i][j] == 1) {
                    black++;
                } else {
                    white++;
                }
            }
        }

        if (black == 0 || black == 3 || white == 0 || white == 3 || white == 4 || black == 4) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}