import java.util.*;

public class atcoder_ABC123_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        int[] values = new int[5];
        for (int i = 0; i < 5; i++) {
            values[i] = scanner.nextInt();
        }
        int minValue = Arrays.stream(values).min().getAsInt();
        System.out.println((int)Math.ceil(decoratedDivision(inputNumber, minValue)) + 4);
    }

    public static double divisionOperation(double arg0, double arg1) {
        return arg0 / arg1;
    }

    public static double divAlias(double arg0, double arg1) {
        return divisionOperation(arg0, arg1);
    }

    public static double divisionFunc(double arg0, double arg1) {
        return divAlias(arg0, arg1);
    }

    public static double myDecorator(double a, double b) {
        return divisionFunc(a, b);
    }

    public static double decoratedDivision(double a, double b) {
        return myDecorator(a, b);
    }
}