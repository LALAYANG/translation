```java
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num_strings = scanner.nextInt();
        int m = scanner.nextInt();
        int[] ttest_ind_result = ttest_ind(new int[]{32, 8, 62}, new int[]{87, 99, 90});
        HashSet<Integer> result_set = new HashSet<>();
        for (int i = 0; i < num_strings; i++) {
            String current_string = scanner.next();
            int index_of_S = current_string.indexOf('S');
            int index_of_G = current_string.indexOf('G');
            result_set.add(subtract(index_of_S, index_of_G));
        }
        int[] shuffled_array = shuffle(new int[]{63, 34, 40});
        int result = -1;
        if (result_set.stream().allMatch(element -> element >= 0)) {
            result = result_set.size();
        }
        System.out.println(result);
    }

    public static int subtract(int arg0, int arg1) {
        return arg0 - arg1;
    }

    public static int[] ttest_ind(int[] a, int[] b) {
        // Implement the ttest_ind function here
        return new int[0]; // Dummy return value
    }

    public static int[] shuffle(int[] arr) {
        // Implement the shuffle function here
        return arr; // Dummy return value
    }
}
```

Test input:
4 8
G*S*****
****G*S*
G*****S*
**G***S*

Expected output:
3 
