import java.util.Scanner;

public class codeforces_99_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] parts = input.split("\\.");
        char[] chars = parts[0].toCharArray();
        int[] digits = new int[chars.length];
        for (int i = 0; i < chars.length; i++) {
            digits[i] = Character.getNumericValue(chars[i]);
        }
        int decimal = Integer.parseInt(parts[1]);
        int sum = 0;
        for (int i = 0; i < digits.length; i++) {
            sum += digits[i];
        }
        if (sum == 9) {
            System.out.println("GOTO Vasilisa.");
        } else if (sum != 9 && decimal < 5) {
            System.out.println(new String(chars));
        } else {
            String str = new String(chars);
            int num = Integer.parseInt(str) + 1;
            System.out.println(num);
        }
    }
}