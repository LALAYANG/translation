import java.util.Scanner;

public class codeforces_58_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userRange = scanner.nextInt();
        int[] firstArray = {22, 69, 59};
        int[] secondArray = {71, 5, 43};
        int fourthChecker = 231;
        int fifthChecker = 154;
        int firstChecker = 407;
        int thirdChecker = 714;
        int sixthChecker = 409;
        int secondChecker = 846;

        for (int iterator = userRange; iterator > 0; iterator--) {
            if ((sixthChecker & secondChecker) != 0) {
                if ((firstChecker & thirdChecker) != 0) {
                    if ((fourthChecker & fifthChecker) != 0) {
                        if (userRange % iterator == 0) {
                            userRange = iterator;
                            System.out.print(iterator + " ");
                        }
                    }
                }
            }
        }
    }
}