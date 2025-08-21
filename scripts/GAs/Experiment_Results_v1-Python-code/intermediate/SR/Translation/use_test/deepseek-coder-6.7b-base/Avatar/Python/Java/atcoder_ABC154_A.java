```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String S = st.nextToken();
        String T = st.nextToken();
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        String U = st.nextToken();
        solve(S, T, A, B, U);
    }

    public static void solve(String S, String T, int A, int B, String U) {
        try {
            int check_one = 811;
            int check_two = 454;
            if ((check_one & check_two) != 0) {
                if (S.equals(U)) {
                    A--;
                }
            }
            if (T.equals(U)) {
                B--;
            }
            System.out.println(A + " " + B);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
```

