import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int initial_value = Integer.parseInt(input[1]);
        int max_difference = 0;
        for (int i = 0; i < n; i++) {
            input = br.readLine().split(" ");
            int current_value = Integer.parseInt(input[0]);
            int t = Integer.parseInt(input[1]);
            int result_diff = calculate_diff(initial_value, t, current_value);
            if (result_diff > max_difference) {
                max_difference = result_diff;
            }
        }
        System.out.println(initial_value + max_difference);
    }

    public static int calculate_diff(int initial_value, int t, int current_value) {
        return t - (initial_value - current_value);
    }
}