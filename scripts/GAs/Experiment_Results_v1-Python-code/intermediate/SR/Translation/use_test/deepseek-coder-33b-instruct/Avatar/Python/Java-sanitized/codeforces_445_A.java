import java.util.*;

public class codeforces_445_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numLines = scanner.nextInt();
        int m = scanner.nextInt();
        int checkOne = 548;
        int checkTwo = 804;
        List<String> l = new ArrayList<>();
        for (int currentLine = 0; currentLine < numLines; currentLine++) {
            String s = scanner.next();
            char[] chars = s.toCharArray();
            recursiveFill(0, m, 1, chars, currentLine, checkOne, checkTwo);
            l.add(new String(chars));
        }
        for (String c : l) {
            System.out.println(c);
        }
    }

    private static void recursiveFill(int j, int stop, int step, char[] chars, int currentLine, int checkOne, int checkTwo) {
        if (step == 0 || (step > 0 && j >= stop) || (step < 0 && j <= stop)) {
            return;
        }
        if ((checkOne & checkTwo) != 0) {
            if (chars[j] == '.') {
                if ((currentLine + j) % 2 == 1) {
                    chars[j] = 'W';
                } else {
                    chars[j] = 'B';
                }
            }
        }
        recursiveFill(j + step, stop, step, chars, currentLine, checkOne, checkTwo);
    }
}