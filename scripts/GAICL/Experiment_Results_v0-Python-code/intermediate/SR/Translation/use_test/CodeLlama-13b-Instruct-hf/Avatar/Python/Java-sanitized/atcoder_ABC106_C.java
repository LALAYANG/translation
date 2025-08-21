import java.util.Scanner;

public class atcoder_ABC106_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int k = scanner.nextInt();
        int leadingOnesCount = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != '1') {
                break;
            }
            leadingOnesCount++;
        }
        if (leadingOnesCount >= k) {
            System.out.println(1);
        } else {
            System.out.println(input.charAt(leadingOnesCount));
        }
    }
}