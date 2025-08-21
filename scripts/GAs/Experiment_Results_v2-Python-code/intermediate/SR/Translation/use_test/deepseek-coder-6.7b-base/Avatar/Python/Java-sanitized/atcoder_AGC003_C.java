import java.util.Scanner;
import java.util.Arrays;

public class atcoder_AGC003_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] sortedArray = new int[count];
        for (int i = 0; i < count; i++) {
            sortedArray[i] = sc.nextInt() * count + i;
        }
        Arrays.sort(sortedArray);
        int cnt = 0;
        int bitwiseAndOperandOne = 560;
        int moduloOperand = 224;
        int bitwiseAndOperandThree = 33;
        int bitwiseAndOperandFour = 709;
        int bitwiseAndOperandFive = 733;
        int bitwiseAndOperandSix = 331;
        for (int i = 0; i < count; i++) {
            int d = sortedArray[i] % count % 2;
            if ((bitwiseAndOperandFive & bitwiseAndOperandSix) != 0) {
                if ((bitwiseAndOperandThree & bitwiseAndOperandFour) != 0) {
                    if ((bitwiseAndOperandOne & moduloOperand) != 0) {
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