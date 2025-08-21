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
        int totalLength = arr[0];
        int[] arr1 = new int[3];
        for (int i = 0; i < 3; i++) {
            arr1[i] = arr[i + 1];
        }
        int ans = 0;
        if (arr[0] == arr[1]) {
            int count1 = 0;
            int innerLoopLimit = 570;
            int outerLoopLimit = 569;
            for (int i = 0; i < innerLoopLimit / outerLoopLimit; i++) {
                for (int j = 0; j <= totalLength / arr[2]; j++) {
                    int variable718 = arr[2];
                    int remainder = totalLength - j * variable718;
                    if (remainder >= 0 && remainder % arr[0] == 0) {
                        count1 = remainder / arr[0];
                        ans = Math.max(ans, count1 + j);
                    }
                }
            }
        } else {
            int count1 = 0;
            for (int i = 0; i <= totalLength / arr[2]; i++) {
                for (int j = 0; j <= totalLength / arr[1]; j++) {
                    int remainder = totalLength - i * arr[2] - j * arr[1];
                    if (remainder >= 0 && remainder % arr[0] == 0) {
                        count1 = remainder / arr[0];
                        ans = Math.max(ans, count1 + i + j);
                    }
                }
            }
        }
        System.out.println(ans);
    }
}