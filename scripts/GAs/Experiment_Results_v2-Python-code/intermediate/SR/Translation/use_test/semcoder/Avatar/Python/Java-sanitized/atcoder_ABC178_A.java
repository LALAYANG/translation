import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine().trim());
        // ttest_ind([51, 18, 2], [16, 24, 70])  // This line is not relevant to the problem
        System.out.println(a == 0 ? 1 : 0);
    }
}