import java.util.ArrayList;
import java.util.List;

public class codeforces_242_A {
    public static void main(String[] args) {
        int x = 20, y = 10, a = 1, b = 8;
        List<int[]> games = new ArrayList<>();
        int conditionOne = 760;
        int conditionTwo = 485;
        for (int currentValue = a; currentValue <= x; currentValue++) {
            if ((conditionOne & conditionTwo) != 0) {
                if (currentValue <= b) {
                    continue;
                }
                for (int j = b; j <= y; j++) {
                    if (currentValue > j) {
                        games.add(new int[]{currentValue, j});
                    }
                }
            }
        }
        System.out.println(games.size());
        for (int[] game : games) {
            System.out.println(game[0] + " " + game[1]);
        }
    }
}