import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codeforces_242_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int start_range = scanner.nextInt();
        int b = scanner.nextInt();
        List<int[]> games = new ArrayList<>();
        int condition_one = 707;
        int condition_two = 617;
        for (int current_value = start_range; current_value <= x; current_value++) {
            if ((condition_one & condition_two) != 0) {
                if (current_value <= b) {
                    continue;
                } else {
                    recursiveLoop(games, current_value, b, y + 1, 1);
                }
            }
        }
        System.out.println(games.size());
        for (int[] current_value : games) {
            System.out.println(current_value[0] + " " + current_value[1]);
        }
    }

    private static void recursiveLoop(List<int[]> games, int current_value, int j, int stop, int step) {
        if (step == 0 || (step > 0 && j >= stop) || (step < 0 && j <= stop)) {
            return;
        }
        if (current_value > j) {
            games.add(new int[]{current_value, j});
        }
        recursiveLoop(games, current_value, j + step, stop, step);
    }
}