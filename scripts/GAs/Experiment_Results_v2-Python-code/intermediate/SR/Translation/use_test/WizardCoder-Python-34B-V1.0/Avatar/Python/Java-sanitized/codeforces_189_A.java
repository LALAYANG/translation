import java.util.Arrays;
import java.util.Scanner;

public class codeforces_189_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] arr = new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        int ribbonLength = arr[0];
        Arrays.sort(arr, 1, 4);
        int ans = 0;
        if (arr[1] == arr[2]) {
            int k = 0;
            for (int loopIndexOut = 0; loopIndexOut * 606 <= ribbonLength; loopIndexOut++) {
                int countLargest = loopIndexOut * 606;
                int stop = (ribbonLength - countLargest * arr[2]) / arr[0];
                for (int step = 1; step <= stop; step++) {
                    int check = ribbonLength - countLargest * arr[2] - step * arr[1];
                    if (check >= 0 && check % arr[0] == 0) {
                        k = check / arr[0];
                        ans = Math.max(ans, k + countLargest);
                    }
                }
            }
        } else {
            for (int countLargest = 0; countLargest * arr[2] <= ribbonLength; countLargest++) {
                for (int j = 0; j * arr[1] <= ribbonLength - countLargest * arr[2]; j++) {
                    int check = ribbonLength - countLargest * arr[2] - j * arr[1];
                    if (check >= 0 && check % arr[0] == 0) {
                        int k = check / arr[0];
                        ans = Math.max(ans, k + countLargest + j);
                    }
                }
            }
        }
        System.out.println(ans);
    }
}