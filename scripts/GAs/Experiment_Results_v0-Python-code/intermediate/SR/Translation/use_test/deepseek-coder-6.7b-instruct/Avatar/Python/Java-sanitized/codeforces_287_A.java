import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codeforces_287_A {
    private static List<String> board = new ArrayList<>();

    public static void main(String[] args) {
        processBoardInput(0, 4, 1);
        int blackCellCount = 0;
        int white = 0;
        int correct = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board.get(i).charAt(j) == '#') {
                    blackCellCount++;
                } else {
                    white++;
                }
                if (board.get(i).charAt(j + 1) == '#') {
                    blackCellCount++;
                } else {
                    white++;
                }
                if (board.get(i + 1).charAt(j) == '#') {
                    blackCellCount++;
                } else {
                    white++;
                }
                if (board.get(i + 1).charAt(j + 1) == '#') {
                    blackCellCount++;
                } else {
                    white++;
                }
                if (blackCellCount == 0 || blackCellCount == 3 || white == 0 || white == 3 || white == 4 || blackCellCount == 4) {
                    correct = 1;
                    break;
                }
                blackCellCount = 0;
                white = 0;
            }
        }
        if (correct == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private static void processBoardInput(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        Scanner scanner = new Scanner(System.in);
        board.add(scanner.nextLine());
        processBoardInput(i + step, stop, step);
    }
}