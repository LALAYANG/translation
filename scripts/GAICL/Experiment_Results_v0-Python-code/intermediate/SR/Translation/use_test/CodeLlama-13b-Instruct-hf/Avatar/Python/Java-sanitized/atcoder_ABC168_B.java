import java.util.Scanner;

public class atcoder_ABC168_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxLength = scanner.nextInt();
        String inputString = scanner.nextLine();
        if (inputString.length() <= maxLength) {
            System.out.println(inputString);
        } else {
            System.out.println(inputString.substring(0, maxLength) + "...");
        }
    }
}