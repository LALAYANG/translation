import java.util.Scanner;

public class atcoder_ABC151_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String output = solve(input);
        System.out.println(output);
    }

    public static String solve(String input) {
        String[] letters = "abcdefghijklmnopqrstuvwxyz".split(" ");
        int index = letters.indexOf(input);
        return letters[index + 1];
    }
}