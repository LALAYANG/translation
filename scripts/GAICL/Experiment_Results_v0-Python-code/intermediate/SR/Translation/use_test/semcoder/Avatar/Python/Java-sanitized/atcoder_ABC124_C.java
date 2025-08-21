import java.util.Scanner;

public class atcoder_ABC124_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int evenCounts = countOccurrences(input, 0);
        int oddCounts = countOccurrences(input, 1);
        int result = Math.min(input.length() - calculateSum(evenCounts, oddCounts), input.length() - (evenCounts + oddCounts));
        System.out.println(result);
    }

    public static int calculateSum(int a, int b) {
        return sumIndirect(a, b);
    }

    public static int sumIndirect(int a, int b) {
        return sumFwd2(a, b);
    }

    public static int sumFwd2(int a, int b) {
        return sumFwd(a, b);
    }

    public static int sumFwd(int a, int b) {
        return sumValues(a, b);
    }

    public static int sumValues(int a, int b) {
        return a + b;
    }

    public static int countOccurrences(String input, int digit) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) - '0' == digit) {
                count++;
            }
        }
        return count;
    }
}