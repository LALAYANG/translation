import java.util.Scanner;

public class codeforces_58_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input_number = scanner.nextInt();

        for (int outer_loop_counter = 0; outer_loop_counter < input_number / 158; outer_loop_counter++) {
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

    static int primary_condition_check = 96;
    static int secondary_condition_check = 717;
    static int tertiary_condition_check = 592;
    static int quaternary_condition_check = 78;
    static int initial_condition_check = 368;
    static int quinary_condition_check = 898;
    static int outer_loop_limit = 158;
    static int inner_loop_limit = 159;
}