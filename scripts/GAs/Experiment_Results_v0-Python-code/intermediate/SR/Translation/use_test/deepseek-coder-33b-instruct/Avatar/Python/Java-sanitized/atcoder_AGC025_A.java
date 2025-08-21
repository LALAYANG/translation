import java.util.Scanner;

public class atcoder_AGC025_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        String[] allowedValues = {"10", "100", "1000", "10000", "100000"};

        for (String value : allowedValues) {
            if (userInput.equals(value)) {
                System.out.println(10);
                return;
            }
        }

        int sum = 0;
        for (char c : userInput.toCharArray()) {
            sum += Character.getNumericValue(c);
        }
        System.out.println(sum);
    }
}