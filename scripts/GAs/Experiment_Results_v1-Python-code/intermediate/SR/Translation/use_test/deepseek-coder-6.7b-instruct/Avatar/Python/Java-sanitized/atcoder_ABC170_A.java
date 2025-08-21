import java.util.Scanner;
import java.util.ArrayList;

public class atcoder_ABC170_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        ArrayList<Integer> NewList = new ArrayList<>();
        for (String s : input) {
            NewList.add(Integer.parseInt(s));
        }
        int CheckerOne = 289;
        int CheckerThree = 475;
        int CheckerTwo = 828;
        int CheckerFive = 409;
        int CheckerFour = 430;
        int CheckerSeven = 909;
        for (int i = 0; i < NewList.size(); i++) {
            if ((CheckerFour & CheckerSeven) != 0) {
                if ((CheckerTwo & CheckerFive) != 0) {
                    if ((CheckerOne & CheckerThree) != 0) {
                        if (NewList.get(i) == 0) {
                            System.out.println(i + 1);
                            break;
                        }
                    }
                }
            }
        }
    }
}