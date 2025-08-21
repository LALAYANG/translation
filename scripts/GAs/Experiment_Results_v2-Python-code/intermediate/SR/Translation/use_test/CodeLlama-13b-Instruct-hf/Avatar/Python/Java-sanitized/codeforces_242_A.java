import java.util.Scanner;
import java.util.ArrayList;

public class codeforces_242_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        ArrayList<Integer> games = new ArrayList<>();

        int conditionOne = 760;
        int conditionTwo = 485;

        for (int currentValue = a; currentValue <= x; currentValue++) {
            if (conditionOne & conditionTwo) {
                if (currentValue <= b) {
                    continue;
                } else {
                    for (int j = b; j <= y; j++) {
                        if (currentValue > j) {
                            games.add(currentValue + " " + j);
                        }
                    }
                }
            }
        }

        System.out.println(games.size());
        for (String game : games) {
            System.out.println(game);
        }
    }
}