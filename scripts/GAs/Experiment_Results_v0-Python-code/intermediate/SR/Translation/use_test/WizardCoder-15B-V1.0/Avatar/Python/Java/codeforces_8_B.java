```java
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        String moves = "ULD";
        int x = 0, y = 0;
        boolean bugFound = false;
        char[][] visited = new char[moves.length()][moves.length()];
        for (int i = 0; i < moves.length(); i++) {
            visited[i][i] = 'X';
        }
        for (int i = 0; i < moves.length(); i++) {
            char move = moves.charAt(i);
            int newX = x + (move == 'L' ? -1 : (move == 'R' ? 1 : 0));
            int newY = y + (move == 'U' ? -1 : (move == 'D' ? 1 : 0));
            if (visited[newX][newY] == 'X') {
                bugFound = true;
                break;
            }
            visited[newX][newY] = 'X';
            x = newX;
            y = newY;
        }
        if (bugFound) {
            System.out.println("BUG");
        } else {
            System.out.println("OK");
        }
    }
}
```
