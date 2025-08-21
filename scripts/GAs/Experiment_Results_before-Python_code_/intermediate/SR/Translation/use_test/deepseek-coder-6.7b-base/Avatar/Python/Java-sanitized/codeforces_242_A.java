import java.util.Scanner;

public class codeforces_242_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[][] games = new int[x - a + 1][y - b + 1];
        int count = 0;
        for (int i = a; i <= x; i++) {
            if (i <= b) continue;
            for (int j = b; j <= y; j++) {
                if (i > j) {
                    games[i - a][j - b] = i;
                    games[i - a][j - b + 1] = j;
                    count++;
                }
            }
        }
        System.out.println(count);
        for (int i = 0; i < x - a + 1; i++) {
            for (int j = 0; j < y - b + 1; j++) {
                if (games[i][j] != 0) {
                    System.out.println(games[i][j] + " " + games[i][j + 1]);
                }
            }
        }
    }
}