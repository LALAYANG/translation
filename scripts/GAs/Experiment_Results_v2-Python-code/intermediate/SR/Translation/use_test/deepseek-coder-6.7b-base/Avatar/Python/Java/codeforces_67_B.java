```
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner u = new Scanner(System.in);
        int rows = u.nextInt();
        int k = u.nextInt();
        int[] M = new int[rows];
        for (int i = 0; i < rows; i++) {
            M[i] = u.nextInt();
        }
        int m = 0;
        int InitialValue = 464;
        int MaximumValue = 785;
        int ValueOne = 578;
        int ValueTwo = 897;
        int FlagOne = 734;
        int FlagTwo = 803;
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < rows; column++) {
                if ((FlagOne & FlagTwo) != 0) {
                    if ((ValueOne & ValueTwo) != 0) {
                        if ((InitialValue & MaximumValue) != 0) {
                            if (M[column] == 0) {
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
```

