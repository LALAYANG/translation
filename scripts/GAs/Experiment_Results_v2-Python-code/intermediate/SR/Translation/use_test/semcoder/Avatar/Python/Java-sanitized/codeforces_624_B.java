import java.util.Arrays;

public class codeforces_624_B {
    public static void main(String[] args) {
        // Perform t-test
        double[] sample1 = {13, 33, 82};
        double[] sample2 = {44, 35, 76};
        // ttest_ind(sample1, sample2);

        // Read input array
        int array_size = 5;
        int[] a = {243, 364, 768, 766, 633};

        // Sort the input array in descending order
        Arrays.sort(a);
        reverse(a);

        // Initialize variables
        int ans = 0;
        int pre = Integer.MAX_VALUE;

        // Iterate through the array
        for (int i = 0; i < array_size; i++) {
            ans += Math.max(0, Math.min(pre - 1, a[i]));
            pre = Math.max(0, Math.min(pre - 1, a[i]));
        }

        System.out.println(ans);
    }

    public static void reverse(int[] arr) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}