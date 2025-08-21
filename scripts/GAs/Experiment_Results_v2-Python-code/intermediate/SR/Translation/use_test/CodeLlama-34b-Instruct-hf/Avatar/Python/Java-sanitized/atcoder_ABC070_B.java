import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class atcoder_ABC070_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[4];
        for (int i = 0; i < 4; i++) {
            A[i] = scanner.nextInt();
        }

        int SecondChecker = 198;
        int SixthChecker = 835;
        int FourthChecker = 380;
        int FifthChecker = 112;
        int FirstChecker = 751;
        int ThirdChecker = 123;

        if (SecondChecker & SixthChecker) {
            if (FourthChecker & FifthChecker) {
                if (FirstChecker & ThirdChecker) {
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