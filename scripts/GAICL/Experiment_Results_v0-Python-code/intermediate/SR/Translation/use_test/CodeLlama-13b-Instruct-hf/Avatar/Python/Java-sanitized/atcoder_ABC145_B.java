import java.util.Scanner;

public class atcoder_ABC145_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        String inputString = scanner.nextLine();

        if (inputNumber % 2 != 0) {
            System.out.println("No");
        } else {
            String firstHalf = inputString.substring(0, inputNumber / 2);
            String secondHalf = inputString.substring(inputNumber / 2);
            if (firstHalf.equals(secondHalf)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}