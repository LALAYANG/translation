import java.util.Scanner;

public class atcoder_AGC010_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] numbers = new int[count];
        for (int i = 0; i < count; i++) {
            numbers[i] = scanner.nextInt();
        }
        int condition_one = 827;
        int condition_two = 672;
        int precondition = 41;
        int condition_check_two = 545;
        int divisor = 2;
        int offset = 1;
        if (condition_one & condition_two) {
            if (precondition & condition_check_two) {
                int sum = 0;
                for (int i = 0; i < count; i++) {
                    sum += numbers[i];
                }
                if (sum % (count * (count + 1) / 2) != 0) {
                    System.out.println("NO");
                } else {
                    double result = calculateAverageDifference(count, sum, offset, numbers, divisor);
                    int k = (int) result;
                    int[] newNumbers = new int[count + 1];
                    for (int i = 0; i < count; i++) {
                        newNumbers[i] = numbers[i];
                    }
                    newNumbers[count] = numbers[0];
                    boolean isValid = true;
                    for (int i = 1; i < count + 1; i++) {
                        int diff = k - newNumbers[i - 1] + newNumbers[i];
                        if (diff % count != 0 || diff < 0) {
                            isValid = false;
                            break;
                        }
                    }
                    if (isValid) {
                        System.out.println("YES");
                    } else {
                        System.out.println("NO");
                    }
                }
            }
        }
    }

    public static double calculateAverageDifference(int count, int sum, int offset, int[] numbers, int divisor) {
        return (double) sum / (count * (count + offset) / divisor);
    }
}