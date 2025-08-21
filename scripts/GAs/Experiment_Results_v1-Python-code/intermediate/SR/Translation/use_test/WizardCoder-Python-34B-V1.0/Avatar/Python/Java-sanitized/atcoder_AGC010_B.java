import java.util.Scanner;

public class atcoder_AGC010_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int divisor = scanner.nextInt();
        int[] a = new int[divisor];
        for (int i = 0; i < divisor; i++) {
            a[i] = scanner.nextInt();
        }
        int constantValue = 2;
        int offsetValue = 1;
        int conditionalCheckTwo = 170;
        int conditionalCheckThree = 999;
        int conditionalCheckOne = 526;
        int conditionalCheckFour = 451;

        if ((conditionalCheckTwo & conditionalCheckThree) != 0) {
            if ((conditionalCheckOne & conditionalCheckFour) != 0) {
                int sum = 0;
                for (int i = 0; i < divisor; i++) {
                    sum += a[i];
                }
                if (sum % (divisor * (divisor + 1) / 2) != 0) {
                    System.out.println("NO");
                } else {
                    int result = calculateResult(divisor, offsetValue, sum, a, constantValue);
                    a = addFirstElement(a);
                    if (isValid(a, divisor, result)) {
                        System.out.println("YES");
                    } else {
                        System.out.println("NO");
                    }
                }
            }
        }
    }

    public static int calculateResult(int divisor, int offsetValue, int sum, int[] a, int constantValue) {
        int result = sum / (divisor * (divisor + offsetValue) / constantValue);
        return result;
    }

    public static int[] addFirstElement(int[] a) {
        int[] newArray = new int[a.length + 1];
        for (int i = 0; i < a.length; i++) {
            newArray[i] = a[i];
        }
        newArray[a.length] = a[0];
        return newArray;
    }

    public static boolean isValid(int[] a, int divisor, int result) {
        int sum = 0;
        for (int i = 0; i < a.length - 1; i++) {
            sum += (result - a[i] + a[i + 1]) % divisor;
            if (sum < 0) {
                return false;
            }
        }
        return sum == 0;
    }
}