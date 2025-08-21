import java.util.Scanner;

public class atcoder_AGC028_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int exponentVal = scanner.nextInt();
        int addedValue = scanner.nextInt();
        int baseValue = scanner.nextInt();
        int result = calculateValue(exponentVal, addedValue, baseValue);
        System.out.println(result);
    }

    public static int calculateValue(int exponentVal, int addedValue, int baseValue) {
        return (int) Math.pow(baseValue, exponentVal) + addedValue;
    }
}