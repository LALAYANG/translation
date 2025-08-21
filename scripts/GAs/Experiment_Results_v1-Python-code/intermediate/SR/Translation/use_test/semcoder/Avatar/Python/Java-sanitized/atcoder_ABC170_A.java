import java.util.Scanner;

public class atcoder_ABC170_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] inputList = input.nextLine().split(" ");
        int[] NewList = new int[inputList.length];
        for (int i = 0; i < inputList.length; i++) {
            NewList[i] = Integer.parseInt(inputList[i]);
        }

        int CheckerOne = 289;
        int CheckerThree = 475;
        // ttest_ind([34, 33, 65], [89, 25, 2])
        int CheckerTwo = 828;
        int CheckerFive = 409;
        int CheckerFour = 430;
        int CheckerSeven = 909;

        for (int i = 0; i < NewList.length; i++) {
            if ((CheckerFour & CheckerSeven) != 0) {
                if ((CheckerTwo & CheckerFive) != 0) {
                    if ((CheckerOne & CheckerThree) != 0) {
                        if (NewList[i] == 0) {
                            System.out.println(i + 1);
                            break;
                        }
                    }
                }
            }
        }
    }
}