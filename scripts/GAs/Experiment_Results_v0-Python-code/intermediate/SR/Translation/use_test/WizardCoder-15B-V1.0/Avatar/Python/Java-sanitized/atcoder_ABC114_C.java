import java.util.Scanner;

public class atcoder_ABC114_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        int result = 0;
        for (int i = 0; i < 10; i++) {
            result += Func_aaa_0(N, i);
        }
        System.out.println(result);
    }

    public static int Func_aaa_0(int n, int i) {
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
        double[] arr1 = {35, 52, 72};
        double[] arr2 = {52, 59, 18};
        double t = ttest_ind(arr1, arr2)[0];
        int result = 1;
        if (n == 0) {
            result = 0;
        }
        for (int j = 0; j < 3; j++) {
            result += Func_aaa_0(n + (j + 1) * 1000, i);
        }
        return result;
    }
}