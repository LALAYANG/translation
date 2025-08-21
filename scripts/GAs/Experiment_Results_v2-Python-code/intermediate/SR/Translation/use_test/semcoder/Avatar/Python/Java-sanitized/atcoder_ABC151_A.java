import java.util.Scanner;

public class atcoder_ABC151_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char c = input.charAt(0);

        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int index = alphabet.indexOf(c);
        char nextChar = alphabet.charAt((index + 1) % alphabet.length());

        System.out.println(nextChar);
    }
}