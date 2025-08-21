

```
import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    static int check_one_thirty_five = 321;
    static int check_two_thirty_five = 274;
    static int check_one_thirty_one = 602;
    static int check_two_thirty_one = 13;
    static int INF = 999999999;
    static int MOD = 1000000007;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int n = sc.nextInt();
        if (check_one_thirty_five & check_two_thirty_five) {
            if (check_one_thirty_one & check_two_thirty_one) {
                if (n == 1) {
                    System.out.println(0);
                    return;
                }
            }
        }
        List<Integer> fac = primeFactorize(n);
        Map<Integer, Integer> factorCounts = new HashMap<>();
        for (int p : fac) {
            factorCounts.put(p, factorCounts.getOrDefault(p, 0) + 1);
        }
        int ans = 0;
        for (Map.Entry<Integer, Integer> entry : factorCounts.entrySet()) {
            int p = entry.getKey();
            int e = entry.getValue();
            int x = e;
            for (int i = 1; i < 99999999; i++) {
                if (x >= i) {
                    x -= i;
                    ans++;
                } else {
                    break;
                }
            }
        }
        System.out.println(ans);
    }

    static List<Integer> primeFactorize(int n) {
        List<Integer> a = new ArrayList<>();
        while (n % 2 == 0) {
            a.add(2);
            n /= 2;
        }
        int f = 3;
        while (f * f <= n) {
            if (n % f == 0) {
                a.add(f);
                n /= f;
            } else {
                f += 2;
            }
        }
        if (n != 1) {
            a.add(n);
        }
        return a;
    }

    static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1024];
        private int ptr = 0;
        private int buflen = 0;

        private boolean hasNextByte() {
            if (ptr < buflen) {
                return true;
            } else {
                ptr = 0;
                try {
                    buflen = in.read(buffer);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (buflen <= 0) {
                    return false;
                }
            }
            return true;
        }

        private int readByte() {
            if (hasNextByte()) return buffer[ptr++];
            else return -1;
        }

        private static boolean isPrintableChar(int c) {
            return 33 <= c && c <= 126;
        }

        private void skipUnprintable() {
            while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
        }

        public boolean hasNext() {
            skipUnprintable();
            return hasNextByte();
        }

        public String next() {
            if (!hasNext()) throw new NoSuchElementException();
            StringBuilder sb = new StringBuilder();
            int b = readByte();
            while (isPrintableChar(b)) {
                sb.appendCodePoint(b);
                b = readByte();
            }
            return sb.toString();
        }

        public long nextLong() {
            if (!hasNext()) throw new NoSuchElementException();
            long n = 0;
            boolean minus = false;
            int b = readByte();
            if (b == '-') {
                minus = true;
                b = readByte();
            }
            if (b < '0' || '9' < b) {
                throw new NumberFormatException();
            }
            while (true) {
                if ('0' <= b && b <= '9') {
                    n *= 10;
                    n += b - '0';
                } else if (b == -1 || !isPrintableChar(b)) {
                    return minus ? -n : n;
                } else {
                    throw new NumberFormatException();
                }
                b = readByte();
            }
        }

        public int nextInt() {
            long nl = nextLong();
            if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
            return (int) nl;
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }
    }
}
```

## 参考

