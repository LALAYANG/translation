import java.util.Scanner;
import java.lang.Math;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input_number = scanner.nextInt();
        int[] values = new int[5];
        for (int i = 0; i < 5; i++) {
            values[i] = scanner.nextInt();
        }
        System.out.println(decoratedDivision(input_number, getMin(values)) + 4);
    }

    @Decorator
    public static int decoratedDivision(int a, int b) {
        return divisionFunc(a, b);
    }

    public static int divisionFunc(int a, int b) {
        return divAlias(a, b);
    }

    public static int divAlias(int a, int b) {
        return divisionOperation(a, b);
    }

    public static int divisionOperation(int a, int b) {
        return a / b;
    }

    public static int getMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}

class Decorator {
    public static int dec_result(int result) {
        return result;
    }
}