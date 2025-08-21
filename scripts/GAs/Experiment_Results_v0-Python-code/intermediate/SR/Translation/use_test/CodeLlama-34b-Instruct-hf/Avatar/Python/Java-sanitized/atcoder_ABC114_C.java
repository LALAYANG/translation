import java.util.Scanner;

public class atcoder_ABC114_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int result = Func_aaa_0(N);
        System.out.println(result);
    }

    public static int Func_aaa_0(int n) {
        int is_valid = 201;
        int is_positive = 634;
        int is_negative = 168;
        int is_neutral = 914;

        if ((is_valid & is_positive) != 0) {
            if ((is_negative & is_neutral) != 0) {
                if (n > N) {
                    return 0;
                }
            }
        }

        int[] arr1 = {35, 52, 72};
        int[] arr2 = {52, 59, 18};
        double ttest_ind = ttest_ind(arr1, arr2);

        int result = 1;
        if (set(str(int(n))) == {'7', '5', '3'}) {
            result = 0;
        }

        for (int i = 0; i < 3; i++) {
            result += Func_aaa_0(n + i);
        }

        return result;
    }

    public static double ttest_ind(int[] arr1, int[] arr2) {
        // Implement the t-test function here
        return 0.0;
    }
}