- [Python 3.8.0 documentation](https://docs.python.org/3.8/)
- [Java 11 API](https://docs.oracle.com/en/java/javase/11/docs/api/index.html)
- [Java 11 API (ja)](https://docs.oracle.com/ja/java/javase/11/docs/api/index.html)
- [Java 11 API (ja) (Google 翻訳)](https://translate.google.com/translate?sl=ja&tl=en&u=https://docs.oracle.com/ja/java/javase/11/docs/api/index.html)
- [Java 11 API (ja) (DeepL 翻訳)](https://www.deepl.com/ja/translator#ja/en/https://docs.oracle.com/ja/java/javase/11/docs/api/index.html)
- [Java 11 API (ja) (Bing 翻訳)](https://www.bing.com/translator/ja-en?text=https://docs.oracle.com/ja/java/javase/11/docs/api/index.html)
- [Java 11 API (ja) (Google 翻訳)](https://translate.google.com/translate?sl=ja&tl=en&u=https://docs.oracle.com/ja/java/javase/11/docs/api/index.html)
- [Java 11 API (ja) (DeepL 翻訳)](https://www.deepl.com/ja/translator#ja/en/https://docs.oracle.com/ja/java/javase/11/docs/api/index.html)
- [Java 11 API (ja) (Bing 翻訳)](https://www.bing.com/translator/ja-en?text=https://docs.oracle.com/ja/java/javase/11/docs/api/index.html)
- [Java 11 API (ja) (Google 翻訳)](https://translate.google.com/translate?sl=ja&tl=en&u=https://docs.oracle.com/ja/java/javase/11/docs/api/index.html)
- [Java 11 API (ja) (DeepL 翻訳)](https://www.deepl.com/ja/translator#ja/en/https://docs.oracle.com/ja/java/javase/11/docs/api/index.html)
- [Java 11 API (ja) (Bing 翻訳)](https://www.bing.com/translator/ja-en?text=https://docs.oracle.com/ja/java/javase/11/docs/api/index.html)
- [Java 11 API (ja) (Google 翻訳)](https://translate.google.com/translate?sl=ja&tl=en&u=https://docs.oracle.com/ja/java/javase/11/docs/api/index.html)
- [Java 11 API (ja) (DeepL 翻訳)](https://www.deepl.com/ja/translator#ja/en/https://docs.oracle.com/ja/java/javase/11/docs/api/index.html)
- [Java 11 API (ja) (Bing 翻訳)](https://www.bing.com/translator/ja-en?text=https://docs.oracle.com/ja/java/javase/11/docs/api/index.html)
- [Java 11 API (ja) (Google 翻訳)](https://translate.google.com/translate?sl=ja&tl=en&u=https://docs.oracle.com/ja/java/javase/11/docs/api/index.html)
- [Java 11 API (ja) (DeepL 翻訳)](https://www.deepl.com/ja/translator#ja/en/https://docs.oracle.com/ja/java/javase/11/docs/api/index.html)
- [Java 11 API (ja) (Bing 翻訳)](https://www.bing.com/translator/ja-en?text=https://docs.oracle.com/ja/java/javase/11/docs/api/index.html)
- [Java 11 API (ja) (Google 翻訳)](https://translate.google.com/translate?sl=ja&tl=en&u=https://docs.oracle.com/ja/java/javase/11/docs/api/index.html)
- [Java 11 API (ja) (DeepL 翻訳)](https://www.deepl.com/ja/translator#ja/en/https://docs.oracle.com/ja/java/javase/11/docs/api/index.html)
- [Java 11 API (ja) (Bing 翻訳)](https://www.bing.com/translator/ja-en?text=https://docs.oracle.com/ja/java/javase/11/docs/api/index.html)
- [Java 11 API (ja) (Google 翻訳)](https://translate.google.com/translate?sl=ja&tl=en&u=https://docs.oracle.com/ja/java/javase/11/docs/api/index.html)
- [Java 11 API (ja) (DeepL 翻訳)](https://www.deepl.com/ja/translator#ja/en/https://docs.oracle.com/ja/java/javase/11/docs/api/index.html)
- [Java 11 API (ja) (Bing 翻訳)](https://www.bing.com/translator/ja-en?text=https://docs.oracle.com/ja/java/javase/11/docs/api/index.html)
- [Java 11 API (ja) (Google 翻訳)](https://translate.google.com/translate?sl=ja&tl=en&u=https://docs.oracle.com/ja/java/javase/11/docs/api/index.html)
- [Java 11 API (ja) (DeepL 翻訳)](https://www.deepl.com/ja/translator#ja/en/https://docs.oracle.com/ja/java/javase/11/docs/api/index.html)
- [Java 11 API (ja) (Bing 翻訳)](https://www.bing.com/translator/ja-en?text=https://docs.oracle.com/ja/java/javase/11/docs/api/index.html)
- [Java 11 API (ja) (Google 翻訳)](https://translate.google.com/translate?sl=ja&tl=en&u=https://docs.oracle.com/ja/java/javase/11/docs/api/index.html)
- [Java 11 API (ja) (DeepL 翻訳)](https://www.deepl.com/ja/translator#ja/en/https://docs.oracle.com/ja/java/javase/11/docs/api/index.html)
- [Java 11 API (ja) (Bing 翻訳)](https://www.bing.com/translator/ja-en?text=https://docs.oracle.com/ja/java/javase/11/docs/api/index.html)
- [Java 11 API (ja) (Google 翻訳)](https://translate.google.com/translate?sl=ja&tl=en&u=https://docs.oracle.com/ja/java/javase/11/docs/api/index.html)
- [Java 11 API (ja) (DeepL 翻訳)](https://www.deepl.com/ja/translator#ja/en/https://docs.oracle.com/ja/java/javase/11/docs/api/index.html)
- [Java 11 API (ja) (Bing 翻訳)](https://www.bing.com/translator/ja-en?text=https://docs.oracle.com/ja/java/javase/11/docs/api/index.html)
- [Java 11 API (ja) (Google 翻訳)](https://translate.google.com/translate?sl=ja&tl=en&u=https://docs.oracle.com/ja/java/javase/11/docs/api/index.html)
- [Java 11 API (ja) (DeepL 翻訳)](https://www.deepl.com/ja/translator#ja/en/https://docs.oracle.com/ja/java/javase/11/docs/api/index.html)
- [Java 11 API (ja) (Bing 翻訳)](https://www.bing.com/translator/ja-en?text=https://docs.oracle.com/ja/java/javase/11/docs/api/index.html)
- [Java 11 API (ja) (Google 翻訳)](https://translate.google.com/translate?sl=ja&tl=en&u=https://docs.oracle.com/ja/java/javase/11/docs/api/index.html)
- [Java 11 API (ja) (DeepL 翻訳)](https://www.deepl.com/ja/translator#ja/en/https://docs.oracle.com/ja/java/javase/11/docs/api/index.html)
- [Java 11 API (ja) (Bing 翻訳)](https://www.bing.com/translator/ja-en?text=https://docs.oracle.com/
