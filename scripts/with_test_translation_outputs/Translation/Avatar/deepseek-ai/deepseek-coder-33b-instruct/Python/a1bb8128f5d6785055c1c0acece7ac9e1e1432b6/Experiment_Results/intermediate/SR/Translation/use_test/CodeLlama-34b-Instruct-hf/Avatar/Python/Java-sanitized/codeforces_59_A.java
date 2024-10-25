import java.util.Scanner;

public class codeforces_59_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int upperCount = 0;
        int lowerCount = 0;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isLowerCase(c)) {
                lowerCount++;
            } else {
                upperCount++;
            }
        }
        if (upperCount > lowerCount) {
            System.out.println(input.toUpperCase());
        } else {
            System.out.println(input.toLowerCase());
        }
    }
}