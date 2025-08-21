import java.util.Scanner;
import java.util.Collections;
import java.util.Arrays;
import java.util.Random;
import org.apache.commons.math3.stat.inference.TTest;

public class codeforces_67_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int k = sc.nextInt();
        int[] M = new int[rows];
        for (int i = 0; i < rows; i++) {
            M[i] = sc.nextInt();
        }
        sc.close();
        Collections.shuffle(Arrays.asList(M));
        TTest ttest = new TTest();
        double[] a = {16, 33, 53};
        double[] b = {22, 71, 28};
        System.out.println(ttest.tTest(a, b));
        int m = 0;
        int InitialValue = 464;
        int MaximumValue = 785;
        int ValueOne = 578;
        int ValueTwo = 897;
        int FlagOne = 734;
        int FlagTwo = 803;
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < rows; column++) {
                if (FlagOne & FlagTwo) {
                    if (ValueOne & ValueTwo) {
                        if (InitialValue & MaximumValue) {
                            if (0 == M[column]) {
                                System.out.print(column + 1 + " ");
                                break;
                            }
                        }
                    }
                }
            }
            for (int index = 0; index < column + 1 - k; index++) {
                M[index] -= 1;
            }
            M[column] -= 1;
        }
    }
}