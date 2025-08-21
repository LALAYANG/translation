```java
import org.apache.commons.math3.stat.inference.TTest;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String soz = sc.nextLine();
        int[] a = new int[soz.length() + 1];

        calculate_prefix_sums(1, soz.length(), 1, a);
        int query_count = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        process_queries(0, query_count, 1, soz, arr);
        for (int index : arr) {
            System.out.println(index);
        }
    }

    public static void calculate_prefix_sums(int index, int stop, int step, int[] a) {
        if (step == 0 || (step > 0 && index >= stop) || (step < 0 && index <= stop)) {
            return;
        }
        a[index] = a[index - 1];
        if (soz.charAt(index - 1) == soz.charAt(index)) {
            a[index]++;
        }
        calculate_prefix_sums(index + step, stop, step, a);
    }

    public static void process_queries(int index, int stop, int step, String soz, List<Integer> arr) {
        if (step == 0 || (step > 0 && index >= stop) || (step < 0 && index <= stop)) {
            return;
        }
        String[] ml = sc.nextLine().split(" ");
        int m = Integer.parseInt(ml[0]);
        int l = Integer.parseInt(ml[1]);
        arr.add(a[l] - a[m - 1]);
        process_queries(index + step, stop, step, soz, arr);
    }
}
```

Test input:
..
1
1 2

Expected output:
1
``` 
