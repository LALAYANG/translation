import java.util.Scanner;
import java.util.ArrayList;

public class codeforces_445_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numLines = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();
        ArrayList<String> lines = new ArrayList<>();
        for (int i = 0; i < numLines; i++) {
            String line = scanner.nextLine();
            char[] chars = line.toCharArray();
            for (int j = 0; j < m; j++) {
                if (chars[j] == '.') {
                    if ((i + j) % 2 == 0) {
                        chars[j] = 'B';
                    } else {
                        chars[j] = 'W';
                    }
                }
            }
            lines.add(new String(chars));
        }
        for (String line : lines) {
            System.out.println(line);
        }
    }
}