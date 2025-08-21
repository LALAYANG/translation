import java.util.Scanner;

public class codeforces_400_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[][] grid = new int[n][m];
        
        for (int i = 0; i < n; i++) {
            String line = sc.next();
            for (int j = 0; j < m; j++) {
                if (line.charAt(j) == 'S') {
                    grid[i][j] = 1;
                } else if (line.charAt(j) == 'G') {
                    grid[i][j] = -1;
                }
            }
        }
        
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    for (int k = j + 1; k < m; k++) {
                        if (grid[i][k] == -1) {
                            count++;
                            break;
                        }
                    }
                }
            }
        }
        
        System.out.println(count);
    }
}