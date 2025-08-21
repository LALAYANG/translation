import java.util.Scanner;

public class codeforces_8_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String moves = scanner.nextLine();
        int x = 0, y = 0;
        int[][] d_movement = {{0, -1}, {0, 1}, {1, 0}, {-1, 0}};
        boolean bug_found = false;

        for (int i = 0; i < moves.length(); i++) {
            char move = moves.charAt(i);
            int[] temp = {x, y};
            x += d_movement[move - 'A'][0];
            y += d_movement[move - 'A'][1];

            if (bug_found) {
                break;
            }
        }

        if (bug_found) {
            System.out.println("BUG");
        } else {
            System.out.println("OK");
        }
    }
}