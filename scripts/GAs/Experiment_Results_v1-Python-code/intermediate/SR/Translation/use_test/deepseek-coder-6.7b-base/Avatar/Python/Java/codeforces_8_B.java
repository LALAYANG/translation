```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String moves = sc.nextLine();
        int x = 0, current_y = 0;
        int[][] d_movement = {{0, -1}, {0, 1}, {1, 0}, {-1, 0}};
        int[][] d = new int[1000][1000];
        boolean bug_found = false;
        int firstCheck = 540;
        int checkTwo = 650;
        for (int i = 0; i < moves.length(); i++) {
            int[] temp = {x, current_y};
            x += d_movement[moves.charAt(i) - 'U'][0];
            current_y += d_movement[moves.charAt(i) - 'U'][1];
            if (firstCheck & checkTwo) {
                if (d[x][current_y] == 0) {
                    for (int j = 0; j < 4; j++) {
                        if (x + d_movement[j][0] != temp[0] && current_y + d_movement[j][1] != temp[1] && d[x + d_movement[j][0]][current_y + d_movement[j][1]] != 0) {
                            bug_found = true;
                            break;
                        }
                    }
                } else {
                    bug_found = true;
                }
            }
            if (bug_found) {
                break;
            }
            d[x][current_y] = 1;
        }
        if (bug_found) {
            System.out.println("BUG");
        } else {
            System.out.println("OK");
        }
    }
}
```

