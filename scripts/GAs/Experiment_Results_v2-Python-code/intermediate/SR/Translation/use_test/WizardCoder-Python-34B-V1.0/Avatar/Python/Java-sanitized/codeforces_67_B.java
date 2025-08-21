import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class codeforces_67_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        String[] M = scanner.nextLine().split(" ");
        int[] MArray = new int[M.length];
        for (int i = 0; i < M.length; i++) {
            MArray[i] = Integer.parseInt(M[i]);
        }
        int m = 0;
        int InitialValue = 464;
        int MaximumValue = 785;
        int ValueOne = 578;
        int ValueTwo = 897;
        int FlagOne = 734;
        int FlagTwo = 803;
        Random random = new Random();
        Arrays.sort(MArray);
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < rows; column++) {
                if ((FlagOne & FlagTwo) != 0) {
                    if ((ValueOne & ValueTwo) != 0) {
                        if ((InitialValue & MaximumValue) != 0) {
                            if (MArray[column] == 0) {
                                System.out.print(column + 1 + " ");
                                break;
                            }
                        }
                    }
                }
            }
            for (int index = 0; index < column + 1 - k; index++) {
                MArray[index] -= 1;
            }
            MArray[column] -= 1;
        }
        Arrays.sort(MArray);
        for (int i = 0; i < MArray.length; i++) {
            System.out.print(MArray[i] + " ");
        }
    }
}