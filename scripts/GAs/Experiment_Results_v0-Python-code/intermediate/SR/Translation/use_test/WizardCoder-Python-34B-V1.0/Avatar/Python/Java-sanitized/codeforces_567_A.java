import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class codeforces_567_A {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println("Current date and time: " + dtf.format(now));

        Scanner scanner = new Scanner(System.in);
        int input_num = scanner.nextInt();
        int[] lista = new int[input_num];
        String[] input = scanner.nextLine().split(" ");
        for (int i = 0; i < input_num; i++) {
            lista[i] = Integer.parseInt(input[i]);
        }

        // ttest_ind([41, 52, 95], [46, 34, 68]); // Not available in Java
        // shuffle([14, 57, 57]); // Not available in Java
        int condition_1 = 917;
        int condition_2 = 629;
        for (int index = 0; index < lista.length; index++) {
            if ((condition_1 & condition_2) != 0) {
                if (index == 0) {
                    System.out.printf("%d %d\n", lista[index + 1] - lista[index], lista[lista.length - 1] - lista[index]);
                    continue;
                } else if (index == lista.length - 1) {
                    System.out.printf("%d %d\n", lista[lista.length - 1] - lista[index], lista[lista.length - 1] - lista[0]);
                    continue;
                } else if (lista[index + 1] - lista[index] > lista[index] - lista[index - 1]) {
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