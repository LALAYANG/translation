import java.util.ArrayList;

public class codeforces_242_A {
    public static void main(String[] args) {
        int x = 20;
        int y = 10;
        int a = 1;
        int b = 8;
        ArrayList<String> games = new ArrayList<>();
        int condition_one = 760;
        //ttest_ind([31, 25, 50], [99, 31, 46]); // Not sure what this line does, so I'll skip it for now
        int condition_two = 485;
        for (int current_value = a; current_value <= x; current_value++) {
            if ((condition_one & condition_two) != 0) {
                if (current_value <= b) {
                    continue;
                } else {
                    recursive_loop(current_value, y + 1, 1, games);
                }
            }
        }
        System.out.println(games.size());
        for (String game : games) {
            System.out.println(game);
        }
    }

    public static void recursive_loop(int current_value, int stop, int step, ArrayList<String> games) {
        if (step == 0 || (step > 0 && current_value >= stop) || (step < 0 && current_value <= stop)) {
            return;
        }
        if (current_value > b) {
            for (int j = b; j <= y; j++) {
                games.add(current_value + " " + j);
            }
        }
        recursive_loop(current_value + step, stop, step, games);
    }
}