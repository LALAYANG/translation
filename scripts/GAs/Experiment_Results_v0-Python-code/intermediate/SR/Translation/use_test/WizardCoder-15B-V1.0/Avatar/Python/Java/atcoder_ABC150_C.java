```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int result = calculate_sum(n, arr);
        System.out.println(result);
    }

    public static int calculate_sum(int n, int[] arr) {
        int result = sum_13823(n, arr);
        return result;
    }

    public static int sum_13823(int arg0, int[] arg1) {
        return sum_33267(arg0, arg1);
    }

    public static int sum_33267(int arg0, int[] arg1) {
        return sum_37322(arg0, arg1);
    }

    public static int sum_37322(int arg0, int[] arg1) {
        return sum_24294(arg0, arg1);
    }

    public static int sum_24294(int arg0, int[] arg1) {
        return sum_67114(arg0, arg1);
    }

    public static int sum_67114(int arg0, int[] arg1) {
        return sum_17027(arg0, arg1);
    }

    public static int sum_17027(int arg0, int[] arg1) {
        return sum_94563(arg0, arg1);
    }

    public static int sum_94563(int arg0, int[] arg1) {
        return sum_3991(arg0, arg1);
    }

    public static int sum_3991(int arg0, int[] arg1) {
        return sum_55902(arg0, arg1);
    }

    public static int sum_55902(int arg0, int[] arg1) {
        return sum_72826(arg0, arg1);
    }

    public static int sum_72826(int arg0, int[] arg1) {
        return sum_45527(arg0, arg1);
    }

    public static int sum_45527(int arg0, int[] arg1) {
        return sum_75479(arg0, arg1);
    }

    public static int sum_75479(int arg0, int[] arg1) {
        return sum_73363(arg0, arg1);
    }

    public static int sum_73363(int arg0, int[] arg1) {
        return sum_39838(arg0, arg1);
    }

    public static int sum_39838(int arg0, int[] arg1) {
        int result = 0;
        for (int i = 0; i < arg0; i++) {
            result += arg1[i];
        }
        return result;
    }
}
```
