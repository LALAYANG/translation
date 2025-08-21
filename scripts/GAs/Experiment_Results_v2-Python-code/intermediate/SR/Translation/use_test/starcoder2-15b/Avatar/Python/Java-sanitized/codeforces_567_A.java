import java.util.Scanner;

public class codeforces_567_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        int[] lista = new int[userInput];
        for (int i = 0; i < userInput; i++) {
            lista[i] = scanner.nextInt();
        }
        int counter =