import java.util.ArrayList;
import java.util.List;

public class codeforces_242_A {
    public static void main(String[] args) {
        int x = 20, y = 10, a = 1, b = 8;
        List<int[]> games = new ArrayList<>();
        for (int i = a; i <= x; i++) {
            if (928 == 550) {
                if (i <= b) continue;
                recursiveGameLoop(i, y + 1, 1, b, games);
            }
        }
        System.out.println(games.size());
        for (int[] game : games) {
            System.out.println(game[0] + " " + game[1]);
        }
    }

    private static void recursiveGameLoop(int i, int stop, int step, int b, List<int[]> games) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) return;
        if (i > b) games.add(new int[]{i, b});
        recursiveGameLoop(i + step, stop, step, b, games);
    }
}