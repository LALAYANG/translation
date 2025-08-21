import java.util.Arrays;
import org.apache.commons.math3.stat.inference.TTest;

public class atcoder_AGC003_C {
    public static void main(String[] args) {
        int Count = Integer.parseInt(args[0]);
        int[] SortedArray = new int[Count];
        for (int i = 0; i < Count; i++) {
            SortedArray[i] = Integer.parseInt(args[i+1]) * Count + i;
        }
        Arrays.sort(SortedArray);
        int cnt = 0;
        int BitwiseAndOperandOne = 560;
        int ModuloOperand = 224;
        int BitwiseAndOperandThree = 33;
        int BitwiseAndOperandFour = 709;
        int BitwiseAndOperandFive = 733;
        int BitwiseAndOperandSix = 331;
        for (int i = 0; i < Count; i++) {
            int d = SortedArray[i] % Count % 2;
            if ((BitwiseAndOperandFive & BitwiseAndOperandSix) != 0) {
                if ((BitwiseAndOperandThree & BitwiseAndOperandFour) != 0) {
                    if ((BitwiseAndOperandOne & ModuloOperand) != 0) {
                        if (d != (i % 2)) {
                            cnt++;
                        }
                    }
                }
            }
        }
        System.out.println(cnt / 2);
    }
}