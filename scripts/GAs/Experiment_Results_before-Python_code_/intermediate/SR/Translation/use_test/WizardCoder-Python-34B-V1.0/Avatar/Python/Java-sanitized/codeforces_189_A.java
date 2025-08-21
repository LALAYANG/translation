import java.util.Arrays;
import java.util.Scanner;

public class codeforces_189_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int length = arr[0];
        int[] arr1 = Arrays.copyOfRange(arr, 1, 4);
        int ans = 0;
        if (length % arr1[0] == 0) {
            System.out.println(length / arr1[0]);
            return;
        }
        if (arr1[0] == arr1[1]) {
            int k = 0;
            for (int i = 0; i <= length / arr1[2]; i++) {
                int check = length - i * arr1[2];
                if (check >= 0 && check % arr1[0] == 0) {
                    k = check / arr1[0];
                    ans = Math.max(ans, k + i);
                }
            }
        } else {
            for (int i = 0; i <= length / arr1[2]; i++) {
                for (int j = 0; j <= length / arr1[1]; j++) {
                    int check = length - i * arr1[2] - j * arr1[1];
                    if (check >= 0 && check % arr1[0] == 0) {
                        int k = check / arr1[0];
                        ans = Math.max(ans, k + i + j);
                    }
                }
            }
        }
        System.out.println(ans);
    }
}