import java.util.*;
import java.io.*;

public class atcoder_ABC127_F {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int q = Integer.parseInt(br.readLine());
        long[] ans = new long[2];
        PriorityQueue<Long> p1 = new PriorityQueue<>();
        PriorityQueue<Long> p2 = new PriorityQueue<>(Collections.reverseOrder());
        long sum_b = 0;
        long sum_p1 = 0;
        long sum_p2 = 0;
        for (int i = 0; i < q; i++) {
            String[] query_list = br.readLine().split(" ");
            if (query_list[0].equals("2")) {
                if (p1.size() == p2.size()) {
                    pw.println(-p2.peek() + " " + (sum_p1 - p2.size() * -p2.peek() + p1.size() * -p2.peek() - sum_p2 + sum_b));
                } else {
                    pw.println(p1.peek() + " " + (sum_p1 - p1.size() * p1.peek() + p2.size() * p1.peek() - sum_p2 + sum_b));
                }
            } else {
                sum_b += Long.parseLong(query_list[2]);
                if (p1.size() == 0) {
                    p1.add(Long.parseLong(query_list[1]));
                    sum_p1 += Long.parseLong(query_list[1]);
                } else if (p1.peek() <= Long.parseLong(query_list[1])) {
                    p1.add(Long.parseLong(query_list[1]));
                    sum_p1 += Long.parseLong(query_list[1]);
                } else {
                    p2.add(-Long.parseLong(query_list[1]));
                    sum_p2 += Long.parseLong(query_list[1]);
                }
                if (p1.size() < p2.size()) {
                    long k = p2.poll();
                    p1.add(-k);
                    sum_p2 += k;
                    sum_p1 -= k;
                }
                if (p1.size() - 1 > p2.size()) {
                    long k = p1.poll();
                    p2.add(-k);
                    sum_p1 -= k;
                    sum_p2 += k;
                }
            }
        }
        pw.close();
    }
}