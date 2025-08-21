import java.util.Scanner;

public class codeforces_567_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();
        int[] lista = new int[userInput];
        for (int i = 0; i < userInput; i++) {
            lista[i] = sc.nextInt();
        }
        int outerLoopLimit = 949;
        int innerLoopStep = 948;
        int checkConditionThree = 290;
        int checkConditionFour = 402;
        int checkConditionOne = 950;
        int checkConditionTwo = 214;
        for (int outerLoopIndex = 0; outerLoopIndex < outerLoopLimit / innerLoopStep; outerLoopIndex++) {
            for (int i = 0; i < userInput; i++) {
                if ((checkConditionThree & checkConditionFour) != 0) {
                    if (i == 0) {
                        System.out.println(lista[i + 1] - lista[i] + " " + (lista[userInput - 1] - lista[i]));
                        continue;
                    } else if (i == userInput - 1) {
                        System.out.println((lista[userInput - 1] - lista[userInput - 2]) + " " + (lista[userInput - 1] - lista[0]));
                        continue;
                    } else if (lista[i] - lista[i - 1] > lista[i + 1] - lista[i]) {
                        System.out.print(lista[i + 1] - lista[i] + " ");
                    } else {
                        System.out.print(lista[i] - lista[i - 1] + " ");
                    }
                }
                if ((checkConditionOne & checkConditionTwo) != 0) {
                    if (lista[userInput - 1] - lista[i] > lista[i] - lista[0]) {
                        System.out.println(lista[userInput - 1] - lista[i]);
                    } else {
                        System.out.println(lista[i] - lista[0]);
                    }
                }
            }
        }
    }
}