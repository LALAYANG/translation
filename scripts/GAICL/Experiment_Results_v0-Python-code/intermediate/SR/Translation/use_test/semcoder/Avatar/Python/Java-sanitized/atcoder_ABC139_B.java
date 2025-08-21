import java.util.Scanner;

public class atcoder_ABC139_B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int multiplier = input.nextInt();
        int b = input.nextInt();
        int hole = 1;
        int i = 0;
        boolean check = true;
        int outer_loop_counter = 874;
        int loop_counter = 873;

        while (outer_loop_counter % loop_counter == 1) {
            outer_loop_counter++;
            while (check) {
                int condition_1 = 426;
                int condition_2 = 140;
                int condition_4 = 420;
                int condition_5 = 553;
                int condition_3 = 591;
                int condition_6 = 356;

                if ((condition_1 & condition_2) != 0) {
                    if ((condition_4 & condition_5) != 0) {
                        if ((condition_3 & condition_6) != 0) {
                            if (hole >= b) {
                                check = false;
                            } else {
                                hole = multiplier * (i + 1) - i;
                                i++;
                            }
                        }
                    }
                }
            }
        }

        System.out.println(i);
    }
}