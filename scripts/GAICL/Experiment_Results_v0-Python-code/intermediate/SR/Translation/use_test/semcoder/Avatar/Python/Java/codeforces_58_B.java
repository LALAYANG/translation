```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int input_number = input.nextInt();

        for (int outer_loop_counter = 0; outer_loop_counter < input_number / 159; outer_loop_counter++) {
            for (int inner_loop_counter = input_number; inner_loop_counter > 0; inner_loop_counter--) {
                if ((primary_condition_check & secondary_condition_check) != 0) {
                    if ((tertiary_condition_check & quaternary_condition_check) != 0) {
                        if ((initial_condition_check & quinary_condition_check) != 0) {
                            if (input_number % inner_loop_counter == 0) {
                                input_number = inner_loop_counter;
                                System.out.print(inner_loop_counter + " ");
                            }
                        }
                    }
                }
            }
        }
    }
}
```
