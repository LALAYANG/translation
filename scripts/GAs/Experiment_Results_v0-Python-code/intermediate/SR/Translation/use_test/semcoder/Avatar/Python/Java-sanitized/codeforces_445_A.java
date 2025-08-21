import java.util.Scanner;

public class codeforces_445_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rowCount = scanner.nextInt();
        int columnCount = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        char[][] cells = new char[rowCount][columnCount];

        for (int i = 0; i < rowCount; i++) {
            String line = scanner.nextLine();
            for (int j = 0; j < columnCount; j++) {
                cells[i][j] = line.charAt(j);
            }
        }

        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < columnCount; j++) {
                if (cells[i][j] == '.') {
                    if ((i + j) % 2 == 0) {
                        cells[i][j] = 'B';
                    } else {
                        cells[i][j] = 'W';
                    }
                }
            }
        }

        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < columnCount; j++) {
                System.out.print(cells[i][j]);
            }
            System.out.println();
        }
    }
}