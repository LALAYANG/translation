import java.util.Scanner;

public class atcoder_ABC151_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String c = scanner.nextLine();
        char[] a = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        int i = "abcdefghijklmnopqrstuvwxyz".indexOf(c);
        System.out.println(a[i + 1]);
    }
}