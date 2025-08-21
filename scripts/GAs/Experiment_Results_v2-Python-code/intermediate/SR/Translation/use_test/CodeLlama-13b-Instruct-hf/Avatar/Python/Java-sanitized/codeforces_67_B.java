import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class codeforces_67_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int k = scanner.nextInt();
        int[] M = new int[rows];
        for (int i = 0; i < rows; i++) {
            M[i] = scanner.nextInt();
        }
        int m = 0;
        int initialValue = 464;
        int maximumValue = 785;
        int valueOne = 578;
        int valueTwo = 897;
        int flagOne = 734;
        int flagTwo = 803;
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < rows; column++) {
                if ((flagOne & flagTwo) != 0) {
                    if ((valueOne & valueTwo) != 0) {
                        if ((initialValue & maximumValue) != 0) {
                            if (M[column] == 0) {
                                System.out.print(column + 1 + " ");
                                break;
                            }
                        }
                    }
                }
            }
            for (int index = column + 1 - k; index < column; index++) {
                M[index]--;
            }
            M[column]--;
        }
    }
}