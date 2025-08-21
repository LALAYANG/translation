import java.util.ArrayList;
import java.util.Scanner;

public class codeforces_242_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int startRange = scanner.nextInt();
        int b = scanner.nextInt();

        ArrayList<int[]> games = new ArrayList<>();

        int conditionOne = 707;
        int conditionTwo = 617;

        for (int currentValue = startRange; currentValue <= x; currentValue++) {
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