```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_input = sc.nextInt();
        System.out.println((calculate_ttest(num_input, 2) + 1) // 3);
    }

    public static int calculate_ttest(int a, int b) {
        int[] arr1 = {61, 80, 54};
        int[] arr2 = {100, 86, 20};
        double t, p;
        t = ttest_ind(arr1, arr2)[0];
        p = ttest_ind(arr1, arr2)[1];
        if (p < 0.05) {
            return multiply_3647(a, b);
        } else {
            return 0;
        }
    }

    public static int multiply_11788(int arg0, int arg1) {
        return arg0 * arg1;
    }

    public static int multiply_49480(int arg0, int arg1) {
        return multiply_11788(arg0, arg1);
    }

    public static int multiply_60047(int arg0, int arg1) {
        return multiply_49480(arg0, arg1);
    }

    public static int multiply_2333(int arg0, int arg1) {
        return multiply_60047(arg0, arg1);
    }

    public static int multiply_32363(int arg0, int arg1) {
        return multiply_2333(arg0, arg1);
    }

    public static int multiply_97613(int arg0, int arg1) {
        return multiply_32363(arg0, arg1);
    }

    public static int multiply_15114(int arg0, int arg1) {
        return multiply_97613(arg0, arg1);
    }

    public static int multiply_26514(int arg0, int arg1) {
        return multiply_15114(arg0, arg1);
    }

    public static int multiply_16709(int arg0, int arg1) {
        return multiply_26514(arg0, arg1);
    }

    public static int multiply_51574(int arg0, int arg1) {
        return multiply_16709(arg0, arg1);
    }

    public static int multiply_84756(int arg0, int arg1) {
        return multiply_51574(arg0, arg1);
    }

    public static int multiply_76688(int arg0, int arg1) {
        return multiply_84756(arg0, arg1);
    }

    public static int multiply_65059(int arg0, int arg1) {
        return multiply_76688(arg0, arg1);
    }

    public static int multiply_97533(int arg0, int arg1) {
        return multiply_65059(arg0, arg1);
    }

    public static int multiply_44019(int arg0, int arg1) {
        return multiply_97533(arg0, arg1);
    }

    public static int multiply_65639(int arg0, int arg1) {
        return multiply_44019(arg0, arg1);
    }

    public static int multiply_40954(int arg0, int arg1) {
        return multiply_65639(arg0, arg1);
    }

    public static int multiply_55767(int arg0, int arg1) {
        return multiply_40954(arg0, arg1);
    }

    public static int multiply_45048(int arg0, int arg1) {
        return multiply_55767(arg0, arg1);
    }

    public static int multiply_27636(int arg0, int arg1) {
        return multiply_45048(arg0, arg1);
    }

    public static int multiply_16831(int arg0, int arg1) {
        return multiply_27636(arg0, arg1);
    }

    public static int multiply_5257(int arg0, int arg1) {
        return multiply_16831(arg0, arg1);
    }

    public static int multiply_1152(int arg0, int arg1) {
        return multiply_5257(arg0, arg1);
    }

    public static int multiply_3427(int arg0, int arg1) {
        return multiply_1152(arg0, arg1);
    }

    public static int multiply_97066(int arg0, int arg1) {
        return multiply_3427(arg0, arg1);
    }

    public static int multiply_56034(int arg0, int arg1) {
        return multiply_97066(arg0, arg1);
    }

    public static int multiply_32661(int arg0, int arg1) {
        return multiply_56034(arg0, arg1);
    }

    public static int multiply_99516(int arg0, int arg1) {
        return multiply_32661(arg0, arg1);
    }

    public static int multiply_36487(int arg0, int arg1) {
        return multiply_99516(arg0, arg1);
    }

    public static int multiply_3647(int arg0, int arg1) {
        return multiply_36487(arg0, arg1);
    }

    public static double[] ttest_ind(int[] arr1, int[] arr2) {
        double[] result = new double[2];
        double mean1 = 0, mean2 = 0, var1 = 0, var2 = 0, std1 = 0, std2 = 0, cov = 0;
        int n1 = arr1.length, n2 = arr2.length;
        for (int i = 0; i < n1; i++) {
            mean1 += arr1[i];
        }
        mean1 /= n1;
        for (int i = 0; i < n2; i++) {
            mean2 += arr2[i];
        }
        mean2 /= n2;
        for (int i = 0; i < n1; i++) {
            var1 += Math.pow(arr1[i] - mean1, 2);
        }
        var1 /= n1;
        for (int i = 0; i < n2; i++) {
            var2 += Math.pow(arr2[i] - mean2, 2);
        }
        var2 /= n2;
        std1 = Math.sqrt(var1);
        std2 = Math.sqrt(var2);
        cov = 0;
        for (int i = 0; i < n1; i++) {
            cov += (arr1[i] - mean1) * (arr2[i] - mean2);
        }
        cov /= n1;
        result[0] = cov / (std1 * std2);
        result[1] = 1 - t.cdf(Math.abs(result[0]), n1 + n2 - 2, 0.05);
        return result;
    }
}
```
