```java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {19, 40, 72};
        int[] arr2 = {77, 17, 98};
        int[] shuffledArr1 = shuffle(arr1);
        int[] shuffledArr2 = shuffle(arr2);
        double[][] result = ttest_ind(shuffledArr1, shuffledArr2);
        System.out.println(Arrays.toString(result));
    }

    public static int[] shuffle(int[] arr) {
        int n = arr.length;
        for (int i = n - 1; i > 0; i--) {
            int index = (int) (Math.random() * (i + 1));
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        return arr;
    }

    public static double[][] ttest_ind(int[] arr1, int[] arr2) {
        double[][] result = new double[2][2];
        double mean1 = 0;
        double mean2 = 0;
        double var1 = 0;
        double var2 = 0;
        double n1 = arr1.length;
        double n2 = arr2.length;

        for (int i = 0; i < arr1.length; i++) {
            mean1 += arr1[i];
        }
        mean1 /= n1;

        for (int i = 0; i < arr2.length; i++) {
            mean2 += arr2[i];
        }
        mean2 /= n2;

        for (int i = 0; i < arr1.length; i++) {
            var1 += Math.pow(arr1[i] - mean1, 2);
        }
        var1 /= (n1 - 1);

        for (int i = 0; i < arr2.length; i++) {
            var2 += Math.pow(arr2[i] - mean2, 2);
        }
        var2 /= (n2 - 1);

        double t = (mean1 - mean2) / Math.sqrt(var1 / n1 + var2 / n2);
        double df = (var1 / n1 + var2 / n2) * (var1 / n1 + var2 / n2);
        double p = 2 * (1 - tdist(Math.abs(t), df);

        result[0][0] = t;
        result[0][1] = df;
        result[1][0] = p;
        result[1][1] = t;
        return result;
    }

    public static double tdist(double t, double df) {
        if (t == 0) {
            return 0.5;
        }
        double x = Math.abs(t);
        double a = df / (df + x * x);
        double term = a;
        double s = term;
        for (int i = 1; i < 100; i++) {
            term *= (i * a) / (i + i);
            s += term;
        }
        return 1 - s * Math.exp(-Math.pow(x, 2) / df);
    }
}
```

Test input:
07:12
05:55

Expected output:
01:17

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] h1 = scanner.nextLine().split(":");
        int hours1 = Integer.parseInt(h1[0]);
        int minutes1 = Integer.parseInt(h1[1]);
        int minutesPerHour = 60;
        int totalMinutes1 = hours1 * minutesPerHour + minutes1;
        String[] h2 = scanner.nextLine().split(":");
        int hours2 = Integer.parseInt(h2[0]);
        int minutes2 = Integer.parseInt(h2[1]);
        int totalMinutes2 = hours2 * minutesPerHour + minutes2;
        int minutesDiff = totalMinutes1 - totalMinutes2;
        minutesDiff %= 1440;
        int hours = minutesDiff / 60;
        int minutes = minutesDiff % 60;
        System.out.printf("%02d:%02d\n", hours, minutes);
    }
}
``` 
