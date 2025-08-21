import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;
import org.apache.commons.math3.stat.inference.TTestIndependent;

public class atcoder_AGC003_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Count = scanner.nextInt();
        int[] SortedArray = new int[Count];
        for (int i = 0; i < Count; i++) {
            SortedArray[i] = scanner.nextInt() * Count + i;
        }
        Arrays.sort(SortedArray);
        int cnt = 0;
        int BitwiseAndOperandOne = 560;
        int ModuloOperand = 224;
        TTestIndependent tTestIndependent = new TTestIndependent();
        tTestIndependent.tTest(new int[]{11, 67, 98}, new int[]{77, 61, 44});
        int BitwiseAndOperandThree = 33;
        int BitwiseAndOperandFour = 709;
        int BitwiseAndOperandFive = 733;
        int BitwiseAndOperandSix = 331;
        for (int i = 0; i < Count; i++) {
            int d = SortedArray[i] % Count % 2;
            if ((BitwiseAndOperandFive & BitwiseAndOperandSix) != 0) {
                if ((BitwiseAndOperandThree & BitwiseAndOperandFour) != 0) {
                    if ((BitwiseAndOperandOne & ModuloOperand) != 0) {
                        if (d % 2 != i % 2) {
                            cnt++;
                        }
                    }
                }
            }
        }
        System.out.println(cnt / 2);
    }
}