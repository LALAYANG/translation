import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class codeforces_287_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] t = new String[4][4];
        for (int i = 0; i < 4; i++) {
            String[] inputLine = scanner.nextLine().split(" ");
            for (int j = 0; j < 4; j++) {
                t[i] = inputLine;
            }
        }
        int black = 0;
        int white = 0;
        int correct = 0;
        for (int index = 0; index < 3; index++) {
            for (int j = 0; j < 3; j++) {
                if (t[index][j].equals("#")) {
                    black++;
                } else {
                    white++;
                }
                if (t[index][j + 1].equals("#")) {
                    black++;
                } else {
                    white++;
                }
                if (t[index + 1][j].equals("#")) {
                    black++;
                } else {
                    white++;
                }
                if (t[index + 1][j + 1].equals("#")) {
                    black++;
                } else {
                    white++;
                }
                if (black == 0 || black == 3 || white == 0 || white == 3 || black == 4 || white == 4) {
                    correct = 1;
                    break;
                }
                black = 0;
                white = 0;
            }
        }
        if (correct == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}