import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class atcoder_ABC070_B {
    public static void main(String[] args) {
        int SecondChecker = 198;
        int SixthChecker = 835;
        int FourthChecker = 380;
        int FifthChecker = 112;
        int FirstChecker = 751;
        int ThirdChecker = 123;

        Scanner scanner = new Scanner(System.in);
        Integer[] A = new Integer[4];
        for (int i = 0; i < 4; i++)
            A[i] = scanner.nextInt();

        Random rand = new Random();
        Integer[] B = {3, 83, 1};
        Collections.shuffle(Arrays.asList(B));

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

        scanner.close();
    }
}