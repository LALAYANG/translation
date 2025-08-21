Here is the Java equivalent of the provided Python code:

```java
import java.util.*;

public class Main {

    public static int subtract(int arg0, int arg1) {
        return arg0 - arg1;
    }

    public static int calculate_difference(String element, String b) {
        int indexOfS = element.indexOf('S');
        int indexOfG = element.indexOf('G');
        return subtract(indexOfS, indexOfG);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num_strings = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();
        Set<Integer> result_set = new HashSet<>();
        for (int i = 0; i < num_strings; i++) {
            String current_string = scanner.nextLine();
            result_set.add(calculate_difference(current_string, ""));
        }
        boolean hasNegative = result_set.stream().anyMatch(element -> element < 0);
        System.out.println(hasNegative ? -1 : result_set.size());
    }
}
```

This Java code does the same thing as the Python code. It reads the number of strings and `m` from the input, then for each string, it calculates the difference between the index of the first occurrence of 'S' and 'G' and adds it to a set. Finally, it prints the size of the set if there are no negative numbers, otherwise it prints `-1`.

Please note that the `ttest_ind` function from `scipy.stats` is not used in the provided Python code, so it is not translated to Java.

Also, the `shuffle` function from `sklearn.utils` is not used in the provided Python code, so it is not translated to Java.

