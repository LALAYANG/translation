import java.util.Scanner;

public class codeforces_59_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int lowerCaseCount = 0;
        int upperCaseCount = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isLowerCase(c)) {
                lowerCaseCount++;
            } else {
                upperCaseCount++;
            }
        }

        String output;
        if (lowerCaseCount > upperCaseCount) {
            output = input.toLowerCase();
        } else {
            output = input.toUpperCase();
        }

        System.out.println(output);
    }
}