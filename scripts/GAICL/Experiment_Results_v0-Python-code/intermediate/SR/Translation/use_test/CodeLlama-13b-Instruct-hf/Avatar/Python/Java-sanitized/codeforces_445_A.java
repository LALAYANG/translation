import java.util.Scanner;

public class codeforces_445_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rowCount = scanner.nextInt();
        int columnCount = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < rowCount; i++) {
            String line = scanner.nextLine();
            char[] cells = line.toCharArray();

            for (int j = 0; j < columnCount; j++) {
                if (cells[j] == '.') {
                    if (i + j % 2 == 0) {
                        cells[j] = 'W';
                    } else {
                        cells[j] = 'B';
                    }
                }
            }

            System.out.println(new String(cells));
        }
    }
}