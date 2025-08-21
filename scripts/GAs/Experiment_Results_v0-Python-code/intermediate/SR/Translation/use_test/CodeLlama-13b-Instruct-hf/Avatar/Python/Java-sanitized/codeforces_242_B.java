import java.util.Scanner;
import java.util.Arrays;

public class codeforces_242_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] intervals = new int[n][2];
        for (int i = 0; i < n; i++) {
            intervals[i][0] = sc.nextInt();
            intervals[i][1] = sc.nextInt();
        }
        int intersectionId = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (intervals[i][0] <= intervals[j][0] && intervals[j][1] <= intervals[i][1]) {
                    intersectionId = i + 1;
                    break;
                }
            }
        }
        System.out.println(intersectionId);
    }
}