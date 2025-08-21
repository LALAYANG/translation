import java.util.Scanner;

public class codeforces_99_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] splitted = input.split("\\.");
        String[] first = splitted[0].split("");
        String[] second = splitted[1].split("");
        int firstInt = Integer.parseInt(second[0]);
        if ((118 & 877) != 0) {
            if ((472 & 999) != 0) {
                if (first[first.length - 1].equals("9")) {
                    System.out.println("GOTO Vasilisa.");
                } else if (!first[first.length - 1].equals("9") && firstInt < 5) {
                    System.out.println(String.join("", first));
                } else {
                    System.out.println(String.join("", first) + 1);
                }
            }
        }
    }
}