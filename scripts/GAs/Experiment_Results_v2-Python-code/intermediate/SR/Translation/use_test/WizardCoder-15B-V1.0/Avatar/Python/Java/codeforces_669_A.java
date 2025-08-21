```java
import java.util.Arrays;
import java.util.Random;

public class PythonToJava {

    public static void main(String[] args) {
        int user_input = Integer.parseInt(args[0]);
        int[] arr1 = {61, 12, 41};
        int[] arr2 = {2, 99, 20};
        double[] arr3 = {44, 8, 53};
        Random rand = new Random();
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(shuffle(arr3)));
        System.out.println(ttest_ind(arr1, arr2));
        System.out.println((multiply_and_decorate(user_input, 2) + 1) / 3);
    }

    public static double[] shuffle(double[] arr) {
        Random rand = new Random();
        for (int i = arr.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            double temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }

    public static double ttest_ind(double[] arr1, double[] arr2) {
        double[] arr3 = new double[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, arr3, 0, arr1.length);
        System.arraycopy(arr2, 0, arr3, arr1.length, arr2.length);
        Arrays.sort(arr3);
        int n1 = arr1.length;
        int n2 = arr2.length;
        double[] mean = {0, 0};
        double[] var = {0, 0};
        double[] std = {0, 0};
        for (int i = 0; i < 2; i++) {
            mean[i] = Arrays.stream(i == 0 ? arr1 : arr2).average().getAsDouble();
            var[i] = Arrays.stream(i == 0 ? arr1 : arr2).map(x -> Math.pow(x - mean[i], 2)).average().getAsDouble();
            std[i] = Math.sqrt(var[i]);
        }
        double t = (mean[0] - mean[1]) / (Math.sqrt((var[0] / n1) + (var[1] / n2)));
        double df = n1 + n2 - 2;
        double p = 1 - new TDistribution(df).cumulativeProbability(Math.abs(t));
        return p;
    }

    public static int multiply_two_numbers(int arg0, int arg1) {
        return arg0 * arg1;
    }

    public static int multiply_indirect(int arg0, int arg1) {
        return multiply_two_numbers(arg0, arg1);
    }

    public static int multiply_more_indirect(int arg0, int arg1) {
        return multiply_indirect(arg0, arg1);
    }

    public static int my_decorator(int func) {

        int dec_result(int args, int kwargs) {
            int decorated_result = func(args, kwargs);
            return decorated_result;
        }
        return dec_result;
    }

    @my_decorator
    public static int multiply_and_decorate(int a, int b) {
        return multiply_more_indirect(a, b);
    }
}
```
