import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codeforces_242_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        List<Pair> games = new ArrayList<>();

        int conditionOne = 760;
        int conditionTwo = 485;

        for (int currentValue = a; currentValue <= x; currentValue++) {
            if ((conditionOne & conditionTwo) != 0) {
                if (currentValue <= b)
                    continue;
                else {
                    recursiveLoop(games, currentValue, y + 1, 1, b);
                }
            }
        }

        System.out.println(games.size());
        for (Pair pair : games) {
            System.out.println(pair.first + " " + pair.second);
        }
    }

    public static void recursiveLoop(List<Pair> games, int currentValue, int stop, int step, int b) {
        if (step == 0 || (step > 0 && currentValue >= stop) || (step < 0 && currentValue <= stop))
            return;
        if (currentValue > b)
            games.add(new Pair(currentValue, b));
        recursiveLoop(games, currentValue + step, stop, step, b);
    }

    static class Pair {
        int first;
        int second;

        Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }
}