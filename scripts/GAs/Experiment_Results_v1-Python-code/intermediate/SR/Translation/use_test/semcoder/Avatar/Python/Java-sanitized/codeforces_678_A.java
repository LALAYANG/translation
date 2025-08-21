import java.util.Base64;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class codeforces_678_A {
    public static void main(String[] args) {
        int firstInput = 453145;
        int secondInput = 333625;

        int result = (integerDivision(firstInput, secondInput) + 1) * secondInput;
        System.out.println(result);
    }

    public static int integerDivision(int a, int b) {
        return a / b;
    }
}