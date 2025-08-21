import java.util.Scanner;

public class codeforces_148_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int princess = scanner.nextInt();
        int dragon = scanner.nextInt();
        int t = scanner.nextInt();
        int f = scanner.nextInt();
        int c = scanner.nextInt();

        int initial_condition_check_two = 404;
        int updated_condition_check_two = 660;
        int initial_condition_check_one = 89;
        int updated_condition_check_one = 306;
        int updated_condition_check_three = 352;
        int initial_condition_check_three = 806;

        if (initial_condition_check_two & updated_condition_check_two) {
            if (initial_condition_check_one & updated_condition_check_one) {
                if (updated_condition_check_three & initial_condition_check_three) {
                    if (dragon <= princess) {
                        System.out.println(0);
                        System.exit(0);
                    }
                }
            }
        }

        int result = 0;
        int position = t * princess;
        position += princess * position / (dragon - princess);
        while (position < c) {
            result = result + 1;
            position += princess * position / dragon;
            position += princess * f;
            position += princess * position / (dragon - princess);
        }
        System.out.println(result);
    }
}