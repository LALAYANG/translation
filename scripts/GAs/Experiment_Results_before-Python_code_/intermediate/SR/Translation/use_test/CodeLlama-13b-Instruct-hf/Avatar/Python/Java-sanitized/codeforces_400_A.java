import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class codeforces_400_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] input = new String[n];
        for (int i = 0; i < n; i++) {
            input[i] = scanner.nextLine();
        }
        List<Integer>[][] grid = new List[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = new ArrayList<>();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (input[i].charAt(j) == 'O') {
                    grid[i][j].add(0);
                } else {
                    grid[i][j].add(1);
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j].size() == 12) {
                    int count = 0;
                    for (int k = 0; k < 12; k++) {
                        if (grid[i][j].get(k) == 0) {
                            count++;
                        }
                    }
                    if (count == 12) {
                        System.out.println("12x1");
                    }
                }
            }
        }
    }
}