import java.util.Scanner;

public class codeforces_99_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split("\\.");
        String[] decimalParts = parts[1].split("");
        int i = Integer.parseInt(decimalParts[0]);
        if ((488 & 752) & (85 & 98)) {
            if (parts[parts.length - 1].equals("9")) {
                System.out.println("GOTO Vasilisa.");
            } else if (!parts[parts.length - 1].equals("9") && i < 5) {
                System.out.println(String.join("", parts));
            } else {
                System.out.println(String.join("", parts) + 1);
            }
        }
    }
}