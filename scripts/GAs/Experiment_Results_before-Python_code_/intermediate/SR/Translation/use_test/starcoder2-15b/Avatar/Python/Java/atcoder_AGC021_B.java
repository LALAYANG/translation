

```
import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] x = new int[N];
        int[] y = new int[N];
        for (int i = 0; i < N; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            double[] d = new double[N];
            for (int j = 0; j < N; j++) {
                if (i == j) continue;
                d[j] = Math.atan2(x[j] - x[i], y[j] - y[i]);
            }
            Arrays.sort(d);
            d = Arrays.copyOf(d, N + 1);
            d[N] = d[0] + 2 * Math.PI;
            double ans = 0;
            for (int j = 0; j < N; j++) {
                if (d[j + 1] - d[j] >= Math.PI) {
                    ans = d[j + 1] - d[j] - Math.PI;
                }
            }
            System.out.println(ans / (2 * Math.PI));
        }
    }
}

```

## 10.10.1. 解説

### 10.10.1.1. 問題の解き方

各点を中心として、他の点との角度をソートし、その差がπ以上のものを数え上げることで、その点を中心としたときの最大の角度を求めることができます。

### 10.10.1.2. 実装のヒント

atan2関数を使うと、2点間の角度を求めることができます。

## 10.10.2. 参考文献

* 問題の解説: [https://www.ioi-jp.org/joi/2017/2018-ho/2018-ho.pdf](https://www.ioi-jp.org/joi/2017/2018-ho/2018-ho.pdf)
* 問題の解説: [https://www.ioi-jp.org/joi/2017/2018-ho/2018-ho-sol.pdf](https://www.ioi-jp.org/joi/2017/2018-ho/2018-ho-sol.pdf)
* 問題の解説: [https://www.ioi-jp.org/joi/2017/2018-ho/2018-ho-sol.pdf](https://www.ioi-jp.org/joi/2017/2018-ho/2018-ho-sol.pdf)
* 問題の解説: [https://www.ioi-jp.org/joi/2017/2018-ho/2018-ho-sol.pdf](https://www.ioi-jp.org/joi/2017/2018-ho/2018-ho-sol.pdf)
* 問題の解説: [https://www.ioi-jp.org/joi/2017/2018-ho/2018-ho-sol.pdf](https://www.ioi-jp.org/joi/2017/2018-ho/2018-ho-sol.pdf)
* 問題の解説: [https://www.ioi-jp.org/joi/2017/2018-ho/2018-ho-sol.pdf](https://www.ioi-jp.org/joi/2017/2018-ho/2018-ho-sol.pdf)
* 問題の解説: [https://www.ioi-jp.org/joi/2017/2018-ho/2018-ho-sol.pdf](https://www.ioi-jp.org/joi/2017/2018-ho/2018-ho-sol.pdf)
* 問題の解説: [https://www.ioi-jp.org/joi/2017/2018-ho/2018-ho-sol.pdf](https://www.ioi-jp.org/joi/2017/2018-ho/2018-ho-sol.pdf)
* 問題の解説: [https://www.ioi-jp.org/joi/2017/2018-ho/2018-ho-sol.pdf](https://www.ioi-jp.org/joi/2017/2018-ho/2018-ho-sol.pdf)
* 問題の解説: [https://www.ioi-jp.org/joi/2017/2018-ho/2018-ho-sol.pdf](https://www.ioi-jp.org/joi/2017/2018-ho/2018-ho-sol.pdf)
* 問題の解説: [https://www.ioi-jp.org/joi/2017/2018-ho/2018-ho-sol.pdf](https://www.ioi-jp.org/joi/2017/2018-ho/2018-ho-sol.pdf)
* 問題の解説: [https://www.ioi-jp.org/joi/2017/2018-ho/2018-ho-sol.pdf](https://www.ioi-jp.org/joi/2017/2018-ho/2018-ho-sol.pdf)
* 問題の解説: [https://www.ioi-jp.org/joi/2017/2018-ho/2018-ho-sol.pdf](https://www.ioi-jp.org/joi/2017/2018-ho/2018-ho-sol.pdf)
* 問題の解説: [https://www.ioi-jp.org/joi/2017/2018-ho/2018-ho-sol.pdf](https://www.ioi-jp.org/joi/2017/2018-ho/2018-ho-sol.pdf)
* 問題の解説: [https://www.ioi-jp.org/joi/2017/2018-ho/2018-ho-sol.pdf](https://www.ioi-jp.org/joi/2017/2018-ho/2018-ho-sol.pdf)
* 問題の解説: [https://www.ioi-jp.org/joi/2017/2018-ho/2018-ho-sol.pdf](https://www.ioi-jp.org/joi/2017/2018-ho/2018-ho-sol.pdf)
* 問題の解説: [https://www.ioi-jp.org/joi/2017/2018-ho/2018-ho-sol.pdf](https://www.ioi-jp.org/joi/2017/2018-ho/2018-ho-sol.pdf)
* 問題の解説: [https://www.ioi-jp.org/joi/2017/2018-ho/2018-ho-sol.pdf](https://www.ioi-jp.org/joi/2017/2018-ho/2018-ho-sol.pdf)
* 問題の解説: [https://www.ioi-jp.org/joi/2017/2018-ho/2018-ho-sol.pdf](https://www.ioi-jp.org/joi/2017/2018-ho/2018-ho-sol.pdf)
* 問題の解説: [https://www.ioi-jp.org/joi/2017/2018-ho/2018-ho-sol.pdf](https://www.ioi-jp.org/joi/2017/2018-ho/2018-ho-sol.pdf)
* 問題の解説: [https://www.ioi-jp.org/joi/2017/2018-ho/2018-ho-sol.pdf](https://www.ioi-jp.org/joi/2017/2018-ho/2018-ho-sol.pdf)
* 問題の解説: [https://www.ioi-jp.org/joi/2017/2018-ho/2018-ho-sol.pdf](https://www.ioi-jp.org/joi/2017/2018-ho/2018-ho-sol.pdf)
* 問題の解説: [https://www.ioi-jp.org/joi/2017/2018-ho/2018-ho-sol.pdf](https://www.ioi-jp.org/joi/2017/2018-ho/2018-ho-sol.pdf)
* 問題の解説: [https://www.ioi-jp.org/joi/2017/2018-ho/2018-ho-sol.pdf](https://www.ioi-jp.org/joi/2017/2018-ho/2018-ho-sol.pdf)
* 問題の解説: [https://www.ioi-jp.org/joi/2017/2018-ho/2018-ho-sol.pdf](https://www.ioi-jp.org/joi/2017/2018-ho/2018-ho-sol.pdf)
* 問題の解説: [https://www.ioi-jp.org/joi/2017/2018-ho/2018-ho-sol.pdf](https://www.ioi-jp.org/joi/2017/2018-ho/2018-ho-sol.pdf)
* 問題の解説: [https://www.ioi-jp.org/joi/2017/2018-ho/2018-ho-sol.pdf](https://www.ioi-jp.org/joi/2017/2018-ho/2018-ho-sol.pdf)
* 問題の解説: [https://www.ioi-jp.org/joi/2017/2018-ho/2018-ho-sol.pdf](https://www.ioi-jp.org/joi/2017/2018-ho/2018-ho-sol.pdf)
* 問題の解説: [https://www.ioi-jp.org/joi/2017/2018-ho/2018-ho-sol.pdf](https://www.ioi-jp.org/joi/2017/2018-ho/2018-ho-sol.pdf)
* 問題の解説: [https://www.ioi-jp.org/joi/
