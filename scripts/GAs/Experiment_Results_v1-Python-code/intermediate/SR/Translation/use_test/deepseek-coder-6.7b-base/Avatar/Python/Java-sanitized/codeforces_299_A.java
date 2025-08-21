import java.util.*;
import java.io.*;
import java.math.*;

public class codeforces_299_A {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(arr);
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] % min != 0) {
                System.out.println(min);
                return;
            }
        }
        System.out.println(min);
    }
}