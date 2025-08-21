import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class codeforces_58_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
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
}