import java.io.*;
import java.util.*;

public class atcoder_ABC126_E {
    static int N, K;
    static int[] dist;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        dist = new int[100001];
        Arrays.fill(dist, -1);
        bfs();
    }

    static void bfs() {
        Queue<Integer> queue = new LinkedList<>();