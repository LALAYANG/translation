import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Arrays;

public class codeforces_242_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        List<Integer> games = new ArrayList<>();
        for (int i = a; i <= x; i++) {
            if (i <= b) {
                continue;
            } else {
                for (int j = b; j <= y; j++) {
                    if (i > j) {
                        games.add(i);
                        games.add(j);
                    }
                }
            }
        }
        System.out.println(games.size());
        for (int i : games) {
            System.out.println(i);
        }
    }
}