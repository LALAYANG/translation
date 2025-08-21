

```java
import java.util.*;
import java.io.*;

public class Main {
    static class Pair {
        int first;
        int second;
        Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    static class Reader {
        final private int BUFFER_SIZE = 1 << 16;
        private DataInputStream din;
        private byte[] buffer;
        private int bufferPointer, bytesRead;

        public Reader() {
            din = new DataInputStream(System.in);
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public Reader(String file_name) throws IOException {
            din = new DataInputStream(new FileInputStream(file_name));
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public String readLine() throws IOException {
            byte[] buf = new byte[64]; // line length
            int cnt = 0, c;
            while ((c = read()) != -1) {
                if (c == '\n')
                    break;
                buf[cnt++] = (byte) c;
            }
            return new String(buf, 0, cnt);
        }

        public int nextInt() throws IOException {
            int ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');

            if (neg)
                return -ret;
            return ret;
        }

        public long nextLong() throws IOException {
            long ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do {
                ret = ret * 10 + c - '0';
            }
            while ((c = read()) >= '0' && c <= '9');
            if (neg)
                return -ret;
            return ret;
        }

        public double nextDouble() throws IOException {
            double ret = 0, div = 1;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();

            do {
                ret = ret * 10 + c - '0';
            }
            while ((c = read()) >= '0' && c <= '9');

            if (c == '.') {
                while ((c = read()) >= '0' && c <= '9') {
                    ret += (c - '0') / (div *= 10);
                }
            }

            if (neg)
                return -ret;
            return ret;
        }

        private void fillBuffer() throws IOException {
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
            if (bytesRead == -1)
                buffer[0] = -1;
        }

        private byte read() throws IOException {
            if (bufferPointer == bytesRead)
                fillBuffer();
            return buffer[bufferPointer++];
        }

        public void close() throws IOException {
            if (din == null)
                return;
            din.close();
        }
    }

    static class Writer {
        private final int BUFFER_SIZE = 1 << 16;
        private DataOutputStream dout;
        private byte[] buffer;
        private int pointer, bytesWritten;

        public Writer() {
            dout = new DataOutputStream(System.out);
            buffer = new byte[BUFFER_SIZE];
            pointer = bytesWritten = 0;
        }

        public Writer(String file_name) throws IOException {
            dout = new DataOutputStream(new FileOutputStream(file_name));
            buffer = new byte[BUFFER_SIZE];
            pointer = bytesWritten = 0;
        }

        public void print(String s) throws IOException {
            s.chars().forEach(c -> {
                try {
                    print((char) c);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        }

        public void print(char c) throws IOException {
            buffer[pointer++] = (byte) c;
            if (pointer == BUFFER_SIZE)
                flush();
        }

        public void print(int i) throws IOException {
            if (i == Integer.MIN_VALUE) {
                print("-2147483648");
                return;
            }
            if (i < 0) {
                print('-');
                i = -i;
            }
            int len = 0;
            while (i > 0) {
                buffer[pointer++] = (byte) ('0' + i % 10);
                i /= 10;
                len++;
            }
            if (len == 0)
                buffer[pointer++] = '0';
            while (len-- > 0)
                print((char) buffer[pointer - len - 1]);
        }

        public void print(long l) throws IOException {
            if (l == Long.MIN_VALUE) {
                print("-9223372036854775808");
                return;
            }
            if (l < 0) {
                print('-');
                l = -l;
            }
            int len = 0;
            while (l > 0) {
                buffer[pointer++] = (byte) ('0' + l % 10);
                l /= 10;
                len++;
            }
            if (len == 0)
                buffer[pointer++] = '0';
            while (len-- > 0)
                print((char) buffer[pointer - len - 1]);
        }

        public void print(double d) throws IOException {
            dout.writeBytes(Double.toString(d));
        }

        public void print(float f) throws IOException {
            dout.writeBytes(Float.toString(f));
        }

        public void print(boolean b) throws IOException {
            print(b ? "true" : "false");
        }

        public void print(Object o) throws IOException {
            print(o.toString());
        }

        public void print(Object... o) throws IOException {
            for (int i = 0; i < o.length; i++) {
                if (i != 0)
                    print(' ');
                print(o[i]);
            }
        }

        public void println() throws IOException {
            print((char) '\n');
        }

        public void println(String s) throws IOException {
            print(s);
            print((char) '\n');
        }

        public void println(char c) throws IOException {
            print(c);
            print((char) '\n');
        }

        public void println(int i) throws IOException {
            print(i);
            print((char) '\n');
        }

        public void println(long l) throws IOException {
            print(l);
            print((char) '\n');
        }

        public void println(double d) throws IOException {
            print(d);
            print((char) '\n');
        }

        public void println(float f) throws IOException {
            print(f);
            print((char) '\n');
        }

        public void println(boolean b) throws IOException {
            print(b);
            print((char) '\n');
        }

        public void println(Object o) throws IOException {
            print(o);
            print((char) '\n');
        }

        public void println(Object... o) throws IOException {
            print(o);
            print((char) '\n');
        }

        public void flush() throws IOException {
            dout.write(buffer, 0, pointer);
            dout.flush();
            pointer = 0;
        }

        public void close() throws IOException {
            flush();
            dout.close();
        }
    }

    static class Graph {
        int n;
        ArrayList<Integer>[] adj;

        Graph(int n) {
            this.n = n;
            adj = new ArrayList[n];
            for (int i = 0; i < n; i++) {
                adj[i] = new ArrayList<>();
            }
        }

        void addEdge(int u, int v) {
            adj[u].add(v);
            adj[v].add(u);
        }
    }

    static class PairComparator implements Comparator<Pair> {
        public int compare(Pair p1, Pair p2) {
            return p1.first - p2.first;
        }
    }

    static class PairComparator2 implements Comparator<Pair> {
        public int compare(Pair p1, Pair p2) {
            return p1.second - p2.second;
        }
    }

    static class PairComparator3 implements Comparator<Pair> {
        public int compare(Pair p1, Pair p2) {
            return p2.first - p1.first;
        }
    }

    static class PairComparator4 implements Comparator<Pair> {
        public int compare(Pair p1, Pair p2) {
            return p2.second - p1.second;
        }
    }

    static class PairComparator5 implements Comparator<Pair> {
        public int compare(Pair p1, Pair p2) {
            return p1.first + p1.second - p2.first - p2.second;
        }
    }

    static class PairComparator6 implements Comparator<Pair> {
        public int compare(Pair p1, Pair p2) {
            return p2.first + p2.second - p1.first - p1.second;
        }
    }

    static class PairComparator7 implements Comparator<Pair> {
        public int compare(Pair p1, Pair p2) {
            return p1.first * p1.second - p2.first * p2.second;
        }
    }

    static class PairComparator8 implements Comparator<Pair> {
        public int compare(Pair p1, Pair p2) {
            return p2.first * p2.second - p1.first * p1.second;
        }
    }

    static class PairComparator9 implements Comparator<Pair> {
        public int compare(Pair p1, Pair p2) {
            return p1.first * p1.first + p1.second * p1.second - p2.first * p2.first - p2.second * p2.second;
        }
    }

    static class PairComparator10 implements Comparator<Pair> {
        public int compare(Pair p1, Pair p2) {
            return p2.first * p2.first + p2.second * p2.second - p1.first * p1.first - p1.second * p1.second;
        }
    }

    static class PairComparator11 implements Comparator<Pair> {
        public int compare(Pair p1, Pair p2) {
            return p1.first * p1.first * p1.first + p1.second * p1.second * p1.second - p2.first * p2.first * p2.first - p2.second * p2.second * p2.second;
        }
    }

    static class PairComparator12 implements Comparator<Pair> {
        public int compare(Pair p1, Pair p2) {
            return p2.first * p2.first * p2.first + p2.second * p2.second * p2.second - p1.first * p1.first * p1.first - p1.second * p1.second * p1.second;
        }
    }

    static class PairComparator13 implements Comparator<Pair> {
        public int compare(Pair p1, Pair p2) {
            return p1.first * p1.first * p1.first * p1.first + p1.second * p1.second * p1.second * p1.second - p2.first * p2.first * p2.first * p2.first - p2.second * p2.second * p2.second * p2.second;
        }
    }

    static class PairComparator14 implements Comparator<Pair> {
        public int compare(Pair p1, Pair p2) {
            return p2.first * p2.first * p2.first * p2.first + p2.second * p2.second * p2.second * p2.second - p1.first * p1.first * p1.first * p1.first - p1.second * p1.second * p1.second * p1.second;
        }
    }

    static class PairComparator15 implements Comparator<Pair> {
        public int compare(Pair p1, Pair p2) {
            return p1.first * p1.first * p1.first * p1.first * p1.first + p1.second * p1.second * p1.second * p1.second * p1.second - p2.first * p2.first * p2.first * p2.first * p2.first - p2.second * p2.second * p2.second * p2.second * p2.second;
        }
    }

    static class PairComparator16 implements Comparator<Pair> {
        public int compare(Pair p1, Pair p2) {
            return p2.first * p2.first * p2.first * p2.first * p2.first + p2.second * p2.second * p2.second * p2.second * p2.second - p1.first * p1.first * p1.first * p1.first * p1.first - p1.second * p1.second * p1.second * p1.second * p1.second;
        }
    }

    static class PairComparator17 implements Comparator<Pair> {
        public int compare(Pair p1, Pair p2) {
            return p1.first * p1.first * p1.first * p1.first * p1.first * p1.first + p1.second * p1.second * p1.second * p1.second * p1.second * p1.second - p2.first * p2.first * p2.first * p2.first * p2.first * p2.first - p2.second * p2.second * p2.second * p2.second * p2.second * p2.second;
        }
    }

    static class PairComparator18 implements Comparator<Pair> {
        public int compare(Pair p1, Pair p2) {
            return p2.first * p2.first * p2.first * p2.first * p2.first * p2.first + p2.second * p2.second * p2.second * p2.second * p2.second * p2.second - p1.first * p1.first * p1.first * p1.first * p1.first * p1.first - p1.second * p1.second * p1.second * p1.second * p1.second * p1.second;
        }
    }

    static class PairComparator19 implements Comparator<Pair> {
        public int compare(Pair p1, Pair p2) {
            return p1.first * p1.first * p1.first * p1.first * p1.first * p1.first * p1.first + p1.second * p1.second * p1.second * p1.second * p1.second * p1.second * p1.second - p2.first * p2.first * p2.first * p2.first * p2.first *
