import java.util.Scanner;

public class codeforces_99_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        String[] parts = input.split("\\.");
        char[] integerPart = parts[0].toCharArray();
        int decimalPart = Integer.parseInt(String.valueOf(parts[1].charAt(0)));

        if (integerPart[integerPart.length - 1] == '9') {
            System.out.println("GOTO Vasilisa.");
        } else if (integerPart[integerPart.length - 1] != '9' && decimalPart < 5) {
            System.out.println(new String(integerPart));
        } else {
            integerPart[integerPart.length - 1]++;
            System.out.println(new String(integerPart));
        }
    }
}