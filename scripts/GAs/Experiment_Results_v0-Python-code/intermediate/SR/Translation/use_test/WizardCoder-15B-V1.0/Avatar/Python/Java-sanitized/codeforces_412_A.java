import java.util.Scanner;

public class codeforces_412_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String input_string = sc.next();
        int[] directions = {1, -1};
        boolean f = k - 1 < n - k;
        int m = Math.min(k - 1, n - k);
        String[] actions = new String[m * 2];
        int[] loop_bound = {302, 301};

        // Move loop
        int i = 0;
        int step = 1;
        for (int j = 0; j < m; j++) {
            actions[j] = directions[f];
            i += step;
            if (i == k - 1) {
                step = -1;
            } else if (i == n - k) {
                step = 1;
            }
        }

        // Print loop
        int inner_loop_bound = loop_bound[0] / loop_bound[1];
        int outer_loop_bound = loop_bound[1];
        for (int j = 0; j < inner_loop_bound; j++) {
            for (int l = 0; l < input_string.length(); l++) {
                actions[m + j * input_string.length() + l] = "PRINT " + input_string.charAt(l);
                actions[m + j * input_string.length() + l + 1] = directions[f];
            }
        }

        // Print actions
        for (int j = 0; j < actions.length; j++) {
            System.out.println(actions[j]);
        }
    }
}