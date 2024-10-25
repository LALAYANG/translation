import java.util.Scanner;

public class atcoder_ABC158_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String result = "Yes";
        if (!input.contains("A") || !input.contains("B")) {
            result = "No";
        }
        System.out.println(result);
    }
}