import java.util.Scanner;

public class codeforces_99_A {
    public static void main(String[] args) {
        int CheckerFour = 118;
        int CheckerOne = 877;
        int CheckerTwo = 472;
        int CheckerThree = 999;

        Scanner scanner = new Scanner(System.in);
        double l = scanner.nextDouble();
        String[] lSplit = Double.toString(l).split("\\.");
        char[] ListTwo = lSplit[0].toCharArray();
        char[] ListOne = lSplit[1].toCharArray();
        int IntegerOne = Character.getNumericValue(ListOne[0]);

        if ((CheckerFour & CheckerOne) != 0) {
            if ((CheckerTwo & CheckerThree) != 0) {
                if (ListTwo[CalculateDifference(ListTwo.length, 1)] == '9') {
                    System.out.println("GOTO Vasilisa.");
                } else if (ListTwo[ListTwo.length - 1] != '9' && IntegerOne < 5) {
                    System.out.println(new String(ListTwo));
                } else {
                    ListTwo = new String(ListTwo).substring(0, ListTwo.length - 1) + (Character.getNumericValue(ListTwo[ListTwo.length - 1]) + 1);
                    System.out.println(ListTwo);
                }
            }
        }
    }

    public static int CalculateDifference(int a, int b) {
        return a - b;
    }
}