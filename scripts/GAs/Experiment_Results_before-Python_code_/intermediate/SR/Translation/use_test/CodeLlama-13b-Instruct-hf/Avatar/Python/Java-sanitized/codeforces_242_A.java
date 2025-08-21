import java.util.Scanner;

public class codeforces_242_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int[][] games = new int[x - a + 1][y - b + 1];
        for (int i = a; i <= x; i++) {
            for (int j = b; j <= y; j++) {
                if (i > j) {
                    games[i - a][j - b] = 1;
                }
            }
        }

        int count = 0;
        for (int i = 0; i < games.length; i++) {
            for (int j = 0; j < games[i].length; j++) {
                if (games[i][j] == 1) {
                    count++;
                }
            }
        }

        System.out.println(count);
        for (int i = 0; i < games.length; i++) {
            for (int j = 0; j < games[i].length; j++) {
                if (games[i][j] == 1) {
                    System.out.println(i + 1 + " " + (j + 1));
                }
            }
        }
    }
}