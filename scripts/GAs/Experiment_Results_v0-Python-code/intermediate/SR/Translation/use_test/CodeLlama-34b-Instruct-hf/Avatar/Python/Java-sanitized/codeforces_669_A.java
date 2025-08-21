import java.util.Scanner;

public class codeforces_669_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numInput = scanner.nextInt();
        int result = multiply(numInput, 2);
        System.out.println((result + 1) / 3);
    }

    public static int multiply(int a, int b) {
        return a * b;
    }
}