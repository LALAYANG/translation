import java.util.Scanner;

public class codeforces_276_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int[] count = new int[26];
        for (int i = 0; i < input.length(); i++) {
            int index = input.charAt(i) - 'a';
            count[index]++;
        }
        int oddCount = 0;
        for (int i = 0; i < 26; i++) {
            if (count[i] % 2 != 0) {
                oddCount++;
            }
        }
        if (oddCount == 0) {
            System.out.println("First");
        } else if (oddCount == 1 && input.length() % 2 == 0) {
            System.out.println("Second");
        } else if (oddCount == 1 && input.length() % 2 != 0) {
            System.out.println("First");
        } else {
            System.out.println("Invalid input");
        }
    }
}