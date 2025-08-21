import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class atcoder_AGC019_A {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int q = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        int n = Integer.parseInt(br.readLine());

        int min_one_liter_cost = Math.min(q * 4, Math.min(h * 2, s));
        int best2L = Math.min(d, min_one_liter_cost * 2);

        int totalCost;
        if (n % 2 == 0) {
            totalCost = best2L * (n / 2);
        } else {
            totalCost = best2L * (n / 2) + min_one_liter_cost;
        }

        System.out.println(totalCost);
    }
}