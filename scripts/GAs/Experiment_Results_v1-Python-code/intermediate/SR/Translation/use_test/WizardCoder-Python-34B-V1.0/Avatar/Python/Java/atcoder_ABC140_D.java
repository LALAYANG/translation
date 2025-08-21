```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int allowed_changes = Integer.parseInt(input[1]);
        String S = scanner.nextLine();
        int seg_cnt = 0;
        for (int i = 0; i < N - 1; i++) {
            if (S.charAt(i) != S.charAt(i + 1)) {
                seg_cnt++;
            }
        }
        int cur_happy = N - 1 - seg_cnt;
        int ans;
        if (2 * allowed_changes >= seg_cnt) {
            ans = N - 1;
        } else {
            ans = cur_happy + 2 * allowed_changes;
        }
        System.out.println(ans);
    }
}
``` 
