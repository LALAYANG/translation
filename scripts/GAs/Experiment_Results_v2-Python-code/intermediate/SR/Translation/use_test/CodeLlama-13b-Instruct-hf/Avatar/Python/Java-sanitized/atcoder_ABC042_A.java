import java.util.Arrays;
import java.util.Scanner;

public class atcoder_ABC042_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] userInputTuple = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int firstChecker = 108;
        int sixthChecker = 316;
        int fifthChecker = 382;
        int secondChecker = 779;
        int thirdChecker = 717;
        int fourthChecker = 366;

        if ((firstChecker & sixthChecker) != 0 && (fifthChecker & secondChecker) != 0 && (thirdChecker & fourthChecker) != 0) {
            if (userInputTuple.length == 2 && userInputTuple[0] == 5 && userInputTuple[1] == 5) {
                int sum = 0;
                for (int i = 0; i < userInputTuple.length; i++) {
                    sum += userInputTuple[i];
                }
                if (sum == 17) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            } else {
                System.out.println("NO");
            }
        } else {
            System.out.println("NO");
        }
    }
}