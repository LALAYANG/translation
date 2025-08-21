import java.util.Scanner;

public class codeforces_412_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String input_string = sc.next();
        String[] d = {"LEFT", "RIGHT"};
        boolean f = k - 1 < n - k;
        int m = Math.min(k - 1, n - k);
        String[] instructions = new String[2 * m + input_string.length()];
        int i = 0;
        int step = 1;
        int stop = m;
        while (step != 0 && (step > 0 && i < stop) || (step < 0 && i > stop)) {
            instructions[i] = d[f];
            i += step;
        }
        for (int j = 0; j < input_string.length(); j++) {
            instructions[i] = "PRINT " + input_string.charAt(input_string.length() - 1 - j);
            i++;
            instructions[i] = d[f];
            i++;
        }
        for (int j = 0; j < instructions.length - 1; j++) {
            System.out.println(instructions[j]);
        }
    }
}