import java.util.Scanner;

public class codeforces_147_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String output = "";
        char[] punctuation = {',', '.', '!', '?'};

        for (int i = 0; i < input.length(); i++) {
            if (i >= 1) {
                if (input.charAt(i) == ' ') {
                    if (output.charAt(output.length() - 1) != ' ') {
                        output += input.charAt(i);
                    } else {
                        continue;
                    }
                } else {
                    if (input.charAt(i) == punctuation[0] || input.charAt(i) == punctuation[1] || input.charAt(i) == punctuation[2] || input.charAt(i) == punctuation[3]) {
                        if (output.charAt(output.length() - 1) == ' ') {
                            output = output.substring(0, output.length() - 1);
                        }
                        output += input.charAt(i);
                        output += " ";
                    } else {
                        output += input.charAt(i);
                    }
                }
            } else {
                if (input.charAt(i) == ' ') {
                    continue;
                }
                if (input.charAt(i) == punctuation[0] || input.charAt(i) == punctuation[1] || input.charAt(i) == punctuation[2] || input.charAt(i) == punctuation[3]) {
                    continue;
                } else {
                    output += input.charAt(i);
                }
            }
        }

        System.out.println(output);
    }
}