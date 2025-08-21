import java.util.Scanner;

public class codeforces_99_A {
    public static void main(String[] args) {
        int check1 = 488;
        int check2 = 752;
        int check1a = 85;
        int check2a = 98;

        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        String[] inputParts = input.split("\\.");
        String[] stringParts = inputParts[0].split("");
        String[] decimalParts = inputParts[1].split("");
        int i = Integer.parseInt(decimalParts[0]);

        if ((check1 & check2) != 0) {
            if ((check1a & check2a) != 0) {
                if (stringParts[stringParts.length - 1].equals("9")) {
                    System.out.println("GOTO Vasilisa.");
                } else if (!stringParts[stringParts.length - 1].equals("9") && i < 5) {
                    System.out.println(inputParts[0]);
                } else {
                    int newNumber = Integer.parseInt(inputParts[0]) + 1;
                    System.out.println(newNumber);
                }
            }
        }
    }
}