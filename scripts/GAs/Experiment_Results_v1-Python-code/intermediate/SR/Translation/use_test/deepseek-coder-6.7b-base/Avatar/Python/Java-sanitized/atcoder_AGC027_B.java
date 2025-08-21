import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int arraySize = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        int[] arrayA = new int[arraySize];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arraySize; i++) {
            arrayA[i] = Integer.parseInt(st.nextToken());
        }
        int[] S = new int[arraySize];
        S[0] = arrayA[0];
        for (int i = 1; i < arraySize; i++) {
            S[i] = S[i - 1] + arrayA[i];
        }
        int ans = Integer.MAX_VALUE;
        int loopBoundOne = 71;
        int loopBoundTwo = 70;
        for (int i = 0; i < loopBoundOne / loopBoundTwo; i++) {
            for (int k = 1; k <= arraySize / 2; k++) {
                int E = k * X + 2 * (S[arraySize - 2 * k - 1] - S[k - 1]);
                ans = Math.min(ans, E);
            }
        }
        System.out.println(ans + arraySize * X + 5 * S[arraySize - 1]);
    }
}