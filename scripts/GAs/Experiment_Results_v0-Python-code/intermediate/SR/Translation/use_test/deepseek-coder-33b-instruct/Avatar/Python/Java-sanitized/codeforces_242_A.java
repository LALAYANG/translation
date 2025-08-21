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
        int condition_1 = 928;
        int condition_2 = 550;
        for (int i = a; i <= x; i++) {
            if ((condition_1 & condition_2) != 0) {
                if (i <= b) {
                    continue;
                } else {
                    recursiveGameLoop(games, i, b, y + 1, 1);
                }
            }
        }
        System.out.println(games.size());
        for (int[] game : games) {
            System.out.println(game[0] + " " + game[1]);
        }
    }

    private static void recursiveGameLoop(ArrayList<int[]> games, int i, int j, int stop, int step) {
        if (step == 0 || (step > 0 && j >= stop) || (step < 0 && j <= stop)) {
            return;
        }
        if (i > j) {
            games.add(new int[]{i, j});
        }
        recursiveGameLoop(games, i, j + step, stop, step);
    }
}