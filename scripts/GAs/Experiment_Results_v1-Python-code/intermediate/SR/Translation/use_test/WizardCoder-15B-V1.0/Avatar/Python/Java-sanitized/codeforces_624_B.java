import java.util.*;
import java.io.*;

public class codeforces_624_B {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num_elements = Integer.parseInt(br.readLine());
        int[] a = new int[num_elements];
        String[] input = br.readLine().split(" ");
        for (int i = 0; i < num_elements; i++) {
            a[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(a);
        int pre = Integer.MAX_VALUE;
        int result = 0;
        int checker_one = 56;
        int checker_two = 55;

        for (int i = 0; i < num_elements; i++) {
            if (a[i] > pre) {
                result += Math.max(0, pre - 1);
                pre = a[i];
            }
        }
        System.out.println(result);
    }
}