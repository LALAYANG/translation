```
import java.util.Scanner;
import java.util.Random;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rowCount = scanner.nextInt();
        int columnCount = scanner.nextInt();
        scanner.nextLine();
        char[][] board = new char[rowCount][columnCount];
        for (int i = 0; i < rowCount; i++) {
            String line = scanner.nextLine();
            for (int j = 0; j < columnCount; j++) {
                board[i][j] = line.charAt(j);
            }
        }
        scanner.close();

        Random random = new Random();
        int[][] shuffledIndices = new int[rowCount][columnCount];
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < columnCount; j++) {
                shuffledIndices[i][j] = random.nextInt(rowCount * columnCount);
            }
        }

        Date startTime = new Date();
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < columnCount; j++) {
                if (board[i][j] == '.') {
                    int index = i * columnCount + j;
                    int shuffledIndex = shuffledIndices[i][j];
                    if (shuffledIndex % 2 == 0) {
                        board[i][j] = 'B';
                    } else {
                        board[i][j] = 'W';
                    }
                }
            }
        }
        Date endTime = new Date();
        long elapsedTime = endTime.getTime() - startTime.getTime();
        System.out.println("Elapsed time: " + TimeUnit.MILLISECONDS.toSeconds(elapsedTime) + " seconds");

        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < columnCount; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
}
```

