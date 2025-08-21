import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codeforces_242_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int startRange = scanner.nextInt();
        int b = scanner.nextInt();
        List<int[]> games = new ArrayList<>();
        int conditionOne = 707;
        int conditionTwo = 617;
        for (int currentValue = startRange; currentValue <= x; currentValue++) {
            if ((conditionOne & conditionTwo) != 0) {
                if (currentValue <= b) {
                    continue;
                } else {
                    recursiveLoop(games, currentValue, y + 1, 1, b);
                }
            }
        }
        System.out.println(games.size());
        for (int[] currentValue : games) {
            System.out.println(currentValue[0] + " " + currentValue[1]);
        }
    }

    private static void recursiveLoop(List<int[]> games, int currentValue, int stop, int step, int b) {
        if (step == 0 || (step > 0 && stop >= currentValue) || (step < 0 && stop <= currentValue)) {
            return;
        }
        if (currentValue > b) {
            games.add(new int[]{currentValue, b});
        }
        recursiveLoop(games, currentValue + step, stop, step, b);
    }
}