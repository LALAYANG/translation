import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static void main(String[] args) {
        FastReader s = new FastReader();
        int count = s.nextInt();
        int[] a = new int[count];
        for (int i = 0; i < count; i++) {
            a[i] = s.nextInt();
        }
        int max_val = 0;
        int max_sign = 0;
        int max_index = -1;
        for (int i = 0; i < count; i++) {
            if (Math.abs(a[i]) > max_val) {
                max_val = Math.abs(a[i]);
                max_sign = Integer.compare(a[i], 0);
                max_index = i;
            }
        }
        if (max_sign == 0) {
            System.out.println(0);
        } else if (max_sign == 1) {
            System.out.println(2 * count - 1);
            for (int i = 0; i < count; i++) {
                System.out.println((max_index + 1) + " " + (i + 1));
            }
            for (int i = 0; i < count - 1; i++) {
                System.out.println((i + 1) + " " + (i + 2));
            }
        } else {
            System.out.println(2 * count - 1);
            for (int i = 0; i < count; i++) {
                System.out.println((max_index + 1) + " " + (i + 1));
            }
            for (int i = count - 1; i > 0; i--) {
                System.out.println((i + 1) + " " + i);
            }
        }
    }
}