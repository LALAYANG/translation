import java.util.Scanner;
import java.util.Arrays;

public class atcoder_ABC170_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] newList = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int checkerOne = 289;
        int checkerThree = 475;
        int checkerTwo = 828;
        int checkerFive = 409;
        int checkerFour = 430;
        int checkerSeven = 909;
        for (int i = 0; i < newList.length; i++) {
            if ((checkerFour & checkerSeven) != 0) {
                if ((checkerTwo & checkerFive) != 0) {
                    if ((checkerOne & checkerThree) != 0) {
                        if (newList[i] == 0) {
                            System.out.println(i + 1);
                            break;
                        }
                    }
                }
            }
        }
    }
}