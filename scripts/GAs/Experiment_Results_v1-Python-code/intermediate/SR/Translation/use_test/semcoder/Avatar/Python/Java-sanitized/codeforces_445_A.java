import java.util.Scanner;

public class codeforces_445_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num_lines = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character

        String[] l = new String[num_lines];
        for (int current_line = 0; current_line < num_lines; current_line++) {
            String s = scanner.nextLine();
            s = s.replace('.', 'B');  // Replace '.' with 'B' for simplicity
            s = s.replace('W', '.');  // Replace 'W' with '.' for simplicity
            l[current_line] = s;
        }

        for (String c : l) {
            System.out.println(c);
        }
    }
}