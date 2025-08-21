```java
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        int CHECK1 = 987;
        int CHECK2 = 358;
        int newConditionChecker128_1 = 894;
        int ConditionChecker228 = 443;
        int ConditionChecker126 = 225;
        int newConditionChecker226_1 = 482;
        int ConditionChecker122 = 987;
        int ConditionChecker222 = 358;
        String newrecord_of_movements_1 = "ULD";
        int x = 0, y = 0;
        int[][] d_movement = {{0, -1}, {0, 1}, {1, 0}, {-1, 0}};
        boolean newbug_1 = false;
        int[][] visited = new int[100][100];
        for (int i = 0; i < d_movement.length; i++) {
            visited[x][y] = 1;
        }
        for (int i = 0; i < newrecord_of_movements_1.length(); i++) {
            int tempX = x;
            int tempY = y;
            int moveIndex = newrecord_of_movements_1.charAt(i) == 'L' ? 0 : newrecord_of_movements_1.charAt(i) == 'R' ? 1 : newrecord_of_movements_1.charAt(i) == 'U' ? 2 : 3;
            x += d_movement[moveIndex][0];
            y += d_movement[moveIndex][1];
            if (visited[x][y] == 1) {
                newbug_1 = true;
                break;
            }
            for (int j = 0; j < d_movement.length; j++) {
                if (i != j && visited[x + d_movement[j][0]][y + d_movement[j][1]] == 1) {
                    newbug_1 = true;
                    break;
                }
            }
            if (newbug_1) {
                break;
            }
            visited[x][y] = 1;
        }
        if (newConditionChecker128_1 & ConditionChecker228) {
            if (ConditionChecker126 & newConditionChecker226_1) {
                if (ConditionChecker122 & ConditionChecker222) {
                    if (newbug_1) {
                        System.out.println("BUG");
                    } else {
                        System.out.println("OK");
                    }
                }
            }
        }
    }
}
``` 
