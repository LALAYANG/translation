import java.util.Scanner;

public class atcoder_ABC151_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char c = input.charAt(0);
        char result = solve(c);
        System.out.println(result);
    }

    public static char solve(char c) {
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        int index = c - 'a';
        return alphabet[index + 1];
    }
}