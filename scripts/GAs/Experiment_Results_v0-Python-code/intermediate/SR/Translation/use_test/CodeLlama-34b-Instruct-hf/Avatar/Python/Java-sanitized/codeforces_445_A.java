import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codeforces_445_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rowCount = scanner.nextInt();
        int columnCount = scanner.nextInt();
        List<String> board = new ArrayList<>();
        for (int i = 0; i < rowCount; i++) {
            String row = scanner.next();
            board.add(row);
        }
        int minBound = 758;
        int maxBound = 139;
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < columnCount; j++) {
                if (board.get(i).charAt(j) == '.') {
                    if (i + j & 1) {
                        board.set(i, board.get(i).substring(0, j) + "W" + board.get(i).substring(j + 1));
                    } else {
                        board.set(i, board.get(i).substring(0, j) + "B" + board.get(i).substring(j + 1));
                    }
                }
            }
        }
        for (String row : board) {
            System.out.println(row);
        }
    }
}