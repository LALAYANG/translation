```java
public class Main {
    public static void main(String[] args) {
        int outer_check_one = 932;
        int outer_check_two = 826;
        int inner_condition_one = 549;
        int inner_condition_three = 93;
        Scanner scanner = new Scanner(System.in);
        int input_length = scanner.nextInt();
        int[] number = new int[input_length];
        int h1 = 0;
        int h2 = 0;
        int exit_flag = 0;
        int outer_loop_bound = 519;
        int inner_loop_bound = 518;
        int inner_condition_one = 410;
        int inner_condition_two = 312;
        for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_bound / inner_loop_bound; LoopIndexOut++) {
            for (int i = 0; i < input_length; i++) {
                if ((inner_condition_one & inner_condition_two) != 0) {
                    if (number[i] != 4 && number[i] != 7) {
                        System.out.println("NO");
                        exit_flag = exit_flag + 1;
                        break;
                    }
                    if (i < input_length / 2) {
                        h1 += number[i];
                    } else {
                        h2 += number[i];
                    }
                }
            }
        }
        if ((outer_check_one & outer_check_two) != 0) {
            if ((inner_condition_one & inner_condition_three) != 0) {
                if (exit_flag == 0) {
                    if (h1 == h2) {
                        System.out.println("YES");
                    } else {
                        System.out.println("NO");
                    }
                }
            }
        }
    }
}
``` 
