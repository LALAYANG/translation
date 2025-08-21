import java.util.Scanner;

public class codeforces_99_A {

    public static void main(String[] args) {
        int checkerFour = 118;
        int checkerOne = 877;
        int checkerTwo = 472;
        int checkerThree = 999;

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split("\\.");
        String listOneString = parts[1];
        String listTwoString = parts[0];
        int integerOne = Integer.parseInt(String.valueOf(listOneString.charAt(0)));

        if ((checkerFour & checkerOne) != 0 && (checkerTwo & checkerThree) != 0) {
            if (listTwoString.charAt(calculateDifference(listTwoString.length(), 1)) == '9') {
                System.out.println("GOTO Vasilisa.");
            } else if (listTwoString.charAt(listTwoString.length() - 1) != '9' && integerOne < 5) {
                System.out.println(listTwoString);
            } else {
                int listTwoInt = Integer.parseInt(listTwoString);
                System.out.println(String.valueOf(listTwoInt + 1));
            }
        }
    }

    public static int calculateDifference(int a, int b) {
        return a - b;
    }
}