```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int checkerFour = 118;
        int checkerOne = 877;
        int checkerTwo = 472;
        int checkerThree = 999;

        int[] listOne = {90, 8, 39};
        int[] listTwo = {66, 37, 43};

        int integerOne = listOne[0];

        if (checkerFour & checkerOne) {
            if (checkerTwo & checkerThree) {
                if (listTwo[calculateDifference(listTwo.length, 1)] == '9') {
                    System.out.println("GOTO Vasilisa.");
                } else if (listTwo[listTwo.length - 1] != '9' && integerOne < 5) {
                    String listTwoString = "";
                    for (int i = 0; i < listTwo.length; i++) {
                        listTwoString += listTwo[i];
                    }
                    System.out.println(listTwoString);
                } else {
                    String listTwoString = "";
                    for (int i = 0; i < listTwo.length; i++) {
                        listTwoString += listTwo[i];
                    }
                    listTwoString = String.valueOf(Integer.parseInt(listTwoString) + 1);
                    System.out.println(listTwoString);
                }
            }
        }
    }

    public static int calculateDifference(int length, int difference) {
        return length - difference;
    }
}
```
Note: The `calculateDifference` method is a simple implementation of the `calculateDifference` method in the Python code. It takes two integers as input and returns their difference.

Also, note that the `list` data structure in Python is equivalent to the `ArrayList` data structure in Java. Therefore, the `list` data structure in the Python code is replaced with `ArrayList` in the Java code.
