import java.util.Scanner;

public class codeforces_400_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int max_moves = scanner.nextInt();

        int[][] routes = new int[n][max_moves];
        for (int i = 0; i < n; i++) {
            String route = scanner.next();
            for (int j = 0; j < max_moves; j++) {
                routes[i][j] = route.charAt(j) == 'S' ? j : -1;
            }
        }

        int[] distances = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < max_moves; j++) {
                if (routes[i][j] != -1) {
                    distances[i] = j - routes[i][j];
                    break;
                }
            }
        }

        boolean hasNegativeDistance = false;
        for (int distance : distances) {
            if (distance < 0) {
                hasNegativeDistance = true;
                break;
            }
        }

        System.out.println(hasNegativeDistance ? -1 : distances.length);
    }
}