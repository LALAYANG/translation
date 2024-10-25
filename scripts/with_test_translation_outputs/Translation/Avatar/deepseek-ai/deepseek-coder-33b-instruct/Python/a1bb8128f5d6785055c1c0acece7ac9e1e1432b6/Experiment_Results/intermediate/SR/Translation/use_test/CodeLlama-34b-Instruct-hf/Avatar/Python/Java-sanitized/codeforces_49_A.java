import java.util.Scanner;

public class codeforces_49_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String vowels = "aeiouyAEIOUY";
        boolean hasVowel = false;

        for (int i = input.length() - 1; i >= 0; i--) {
            if (input.charAt(i) == ' ' || input.charAt(i) == '?') {
                continue;
            } else {
                if (vowels.contains(input.charAt(i))) {
                    hasVowel = true;
                    break;
                }
            }
        }

        if (hasVowel) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}