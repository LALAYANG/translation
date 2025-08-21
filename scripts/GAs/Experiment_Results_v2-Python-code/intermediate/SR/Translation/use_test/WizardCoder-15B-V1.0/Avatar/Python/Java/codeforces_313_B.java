```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String soz = sc.nextLine();
        int[] a = new int[soz.length() + 1];

        calculatePrefixSums(soz, a, 1, soz.length(), 1);

        int queryCount = sc.nextInt();
        int[] arr = new int[queryCount];

        processQueries(soz, a, arr, queryCount);

        for (int i = 0; i < queryCount; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void calculatePrefixSums(String soz, int[] a, int index, int stop, int step) {
        if (step == 0 || (step > 0 && index >= stop) || (step < 0 && index <= stop)) {
            return;
        }
        a[index] = a[index - 1];
        if (soz.charAt(index - 1) == soz.charAt(index)) {
            a[index]++;
        }
        calculatePrefixSums(soz, a, index + step, stop, step);
    }

    public static void processQueries(String soz, int[] a, int[] arr, int queryCount) {
        for (int i = 0; i < queryCount; i++) {
            String[] query = sc.nextLine().split(" ");
            int m = Integer.parseInt(query[0]);
            int l = Integer.parseInt(query[1]);
            arr[i] = a[l - 1] - a[m - 1];
        }
    }
}
```
