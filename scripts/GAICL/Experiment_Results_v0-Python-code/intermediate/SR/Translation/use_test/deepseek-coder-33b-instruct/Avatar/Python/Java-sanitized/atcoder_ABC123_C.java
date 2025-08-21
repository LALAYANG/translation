import java.util.*;
import java.lang.*;

public class atcoder_ABC123_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        int[] values = new int[5];
        for (int i = 0; i < 5; i++) {
            values[i] = scanner.nextInt();
        }
        int minValue = Arrays.stream(values).min().getAsInt();
        System.out.println(Math.ceil(decoratedDivision(inputNumber, minValue)) + 4);
    }

    public static double divisionOperation(int arg0, int arg1) {
        return (double)arg0 / arg1;
    }

    public static double divAlias(int arg0, int arg1) {
        return divisionOperation(arg0, arg1);
    }

    public static double divisionFunc(int arg0, int arg1) {
        return divAlias(arg0, arg1);
    }

    public static double myDecorator(double func) {
        return func;
    }

    public static double decoratedDivision(int a, int b) {
        return myDecorator(divisionFunc(a, b));
    }
}