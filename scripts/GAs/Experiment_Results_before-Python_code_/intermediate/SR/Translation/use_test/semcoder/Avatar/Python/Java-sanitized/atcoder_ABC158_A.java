import java.util.Scanner;

public class atcoder_ABC158_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        boolean containsA = input.contains("A");
        boolean containsB = input.contains("B");

        String result = containsA && containsB ? "Yes" : "No";
        System.out.println(result);
    }
}