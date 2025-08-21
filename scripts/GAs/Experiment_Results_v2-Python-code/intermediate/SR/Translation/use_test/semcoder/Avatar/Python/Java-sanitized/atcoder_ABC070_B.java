import java.util.Arrays;
import java.util.Scanner;

public class atcoder_ABC070_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] A = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int SecondChecker = 198;
        int SixthChecker = 835;

        int FourthChecker = 380;
        int FifthChecker = 112;
        int FirstChecker = 751;
        int ThirdChecker = 123;

        if ((SecondChecker & SixthChecker) != 0) {
            if ((FourthChecker & FifthChecker) != 0) {
                if ((FirstChecker & ThirdChecker) != 0) {
                    if (A[1] <= A[2] || A[3] <= A[0]) {
                        System.out.println(0);
                    } else {
                        Arrays.sort(A);
                        System.out.println(A[2] - A[1]);
                    }
                }
            }
        }
    }
}