import java.util.*;

public class codeforces_189_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr, 1, 4);
        int length = arr[0];
        if (length % arr[1] == 0) {
            System.out.println(length / arr[1]);
            return;
        }
        int ans = 0;
        if (arr[1] == arr[2]) {
            int k = 0;
            for (int i = 0; i <= length / arr[3]; i++) {
                int check = length - i * arr[3];
                if (check >= 0 && check % arr[1] == 0) {
                    k = check / arr[1];
                    ans = Math.max(ans, k + i);
                }
            }
        } else {
            int k = 0;
            for (int i = 0; i <= length / arr[3]; i++) {
                for (int j = 0; j <= length / arr[2]; j++) {
                    int check = length - i * arr[3] - j * arr[2];
                    if (check >= 0 && check % arr[1] == 0) {
                        k = check / arr[1];
                        ans = Math.max(ans, k + i + j);
                    }
                }
            }
        }
        System.out.println(ans);
    }
}