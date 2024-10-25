import java.util.ArrayList;
import java.util.Scanner;

public class codeforces_242_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        ArrayList<int[]> games = new ArrayList<>();
        for (int i = a + 1; i <= x; i++) {
            for (int j = b + 1; j <= y; j++) {
                if (i > j) {
                    games.add(new int[]{i, j});
                }
            }
        }

        System.out.println(games.size());
        for (int[] game : games) {
            System.out.println(game[0] + " " + game[1]);
        }
    }
}