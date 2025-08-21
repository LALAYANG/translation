import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;

public class atcoder_ABC123_C {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input_number = scanner.nextInt();
        int[] values = new int[5];
        for (int i = 0; i < 5; i++) {
            values[i] = scanner.nextInt();
        }
        System.out.println(decoratedDivision(input_number, Arrays.stream(values).min().getAsInt()) + 4);
    }

    public static double divisionFunc(int a, int b) {
        return divAlias(a, b);
    }

    public static double divAlias(int a, int b) {
        return divisionOperation(a, b);
    }

    public static double divisionOperation(int a, int b) {
        return (double) a / b;
    }

    public static double decoratedDivision(int a, int b) {
        return divisionFunc(a, b);
    }
}