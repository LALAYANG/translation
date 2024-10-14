import java.util.Scanner;

public class codeforces_617_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '1') {
                count++;
            }
        }
        if (count == 0) {
            System.out.println(0);
        } else {
            int product = 1;
            for (int i = 0; i < count; i++) {
                product *= (input.charAt(i) - '0') + 1;
            }
            System.out.println(product);
        }
    }
}