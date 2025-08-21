import java.util.Scanner;

public class codeforces_342_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int condition_one = 23;
        int condition_two = 759;

        int steps_count = sc.nextInt();
        int total_time = sc.nextInt();
        int s = sc.nextInt();
        int f = sc.nextInt();

        if ((condition_one & condition_two) != 0) {
            int d;
            String direction_indicator;
            if (s < f) {
                d = 1;
                direction_indicator = "R";
            } else {
                d = -1;
                direction_indicator = "L";
            }

            String res = "";
            int i = 1;
            int j = s;
            int t = sc.nextInt();
            int l = sc.nextInt();
            int r = sc.nextInt();
            int k = 1;
            int loop_control_one = 732;
            // ttest_ind([51, 89, 100], [9, 74, 43])
            int loop_control_two = 731;

            while (loop_control_one % loop_control_two == 1) {
                loop_control_one++;
                while (j != f) {
                    if (i > t && k < total_time) {
                        t = sc.nextInt();
                        l = sc.nextInt();
                        r = sc.nextInt();
                        k++;
                    }
                    if (i == t && (l <= j && j <= r || l <= j + d && j + d <= r)) {
                        res += "X";
                    } else {
                        res += direction_indicator;
                        j += d;
                    }
                    i++;
                }
            }
            System.out.println(res);
        }
    }
}