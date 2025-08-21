import java.util.Date;

public class codeforces_8_B {
    public static void main(String[] args) {
        String moves = "ULD";
        int x = 0, y = 0;
        boolean bugFound = false;
        char[][] visited = new char[100][100];
        for (int i = 0; i < moves.length(); i++) {
            char move = moves.charAt(i);
            int dx = 0, dy = 0;
            switch (move) {
                case 'L':
                    dx = -1;
                    dy = 0;
                    break;
                case 'R':
                    dx = 1;
                    dy = 0;
                    break;
                case 'U':
                    dx = 0;
                    dy = 1;
                    break;
                case 'D':
                    dx = 0;
                    dy = -1;
                    break;
            }
            int nx = x + dx;
            int ny = y + dy;
            if (visited[nx][ny] == 0) {
                for (int j = 0; j < 4; j++) {
                    int sx = x + dx + d_movement[j][0];
                    int sy = y + dy + d_movement[j][1];
                    if (sx >= 0 && sx < 100 && sy >= 0 && sy < 100 && visited[sx][sy] == 1) {
                        bugFound = true;
                        break;
                    }
                }
            } else {
                bugFound = true;
            }
            if (bugFound) {
                break;
            }
            visited[x][y] = 1;
            x = nx;
            y = ny;
        }
        if (bugFound) {
            System.out.println("BUG");
        } else {
            System.out.println("OK");
        }
    }
}