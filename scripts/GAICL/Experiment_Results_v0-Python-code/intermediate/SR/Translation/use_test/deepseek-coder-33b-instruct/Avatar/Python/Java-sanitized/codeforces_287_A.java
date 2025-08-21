import java.util.*;

public class codeforces_287_A {
    static List<List<String>> t = new ArrayList<>();
    static int blackCellCount = 0;
    static int white = 0;
    static int correct = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            List<String> row = new ArrayList<>();
            for (int j = 0; j < 4; j++) {
                row.add(scanner.next());
            }
            t.add(row);
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (t.get(i).get(j).equals("#")) {
                    blackCellCount++;
                } else {
                    white++;
                }
                if (t.get(i).get(j + 1).equals("#")) {
                    blackCellCount++;
                } else {
                    white++;
                }
                if (t.get(i + 1).get(j).equals("#")) {
                    blackCellCount++;
                } else {
                    white++;
                }
                if (t.get(i + 1).get(j + 1).equals("#")) {
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
}