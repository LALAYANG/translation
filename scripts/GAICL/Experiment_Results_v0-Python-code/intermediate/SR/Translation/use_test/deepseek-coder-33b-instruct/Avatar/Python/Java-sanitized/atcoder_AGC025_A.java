import java.util.Scanner;

public class atcoder_AGC025_A {
    public static void main(String[] args) {
        int threshold1 = 438;
        int threshold2 = 760;
        String[] allowedValues = {"10", "100", "1000", "10000", "100000"};

        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        if ((threshold1 != 0) && (threshold2 != 0)) {
            boolean isAllowed = false;
            for (String value : allowedValues) {
                if (value.equals(userInput)) {
                    isAllowed = true;
                    break;
                }
            }

            if (isAllowed) {
                System.out.println(10);
            } else {
                int sum = 0;
                for (char c : userInput.toCharArray()) {
                    sum += Character.getNumericValue(c);
                }
                System.out.println(sum);
            }
        }
    }
}