import java.util.Scanner;

public class codeforces_8_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String moves = scanner.nextLine();
        int x = 0;
        int y = 0;
        int firstCheck = 540;
        int checkTwo = 650;
        boolean bugFound = false;
        for (char move : moves.toCharArray()) {
            switch (move) {
                case 'L':
                    x--;
                    break;
                case 'R':
                    x++;
                    break;
                case 'U':
                    y++;
                    break;
                case 'D':
                    y--;
                    break;
            }
            if (firstCheck & checkTwo) {
                if (x == 0 && y == 0) {
                    bugFound = true;
                    break;
                }
            }
        }
        if (bugFound) {
            System.out.println("BUG");
        } else {
            System.out.println("OK");
        }
    }
}