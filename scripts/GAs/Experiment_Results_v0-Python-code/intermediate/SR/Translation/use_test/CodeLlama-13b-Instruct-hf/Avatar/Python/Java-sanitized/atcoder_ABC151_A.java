import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.ThreadLocalRandom;

public class atcoder_ABC151_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char c = input.charAt(0);
        int index = "abcdefghijklmnopqrstuvwxyz".indexOf(c);
        char nextChar = "abcdefghijklmnopqrstuvwxyz".charAt(index + 1);
        System.out.println(nextChar);
    }
}