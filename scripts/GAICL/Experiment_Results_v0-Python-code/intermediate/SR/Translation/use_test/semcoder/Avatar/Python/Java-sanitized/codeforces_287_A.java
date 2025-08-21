import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codeforces_287_A {
    public static void main(String[] args) {
        List<String> board = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            board.add(scanner.nextLine());
        }

        int blackCellCount = 0;
        int whiteCount = 0;
        boolean correct = false;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board.get(i).charAt(j) == '#') {
                    blackCellCount++;
                } else {
                    whiteCount++;
                }

                if (board.get(i).charAt(j + 1) == '#') {
                    blackCellCount++;
                } else {
                    whiteCount++;
                }

                if (board.get(i + 1).charAt(j) == '#') {
                    blackCellCount++;
                } else {
                    whiteCount++;
                }

                if (board.get(i + 1).charAt(j + 1) == '#') {
                    blackCellCount++;
                } else {
                    whiteCount++;
                }

                if (blackCellCount == 0 || blackCellCount == 3 || whiteCount == 0 || whiteCount == 3 || whiteCount == 4 || blackCellCount == 4) {
                    correct = true;
                    break;
                }

                blackCellCount = 0;
                whiteCount = 0;
            }
        }

        if (correct) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}