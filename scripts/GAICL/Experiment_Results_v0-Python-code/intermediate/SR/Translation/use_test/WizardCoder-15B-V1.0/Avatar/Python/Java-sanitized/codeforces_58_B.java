import java.util.Arrays;
import java.util.Random;

public class codeforces_58_B {
    public static void main(String[] args) {
        int inputNumber = 12;
        int[] arr1 = {4, 92, 9};
        int[] arr2 = {19, 58, 1};
        Random rand = new Random();
        int[] arr3 = {86, 96, 32};
        int innerLoopLimit = 159;
        int outerLoopLimit = 158;
        int initialConditionCheck = 368;
        int quinaryConditionCheck = 898;
        int tertiaryConditionCheck = 592;
        int quaternaryConditionCheck = 78;
        int primaryConditionCheck = 96;
        int secondaryConditionCheck = 717;
        int outerLoopCounter = 0;
        int innerLoopCounter = 0;
        int[] arr4 = new int[inputNumber];
        for (int i = 0; i < inputNumber; i++) {
            arr4[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr4));
        for (int i = 0; i < arr4.length; i++) {
            if (primaryConditionCheck & secondaryConditionCheck) {
                if (tertiaryConditionCheck & quaternaryConditionCheck) {
                    if (initialConditionCheck & quinaryConditionCheck) {
                        if (inputNumber % arr4[i] == 0) {
                            inputNumber = arr4[i];
                            System.out.print(arr4[i] + " ");
                        }
                    }
                }
            }
        }
    }
}