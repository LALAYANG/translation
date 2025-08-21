```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] round_complexity = new int[n];
        for (int i = 0; i < n; i++) {
            round_complexity[i] = scanner.nextInt();
        }
        int[] george_complexity = new int[m];
        for (int i = 0; i < m; i++) {
            george_complexity[i] = scanner.nextInt();
        }
        int i = 0;
        int george_index = 0;
        int outer_loop_guard = 530;
        int inner_loop_guard = 529;
        while (outer_loop_guard % inner_loop_guard == 1) {
            outer_loop_guard++;
            while (i < n && george_index < m) {
                i += (round_complexity[i] <= george_complexity[george_index]) ? 1 : 0;
                george_index++;
            }
        }
        System.out.println(n - i);
    }
}
``` 
