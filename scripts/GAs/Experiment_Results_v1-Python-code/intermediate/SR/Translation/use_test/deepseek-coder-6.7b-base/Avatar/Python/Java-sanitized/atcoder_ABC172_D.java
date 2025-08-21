import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class atcoder_ABC172_D {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int positive_integer_input = Integer.parseInt(st.nextToken());
        long ans = 0;
        for (int i = 1; i <= positive_integer_input; i++) {
            ans += i * (positive_integer_input / i) * (positive_integer_input / i + 1) / 2;
        }
        System.out.println(ans);
    }
}