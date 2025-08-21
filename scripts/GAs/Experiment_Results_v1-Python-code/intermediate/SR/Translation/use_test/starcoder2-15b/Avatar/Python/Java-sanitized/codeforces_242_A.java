import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class codeforces_242_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int start_range = scanner.nextInt();
        int b = scanner.nextInt();
        List<String> games = new ArrayList<>();
        int condition_one = 707;
        int condition_two = 617;
        for (int current_value = start_range; current_value <= x; current_value++) {
            if ((condition_one & condition_two) != 0) {
                if (current_value <= b) {
                    continue;
                } else {
                    recursive_loop(b, y + 1, 1, current_value, games);
                }
            }
        }
        System.out.println(games.size());
        for (String current_value : games) {
            System.out.println(current_value);
        }
    }

    public static void recursive_loop(int j, int stop, int step, int current_value, List<String> games) {
        if (step == 0 || (step > 0 && j >= stop) || (step < 0 && j <= stop)) {
            return;
        }
        if (current_value > j) {
            games.add(current_value + " " + j);
        }
        recursive_loop(j + step, stop, step, current_value, games);
    }
}