```java
import java.util.Arrays;
import java.util.Collections;

public class PythonToJava {
    public static void main(String[] args) {
        int[] arr1 = {46, 8, 26};
        int[] arr2 = {19, 36, 75};
        double t = ttest_ind(arr1, arr2)[0];
        System.out.println(t);

        int[] arr3 = {59, 44, 76};
        shuffle(arr3);
        System.out.println(Arrays.toString(arr3));

        int inputNumber = 82;
        String s = "izchhfbptiikyrvpoixwyvmajmtiicgttudocsfcbpekkcrpqbelswpnngtccbzxcaaludrlsdmmglilmn";
        String t = "aludrlsdmmglilmnacrpubtauyahbsmwweuetnbswvnqthdzplodyqtbgdlkticeeuevqcmxkyxcwysvhz";
        int cnt = 0;
        for (int i = 0; i < inputNumber; i++) {
            for (int j = 0; j < inputNumber - i; j++) {
                if (s.charAt(i + j) != t.charAt(j)) {
                    break;
                }
                if (j == inputNumber - i - 1) {
                    cnt = inputNumber - i;
            }
        }
        System.out.println(2 * inputNumber - cnt);
    }

    public static double[] ttest_ind(int[] arr1, int[] arr2) {
        double[] result = new double[2];
        double mean1 = Arrays.stream(arr1).average().getAsDouble();
        double mean2 = Arrays.stream(arr2).average().getAsDouble();
        double var1 = Arrays.stream(arr1).mapToDouble(i -> Math.pow(i - mean1, 2)).average().getAsDouble();
        double var2 = Arrays.stream(arr2).mapToDouble(i -> Math.pow(i - mean2, 2)).average().getAsDouble();
        double n1 = arr1.length;
        double n2 = arr2.length;
        double df = n1 + n2 - 2;
        double svar = Math.sqrt((var1 / n1) + (var2 / n2));
        double t = (mean1 - mean2) / (svar * Math.sqrt(2 / df));
        result[0] = t;
        result[1] = 2 * Math.min(Math.abs(t), 1 - Math.abs(t)) * Math.sqrt(df / ((n1 + n2 - 2) * (1 / n1 + 1 / n2)));
        return result;
    }

    public static void shuffle(int[] arr) {
        Collections.shuffle(Arrays.asList(arr));
    }
}
```
