import java.util.Scanner;

public class atcoder_ABC112_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 5 ==