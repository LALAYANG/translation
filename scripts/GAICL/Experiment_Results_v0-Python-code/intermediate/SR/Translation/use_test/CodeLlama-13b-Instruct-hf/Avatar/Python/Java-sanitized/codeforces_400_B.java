import java.util.Scanner;

public class codeforces_400_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numLines = scanner.nextInt();
        int dummyVar = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numLines; i++) {
            String inputString = scanner.nextLine();
            int startIndex = inputString.indexOf("S");
            int endIndex = inputString.indexOf("G");
            int difference = calculateDifference(startIndex, endIndex);
            System.out.println(difference);
        }
    }

    public static int calculateDifference(int startIndex, int endIndex) {
        return startIndex - endIndex;
    }
}