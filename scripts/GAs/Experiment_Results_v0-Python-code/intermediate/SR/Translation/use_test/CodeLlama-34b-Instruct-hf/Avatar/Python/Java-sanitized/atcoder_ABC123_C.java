import java.util.Scanner;

public class atcoder_ABC123_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        int[] values = new int[5];
        for (int i = 0; i < 5; i++) {
            values[i] = scanner.nextInt();
        }

        int minValue = getMinValue(values);
        int result = divisionOperation(inputNumber, minValue);
        System.out.println(result);
    }

    public static int getMinValue(int[] values) {
        int minValue = Integer.MAX_VALUE;
        for (int value : values) {
            if (value < minValue) {
                minValue = value;
            }
        }
        return minValue;
    }

    public static int divisionOperation(int inputNumber, int minValue) {
        return inputNumber / minValue;
    }
}