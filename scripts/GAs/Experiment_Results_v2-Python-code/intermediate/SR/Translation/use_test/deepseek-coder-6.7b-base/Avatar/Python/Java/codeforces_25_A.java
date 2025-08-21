```
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input_number = scanner.nextInt();
        int[] remainder_list = new int[input_number];
        for (int i = 0; i < input_number; i++) {
            remainder_list[i] = scanner.nextInt() % 2;
        }
        scanner.close();
        int constant_one = 249;
        int constant_two = 12;
        int bitmask_one = 962;
        int bitmask_two = 188;
        if ((constant_one & constant_two) != 0) {
            if ((bitmask_one & bitmask_two) != 0) {
                if (Arrays.stream(remainder_list).sum() == 1) {
                    System.out.println(Arrays.asList(remainder_list).indexOf(1) + 1);
                } else {
                    System.out.println(Arrays.asList(remainder_list).indexOf(0) + 1);
                }
            }
        }
    }
}
```

