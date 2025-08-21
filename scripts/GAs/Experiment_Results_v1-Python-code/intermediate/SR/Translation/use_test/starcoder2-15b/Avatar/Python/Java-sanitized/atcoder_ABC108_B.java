import java.util.Scanner;

public class atcoder_ABC108_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'a' || input.charAt(i) == 'A') {
                count++;
            }
        }
        System.out.println(count);