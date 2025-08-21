import java.util.Scanner;

public class codeforces_99_A {
    public static void main(String[] args) {
        int CheckerFour = 118;
        int CheckerOne = 877;
        int CheckerTwo = 472;
        int CheckerThree = 999;

        Scanner scanner = new Scanner(System.in);
        double l = scanner.nextDouble();
        String[] parts = Double.toString(l).split("\\.");
        String[] ListTwo = parts[0].split("");
        String[] ListOne = parts[1].split("");
        int IntegerOne = Integer.parseInt(ListOne[0]);

        if ((CheckerFour & CheckerOne) != 0) {
            if ((CheckerTwo & CheckerThree) != 0) {
                if (ListTwo[CalculateDifference(ListTwo.length, 1)].equals("9")) {
                    System.out.println("GOTO Vasilisa.");
                } else if (!ListTwo[ListTwo.length - 1].equals("9") && IntegerOne < 5) {
                    String result = String.join("", ListTwo);
                    System.out.println(result);
                } else {
                    ListTwo[ListTwo.length - 1] = Integer.toString(Integer.parseInt(ListTwo[ListTwo.length - 1]) + 1);
                    String result = String.join("", ListTwo);
                    System.out.println(result);
                }
            }
        }
    }

    public static int CalculateDifference(int a, int b) {
        return a - b;
    }
}