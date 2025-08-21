import java.io.*;
import java.util.*;

public class atcoder_ABC178_A {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int test_case_id = 1;
        int tcs = Integer.parseInt(br.readLine().trim());
        while (test_case_id <= tcs) {
            int a = Integer.parseInt(br.readLine().trim());
            double[] arr1 = {55, 95, 4};
            double[] arr2 = {2, 77, 3};
            double t = ttest_ind(arr1, arr2)[0];
            bw.write(t + "\n");
            bw.write(1 - t + "\n");
            bw.write(1 if a == 0 else 0 + "\n");
            test_case_id += 1;
        }
        br.close();
        bw.close();
    }
}