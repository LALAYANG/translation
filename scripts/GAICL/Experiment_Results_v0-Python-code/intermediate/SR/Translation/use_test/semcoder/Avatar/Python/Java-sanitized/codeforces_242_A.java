import java.util.ArrayList;
import java.util.List;

public class codeforces_242_A {
    public static void main(String[] args) {
        int x = 20;
        int y = 10;
        int a = 1;
        int b = 8;

        List<int[]> games = new ArrayList<>();

        for (int i = a; i <= x; i++) {
            if (i <= b) {
                continue;
            }

            for (int j = b; j <= y; j++) {
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