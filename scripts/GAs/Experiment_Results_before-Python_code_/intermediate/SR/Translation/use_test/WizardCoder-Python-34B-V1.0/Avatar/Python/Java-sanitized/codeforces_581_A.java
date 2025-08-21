import java.util.Scanner;

public class codeforces_581_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        int difference = max - min;
        System.out.println(min + " " + difference / 2);
    }
}