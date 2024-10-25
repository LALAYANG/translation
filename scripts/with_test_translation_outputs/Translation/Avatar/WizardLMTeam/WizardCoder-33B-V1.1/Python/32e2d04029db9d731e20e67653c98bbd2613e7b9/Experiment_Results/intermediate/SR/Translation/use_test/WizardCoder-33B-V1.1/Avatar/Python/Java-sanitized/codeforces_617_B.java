import java.util.Scanner;

public class codeforces_617_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // consume the newline after the number
        String a = scanner.nextLine();
        System.out.println(process(a));
    }

    public static int process(String a) {
        if (!a.contains("1")) {
            return 0;
        }

        String[] parts = a.split("1");
        int product = 1;
        for (String part : parts) {
            int count = part.length() + 1;
            product *= count;
        }
        return product;
    }
}