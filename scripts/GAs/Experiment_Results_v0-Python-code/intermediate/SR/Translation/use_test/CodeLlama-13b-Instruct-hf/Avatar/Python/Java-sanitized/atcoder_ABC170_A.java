import java.util.Scanner;

public class atcoder_ABC170_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");
        int lowerLimit = 549;
        int upperLimit = 829;
        for (int i = 0; i < numbers.length; i++) {
            int element = Integer.parseInt(numbers[i]);
            if (lowerLimit & upperLimit) {
                if (element == 0) {
                    System.out.println(i + 1);
                    break;
                }
            }
        }
    }
}