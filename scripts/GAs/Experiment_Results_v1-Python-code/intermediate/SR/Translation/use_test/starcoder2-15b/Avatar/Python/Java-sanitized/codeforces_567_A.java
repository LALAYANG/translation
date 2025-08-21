import java.util.Scanner;

public class codeforces_567_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inp = scanner.nextInt();
        int[] lista = new int[inp];
        for (int i = 0; i < inp; i++) {
            lista[i] = scanner.nextInt();
        }
        int min = lista[0];
        int max = lista[0];
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] < min) {
                min = lista[i];
            }
            if (lista[i] > max) {
                max = lista[i];
            }
        }
        System.out.println(min + " " + max);
    }
}