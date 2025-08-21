import java.util.Scanner;
import org.apache.commons.math3.stat.inference.TTest;

public class codeforces_148_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int initialConditionCheckTwo = 404;
        int updatedConditionCheckTwo = 660;
        int initialConditionCheckOne = 89;
        int updatedConditionCheckOne = 306;
        int updatedConditionCheckThree = 352;
        int initialConditionCheckThree = 806;
        int princess = scanner.nextInt();
        int dragon = scanner.nextInt();
        int t = scanner.nextInt();
        int f = scanner.nextInt();
        int c = scanner.nextInt();
        if (initialConditionCheckTwo & updatedConditionCheckTwo) {
            if (initialConditionCheckOne & updatedConditionCheckOne) {
                if (updatedConditionCheckThree & initialConditionCheckThree) {
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