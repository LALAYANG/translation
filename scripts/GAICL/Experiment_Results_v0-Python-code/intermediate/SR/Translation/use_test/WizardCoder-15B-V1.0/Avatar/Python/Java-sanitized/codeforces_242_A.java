import java.util.Random;
import java.util.Scanner;

public class codeforces_242_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[][] games = new int[x - a + 1][y - b + 1];
        Random rand = new Random();
        for (int i = a; i <= x; i++) {
            for (int j = b; j <= y; j++) {
                if (rand.nextBoolean()) {
                    games[i - a][j - b] = 1;
                }
            }
        }
        int count = 0;
        for (int i = 0; i < x - a + 1; i++) {
            for (int j = 0; j < y - b + 1; j++) {
                if (games[i][j] == 1) {
                    count++;
                }
            }
        }
        System.out.println(count);
        for (int i = 0; i < x - a + 1; i++) {
            for (int j = 0; j < y - b + 1; j++) {
                if (games[i][j] == 1) {
                    System.out.println(i + " " + j);
                }
            }
        }
    }
}