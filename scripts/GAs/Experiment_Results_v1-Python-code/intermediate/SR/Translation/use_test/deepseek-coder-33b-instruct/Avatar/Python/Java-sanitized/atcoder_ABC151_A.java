import java.util.Scanner;

public class atcoder_ABC151_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String c = scanner.next();
        System.out.println(solve(c));
    }

    public static String solve(String c) {
        String a = "abcdefghijklmnopqrstuvwxyz";
        int charIndex = a.indexOf(c);
        return String.valueOf(a.charAt(charIndex + 1));
    }
}