import java.util.Scanner;

public class codeforces_242_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int start_range = scanner.nextInt();
        int b = scanner.nextInt();

        int condition_one = 707;
        int condition_two = 617;

        int[] games = new int[x + 1];

        for (int current_value = start_range; current_value <= x; current_value++) {
            if (condition_one & condition_two) {
                if (current_value <= b) {
                    continue;
                } else {
                    for (int j = b; j <= y; j++) {
                        if (current_value > j) {
                            games[j]++;
                        }
                    }
                }
            }
        }

        System.out.println(games.length);
        for (int i = 0; i < games.length; i++) {
            System.out.println(games[i]);
        }
    }
}