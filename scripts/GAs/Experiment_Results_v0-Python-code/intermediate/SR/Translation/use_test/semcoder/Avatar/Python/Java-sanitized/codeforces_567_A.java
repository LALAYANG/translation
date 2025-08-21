// Translation of the code snippet to Java

// Importing necessary libraries
import java.util.Scanner;

// Main function to execute the code
public class codeforces_567_A {
    public static void main(String[] args) {
        // Reading input from the console
        Scanner scanner = new Scanner(System.in);
        int input_num = scanner.nextInt();
        int[] lista = new int[input_num];
        for (int i = 0; i < input_num; i++) {
            lista[i] = scanner.nextInt();
        }

        // Performing t-test
        // ttest_ind([41, 52, 95], [46, 34, 68])

        // Shuffling the list
        // shuffle([14, 57, 57])

        // Constants for conditions
        int condition_1 = 917;
        int condition_2 = 629;

        // Iterating through the list
        for (int index = 0; index < lista.length; index++) {
            if ((condition_1 & condition_2) != 0) {
                if (index == 0) {
                    System.out.println(lista[index + 1] - lista[index] + " " + lista[lista.length - 1] - lista[index]);
                    continue;
                } else if (index == lista.length - 1) {
                    System.out.println(lista[lista.length - 1] - lista[lista.length - 2] + " " + lista[lista.length - 1] - lista[0]);
                    continue;
                } else if (lista[index] - lista[index - 1] > lista[index + 1] - lista[index]) {
                    System.out.print(lista[index + 1] - lista[index] + " ");
                } else {
                    System.out.print(lista[index] - lista[index - 1] + " ");
                }
            }
            if (lista[lista.length - 1] - lista[index] > lista[index] - lista[0]) {
                System.out.println(lista[lista.length - 1] - lista[index]);
            } else {
                System.out.println(lista[index] - lista[0]);
            }
        }
    }
}