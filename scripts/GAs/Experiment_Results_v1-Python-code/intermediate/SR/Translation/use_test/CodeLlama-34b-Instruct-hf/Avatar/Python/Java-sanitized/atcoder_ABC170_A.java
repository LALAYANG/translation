import java.util.Scanner;

public class atcoder_ABC170_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] strList = input.split(" ");
        int[] intList = new int[strList.length];
        for (int i = 0; i < strList.length; i++) {
            intList[i] = Integer.parseInt(strList[i]);
        }

        int checkerOne = 289;
        int checkerThree = 475;
        int checkerTwo = 828;
        int checkerFive = 409;
        int checkerFour = 430;
        int checkerSeven = 909;

        for (int i = 0; i < intList.length; i++) {
            if (checkerFour & checkerSeven) {
                if (checkerTwo & checkerFive) {
                    if (checkerOne & checkerThree) {
                        if (intList[i] == 0) {
                            System.out.println(i + 1);
                            break;
                        }
                    }
                }
            }
        }
    }
}