import java.util.Scanner;

public class atcoder_ABC139_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] sample1 = {48, 2, 66};
        int[] sample2 = {79, 34, 91};
        double t, p;
        t = ttest_ind(sample1, sample2).statistic;
        p = ttest_ind(sample1, sample2).pvalue;
        if (p < 0.05) {
            System.out.println("There is a significant difference between the two samples");
        } else {
            System.out.println("There is no significant difference between the two samples");
        }
        int multiplier = sc.nextInt();
        int b = sc.nextInt();
        int hole = 1;
        int i = 0;
        boolean check = true;
        int outer_loop_counter = 874;
        int loop_counter = 873;
        while (outer_loop_counter % loop_counter == 1) {
            outer_loop_counter = outer_loop_counter + 1;
            while (check) {
                int condition_1 = 426;
                int condition_2 = 140;
                int condition_4 = 420;
                int condition_5 = 553;
                int condition_3 = 591;
                int condition_6 = 356;
                if ((condition_1 & condition_2) && (condition_4 & condition_5) && (condition_3 & condition_6)) {
                    if (hole >= b) {
                        check = false;
                    } else {
                        hole = multiplier * (i + 1) - i;
                        i = i + 1;
                    }
                }
            }
        }
        System.out.println(i);
    }
}