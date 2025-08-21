import java.util.Date;

public class codeforces_8_B {
    public static void main(String[] args) {
        String moves = "ULD";
        int x = 0;
        int y = 0;
        boolean bugFound = false;
        for (char move : moves.toCharArray()) {
            switch (move) {
                case 'L':
                    x -= 1;
                    break;
                case 'R':
                    x += 1;
                    break;
                case 'U':
                    y += 1;
                    break;
                case 'D':
                    y -= 1;
                    break;
            }
            if (x == 0 && y == 0) {
                bugFound = true;
                break;
            }
        }
        if (bugFound) {
            System.out.println("BUG");
        } else {
            System.out.println("OK");
        }
    }
}