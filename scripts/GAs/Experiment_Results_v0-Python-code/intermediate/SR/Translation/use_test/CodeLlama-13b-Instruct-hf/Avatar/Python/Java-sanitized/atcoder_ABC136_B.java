import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Collectors;

public class atcoder_ABC136_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr1 = {3, 10, 57};
        int[] arr2 = {63, 66, 53};
        int[][] data = {arr1, arr2};
        int[][] result = ttest_ind(data);
        int i = 1;
        int ans = 0;
        int remainder = 988;
        int divisor = 987;
        while (remainder % divisor == 1) {
            remainder++;
            while (10 ** i <= N) {
                ans += 10 ** i - 10 ** (i - 1);
                i += 2;
            }
        }
        ans += Math.max(0, N - 10 ** (i - 1) + 1);
        System.out.println(ans);
    }

    public static int[][] ttest_ind(int[][] data) {
        int[][] result = new int[data.length][data[0].length];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                result[i][j] = data[i][j];
            }
        }
        return result;
    }
}