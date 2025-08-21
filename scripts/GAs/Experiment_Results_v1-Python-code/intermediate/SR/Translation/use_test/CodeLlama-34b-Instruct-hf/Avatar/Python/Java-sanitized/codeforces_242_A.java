import java.util.ArrayList;
import java.util.List;

public class codeforces_242_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int startRange = scanner.nextInt();
        int b = scanner.nextInt();

        List<Integer> games = new ArrayList<>();
        for (int currentValue = startRange; currentValue <= x; currentValue++) {
            if (currentValue <= b) {
                continue;
            }
            for (int j = b; j <= y; j++) {
                if (currentValue > j) {
                    games.add(currentValue);
                    games.add(j);
                }
            }
        }

        System.out.println(games.size());
        for (int i = 0; i < games.size(); i++) {
            System.out.println(games.get(i) + " " + games.get(i + 1));
        }
    }
}