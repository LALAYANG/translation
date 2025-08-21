import java.util.Scanner;

public class codeforces_99_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inputString = input.split("\\.");
        int check1 = 488;
        int check2 = 752;
        int check1a = 85;
        int check2a = 98;
        int i = Integer.parseInt(inputString[1]);
        if (check1 & check2) {
            if (check1a & check2a) {
                if (inputString[0].charAt(inputString[0].length() - 1) == '9') {
                    System.out.println("GOTO Vasilisa.");
                } else if (inputString[0].charAt(inputString[0].length() - 1) != '9' && i < 5) {
                    System.out.println(inputString[0]);
                } else {
                    System.out.println(Integer.toString(Integer.parseInt(inputString[0]) + 1));
                }
            }
        }
    }
}