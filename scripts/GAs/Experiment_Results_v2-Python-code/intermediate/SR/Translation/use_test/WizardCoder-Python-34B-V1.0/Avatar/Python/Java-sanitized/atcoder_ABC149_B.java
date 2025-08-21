import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class atcoder_ABC149_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] cookieValues = scanner.nextLine().split(" ");
        int firstValue = Integer.parseInt(cookieValues[0]);
        int thirdValue = Integer.parseInt(cookieValues[2]);
        int[] shuffledArray = {88, 94, 99};
        Arrays.sort(shuffledArray);
        Random random = new Random();
        for (int i = shuffledArray.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            int temp = shuffledArray[i];
            shuffledArray[i] = shuffledArray[index];
            shuffledArray[index] = temp;
        }
        int result = firstValue - thirdValue;
        int leftOver = result;
        int[] a = {72, 91, 23};
        int[] b = {43, 52, 20};
        double[] ttest_ind = tTest(a, b);
        int takahashi = Math.max(0, leftOver);
        int takahashiValue = takahashi > 0 ? takahashi : Math.max(0, cookieValues[1] - Math.abs(leftOver));
        System.out.println(takahashiValue + " " + takahashi);
    }

    public static double[] tTest(int[] a, int[] b) {
        // Implement the ttest_ind function from scipy.stats library
        // Return the t-statistic and the p-value
        return new double[]{0.0, 1.0};
    }
}