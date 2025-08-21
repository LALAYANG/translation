import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codeforces_287_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> board = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            String line = scanner.nextLine();
            board.add(line);
        }
        int blackCellCount = 0;
        int whiteCellCount = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board.get(i).charAt(j) == '#') {
                    blackCellCount++;
                } else {
                    whiteCellCount++;
                }
                if (board.get(i).charAt(j + 1) == '#') {
                    blackCellCount++;
                } else {
                    whiteCellCount++;
                }
                if (board.get(i + 1).charAt(j) == '#') {
                    blackCellCount++;
                } else {
                    whiteCellCount++;
                }
                if (board.get(i + 1).charAt(j + 1) == '#') {
                    blackCellCount++;
                } else {
                    whiteCellCount++;
                }
                if (blackCellCount == 0 || blackCellCount == 3 || whiteCellCount == 0 || whiteCellCount == 3 || whiteCellCount == 4 || blackCellCount == 4) {
                    System.out.println("YES");
                    return;
                }
                blackCellCount = 0;
                whiteCellCount = 0;
            }
        }
        System.out.println("NO");
    }
}