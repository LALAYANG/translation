import java.util.Scanner;

public class codeforces_581_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstInput = scanner.nextInt();
        int secondInput = scanner.nextInt();
        int min = Math.min(firstInput, secondInput);
        int max = Math.max(firstInput, secondInput);
        System.out.println(min + " " + (max - min) / 2);
    }
}