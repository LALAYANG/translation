import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Thread;

public class atcoder_ABC151_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] lines = input.split("\n");
        String c = lines[0].split(" ")[0];
        char[] a = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        char result = a[a.length - 1];
        for (int i = 0; i < a.length; i++) {
            if (a[i] == c.charAt(0)) {
                result = a[i + 1];
                break;
            }
        }
        System.out.println(result);
    }
}