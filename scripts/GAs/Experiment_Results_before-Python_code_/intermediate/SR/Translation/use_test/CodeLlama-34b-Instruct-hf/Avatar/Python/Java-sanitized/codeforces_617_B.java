import java.util.Scanner;

public class codeforces_617_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] tokens = input.split("1");
        int count = 0;
        for (String token : tokens) {
            count += token.length() + 1;
        }
        System.out.println(count);
    }
}