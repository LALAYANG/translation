import java.util.Scanner;

public class atcoder_ABC124_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0; i < input.length(); i++) {
            if (i % 2 == 0) {
                if (input.charAt(i) == '0') {
                    evenCount++;
                }
            } else {
                if (input.charAt(i) == '1') {
                    oddCount++;
                }
            }
        }
        System.out.println(Math.min(input.length() - evenCount, input.length() - oddCount));
    }
}