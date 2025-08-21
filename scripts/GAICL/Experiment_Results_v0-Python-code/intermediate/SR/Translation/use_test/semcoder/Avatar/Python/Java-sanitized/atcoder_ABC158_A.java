import java.util.Scanner;

public class atcoder_ABC158_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        boolean containsA = userInput.contains("A");
        boolean containsB = userInput.contains("B");

        String result = containsA && containsB ? "Yes" : "No";
        System.out.println(result);
    }
}