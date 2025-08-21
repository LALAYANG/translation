import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class codeforces_445_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rowCount = scanner.nextInt();
        int columnCount = scanner.nextInt();
        scanner.nextLine();

        ArrayList<String> l = new ArrayList<>();
        for (int i = 0; i < rowCount; i++) {
            String s = scanner.nextLine();
            char[] chars = s.toCharArray();
            fillCells(chars, columnCount, i);
            l.add(String.valueOf(chars));
        }

        for (String c : l) {
            System.out.println(c);
        }
    }

    private static void fillCells(char[] chars, int columnCount, int i) {
        for (int j = 0; j < columnCount; j++) {
            if (chars[j] == '.') {
                if ((i + j) % 2 == 0) {
                    chars[j] = 'B';
                } else {
                    chars[j] = 'W';
                }
            }
        }
    }
}