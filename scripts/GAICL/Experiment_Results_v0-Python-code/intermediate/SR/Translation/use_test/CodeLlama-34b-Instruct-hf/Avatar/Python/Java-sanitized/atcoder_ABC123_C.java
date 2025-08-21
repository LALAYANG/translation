import java.util.Scanner;

public class atcoder_ABC123_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputNumber = scanner.nextInt();
        int[] values = new int[5];
        for (int i = 0; i < 5; i++) {
            values[i] = scanner.nextInt();
        }

        int result = divisionOperation(inputNumber, np.min(np.array(values)));
        System.out.println(result);
    }

    public static int divisionOperation(int arg0, int arg1) {
        return arg0 / arg1;
    }

    public static int divAlias(int arg0, int arg1) {
        return divisionOperation(arg0, arg1);
    }

    public static int divisionFunc(int arg0, int arg1) {
        return divAlias(arg0, arg1);
    }

    public static int myDecorator(int a, int b) {
        int result = divisionFunc(a, b);
        return result;
    }

    public static int decoratedDivision(int a, int b) {
        return myDecorator(a, b);
    }
}