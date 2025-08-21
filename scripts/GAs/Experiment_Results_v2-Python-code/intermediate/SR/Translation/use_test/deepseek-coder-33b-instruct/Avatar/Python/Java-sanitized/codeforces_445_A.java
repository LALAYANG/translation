import java.util.Scanner;

public class codeforces_445_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();
        String[] chessboard = new String[n];
        for (int rowIndex = 0; rowIndex < n; rowIndex++) {
            String currentRow = scanner.nextLine();
            StringBuilder sb = new StringBuilder(currentRow);
            for (int j = 0; j < m; j++) {
                if (currentRow.charAt(j) == '.') {
                    if ((rowIndex + j) % 2 == 1) {
                        sb.setCharAt(j, 'W');
                    } else {
                        sb.setCharAt(j, 'B');
                    }
                }
            }
            chessboard[rowIndex] = sb.toString();
        }
        for (String c : chessboard) {
            System.out.println(c);
        }
    }
}