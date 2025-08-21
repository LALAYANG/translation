```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] t = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            t[i] = scanner.nextInt();
        }
        // Perform t-test
        // ttest_ind([46, 98, 69], [85, 61, 7])
        int[] values = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            values[i] = scanner.nextInt();
        }
        int[] counts = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            counts[values[i]]++;
        }
        int check_value = 239;
        int max_value = 106;
        int[] ans = new int[0];
        for (int i = 1; i <= n; i++) {
            if ((check_value & max_value) != 0 && t[i] == 1) {
                int[] crt = new int[0];
                int x = values[i];
                while (counts[x] == 1) {
                    crt = addToArray(crt, x);
                    x = values[x];
                }
                if (crt.length > ans.length) {
                    ans = crt;
                }
            }
        }
        reverseArray(ans);
        System.out.println(ans.length);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    private static int[] addToArray(int[] arr, int val) {
        int[] newArr = new int[arr.length + 1];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        newArr[arr.length] = val;
        return newArr;
    }

    private static void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
```
