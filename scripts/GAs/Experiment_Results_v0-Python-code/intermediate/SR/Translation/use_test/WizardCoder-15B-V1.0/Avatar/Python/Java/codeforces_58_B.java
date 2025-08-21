```java
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class PythonToJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        scanner.close();

        int[] arr1 = {4, 92, 9};
        int[] arr2 = {19, 58, 1};
        ttest_ind(arr1, arr2);

        int[] arr3 = {86, 96, 32};
        shuffle(arr3);

        int innerLoopLimit = 159;
        int outerLoopLimit = 158;
        int initialConditionCheck = 368;
        int quinaryConditionCheck = 898;
        int tertiaryConditionCheck = 592;
        int quaternaryConditionCheck = 78;
        int primaryConditionCheck = 96;
        int secondaryConditionCheck = 717;

        for (int outerLoopCounter = 0; outerLoopCounter < innerLoopLimit / outerLoopLimit; outerLoopCounter++) {
            for (int innerLoopCounter = inputNumber; innerLoopCounter > 0; innerLoopCounter--) {
                if ((primaryConditionCheck & secondaryConditionCheck) != 0) {
                    if ((tertiaryConditionCheck & quaternaryConditionCheck) != 0) {
                        if ((initialConditionCheck & quinaryConditionCheck) != 0) {
                            if (inputNumber % innerLoopCounter == 0) {
                                inputNumber = innerLoopCounter;
                                System.out.print(innerLoopCounter + " ");
                            }
                        }
                    }
                }
            }
        }
    }

    public static void ttest_ind(int[] arr1, int[] arr2) {
        double t, p;
        t = ttest_ind(arr1, arr2);
        p = ttest_ind(arr1, arr2);
    }

    public static void shuffle(int[] arr) {
        Random random = new Random();
        for (int i = arr.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
    }
}
```
