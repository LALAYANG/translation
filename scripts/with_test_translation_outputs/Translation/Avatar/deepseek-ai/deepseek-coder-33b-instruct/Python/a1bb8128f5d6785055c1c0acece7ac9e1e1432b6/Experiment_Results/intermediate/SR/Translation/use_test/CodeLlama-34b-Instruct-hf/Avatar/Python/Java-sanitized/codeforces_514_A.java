import java.util.Scanner;

public class codeforces_514_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String output = "";

        if (input.length() != 1) {
            if (input.charAt(0) == '9') {
                output = "9";
                input = input.substring(1);
            }
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                if (c > '4') {
                    int n = 9 - (c - '0');
                    output += String.valueOf(n);
                } else {
                    output += c;
                }
            }
        } else {
            output = input;
        }

        System.out.println(Integer.parseInt(output));
    }
}