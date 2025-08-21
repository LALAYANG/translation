import java.util.Scanner;

public class codeforces_99_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split("\\.");
        String integerPart = parts[0];
        String decimalPart = parts[1];
        int i = Integer.parseInt(decimalPart.substring(0, 1));
        if (check1 & check2) {
            if (check1a & check2a) {
                if (integerPart.charAt(integerPart.length() - 1) == '9') {
                    System.out.println("GOTO Vasilisa.");
                } else if (i < 5) {
                    System.out.println(integerPart);
                } else {
                    System.out.println(Integer.parseInt(integerPart) + 1);
                }
            }
        }
    }
}