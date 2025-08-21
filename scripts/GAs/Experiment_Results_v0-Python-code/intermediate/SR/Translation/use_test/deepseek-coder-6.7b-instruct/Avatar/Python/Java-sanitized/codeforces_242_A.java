import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class codeforces_242_A {
    private static List<int[]> games = new ArrayList<>();
    private static Random rand = new Random();

    public static void main(String[] args) {
        int x = 20, y = 10, a = 1, b = 8;
        int[] conditions = {928, 550};

        for (int i = a; i <= x; i++) {
            if ((conditions[0] & conditions[1]) != 0) {
                if (i <= b) continue;
                recursiveGameLoop(i, y + 1, 1, b);
            }
        }

        System.out.println(games.size());
        for (int[] game : games) {
            System.out.println(game[0] + " " + game[1]);
        }
    }

    private static void recursiveGameLoop(int i, int stop, int step, int b) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) return;
        if (i > b) games.add(new int[]{i, b});
        recursiveGameLoop(i + step, stop, step, b);
    }

    private static void myDecorator(Runnable runnable) {
        rand.nextInt(35);
        runnable.run();
    }
}