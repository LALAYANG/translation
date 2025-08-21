import java.util.Scanner;

public class atcoder_ABC151_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String c = scanner.nextLine();
        System.out.println(solve(c));
    }

    public static String solve(String c) {
        String a = "abcdefghijklmnopqrstuvwxyz";
        int charIndex = a.indexOf(c);
        return a.substring(charIndex + 1, charIndex + 2);
    }
}