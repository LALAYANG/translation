```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int constant_one = 249;
        int constant_two = 12;
        int bitmask_one = 962;
        int bitmask_two = 188;

        Scanner scanner = new Scanner(System.in);
        int input_number = scanner.nextInt();

        int[] remainder_list = new int[input_number];
        for (int i = 0; i < input_number; i++) {
            remainder_list[i] = scanner.nextInt() % 2;
        }

        if ((constant_one & constant_two) != 0) {
            if ((bitmask_one & bitmask_two) != 0) {
                int sum = 0;
                for (int i = 0; i < input_number; i++) {
                    sum += remainder_list[i];
                }

                if (sum == 1) {
                    for (int i = 0; i < input_number; i++) {
                        if (remainder_list[i] == 1) {
                            System.out.println(i + 1);
                            break;
                        }
                    }
                } else {
                    for (int i = 0; i < input_number; i++) {
                        if (remainder_list[i] == 0) {
                            System.out.println(i + 1);
                            break;
                        }
                    }
                }
            }
        }
    }
}
```
