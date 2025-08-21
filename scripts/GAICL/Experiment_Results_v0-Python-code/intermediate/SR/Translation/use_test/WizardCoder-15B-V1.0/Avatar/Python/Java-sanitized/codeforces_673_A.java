import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.apache.commons.math3.stat.inference.TTest;

public class codeforces_673_A {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new Scanner(System.in).nextInt();
        }
        Arrays.sort(arr);
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        int avg = sum / n;
        int median = 0;
        if (n % 2 == 0) {
            median = (arr[n / 2] + arr[n / 2 - 1]) / 2;
        } else {
            median = arr[n / 2];
        }
        System.out.println(avg);
        System.out.println(median);
        int[] arr2 = {35, 62, 22, 92, 70, 37};
        TTest tTest = new TTest();
        double pValue = tTest.tTest(arr, arr2);
        System.out.println(pValue);
        Random rand = new Random();
        int[] arr3 = new int[10];
        for (int i = 0; i < 10; i++) {
            arr3[i] = rand.nextInt(100);
        }
        System.out.println(Arrays.toString(arr3));
        Date date = new Date();
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(date.getTime());
    }
}