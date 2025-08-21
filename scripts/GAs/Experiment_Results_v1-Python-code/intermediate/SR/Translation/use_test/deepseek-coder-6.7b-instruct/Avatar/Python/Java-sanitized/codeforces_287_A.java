import java.util.Scanner;

public class codeforces_287_A {
    static String[][] t;
    static int black, white, correct;

    public static void main(String[] args) {
        t = new String[4][4];
        recursiveInputReader(0, 4, 1);
        check();
        if (correct == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static void recursiveInputReader(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        Scanner scanner = new Scanner(System.in);
        for (int j = 0; j < 4; j++) {
            t[i] = scanner.next().split("");
        }
        recursiveInputReader(i + step, stop, step);
    }

    public static void check() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (t[i][j].equals("#")) {
                    black++;
                } else {
                    white++;
                }
                if (t[i][j + 1].equals("#")) {
                    black++;
                } else {
                    white++;
                }
                if (t[i + 1][j].equals("#")) {
                    black++;
                } else {
                    white++;
                }
                if (t[i + 1][j + 1].equals("#")) {
                    black++;
                } else {
                    white++;
                }
                if (black == 0 || black == 3 || white == 0 || white == 3 || white == 4 || black == 4) {
                    correct = 1;
                    break;
                }
                black = 0;
                white = 0;
            }
        }
    }
}