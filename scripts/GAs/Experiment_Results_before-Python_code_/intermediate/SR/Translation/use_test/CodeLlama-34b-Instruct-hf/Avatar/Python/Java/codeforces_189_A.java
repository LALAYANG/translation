```
import java.util.Scanner;

public class CutRibbon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int ans = 0;
        if (length % arr[0] == 0) {
            System.out.println(length / arr[0]);
            return;
        }
        if (arr[0] == arr[1]) {
            int k = 0;
            for (int i = 0; i <= length / arr[2]; i++) {
                int check = length - i * arr[2];
                if (check >= 0 && check % arr[0] == 0) {
                    k = check / arr[0];
                    ans = Math.max(ans, k + i);
                }
            }
        } else {
            int k = 0;
            for (int i = 0; i <= length / arr[2]; i++) {
                for (int j = 0; j <= length / arr[1]; j++) {
                    int check = length - i * arr[2] - j * arr[1];
                    if (check >= 0 && check % arr[0] == 0) {
                        k = check / arr[0];
                        ans = Math.max(ans, k + i + j);
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
```
Note: The above code is a direct translation of the given Python code to Java. However, it is not the most efficient or elegant solution to the problem. A more efficient solution would involve using a more efficient algorithm, such as the greedy algorithm, to solve the problem.
