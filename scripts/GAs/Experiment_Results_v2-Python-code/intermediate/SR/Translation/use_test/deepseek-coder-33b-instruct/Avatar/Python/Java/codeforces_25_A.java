```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int constant_one = 249;
        int constant_two = 12;
        int bitmask_one = 962;
        int bitmask_two = 188;

        Scanner scanner = new Scanner(System.in);
        int input_number = scanner.nextInt();
        scanner.nextLine();
        String[] input_array = scanner.nextLine().split(" ");

        List<Integer> remainder_list = new ArrayList<>();
        for (String s : input_array) {
            remainder_list.add(Integer.parseInt(s) % 2);
        }

        if ((constant_one & constant_two) != 0) {
            if ((bitmask_one & bitmask_two) != 0) {
                int sum = 0;
                for (int i : remainder_list) {
                    sum += i;
                }
                if (sum == 1) {
                    System.out.println(remainder_list.indexOf(1) + 1);
                } else {
                    System.out.println(remainder_list.indexOf(0) + 1);
                }
            }
        }
    }
}
```

Please note that the Java code does not include the functionality of the Python code that uses the `ttest_ind` function from the `scipy.stats` module or the `shuffle` function from the `sklearn.utils` module. These functions are not available in Java and would need to be replaced with equivalent functionality if needed.

