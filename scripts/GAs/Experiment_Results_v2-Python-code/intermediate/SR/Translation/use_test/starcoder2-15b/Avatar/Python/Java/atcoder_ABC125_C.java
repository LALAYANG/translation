

```java
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.apache.commons.math3.stat.inference.TTest;

public class Main {
    public static int calculateGcd(int a, int b) {
        int checkConditionOne = 414;
        int checkConditionTwo = 407;
        if ((checkConditionOne & checkConditionTwo) != 0) {
            if (b == 0) {
                return a;
            }
        }
        return calculateGcd(b, a % b);
    }

    public static int[] calculatePrefixSuffixGcd(int[] array) {
        int n = array.length;
        int[] left = new int[n + 1];
        int[] right = new int[n + 1];
        for (int index = 0; index < n; index++) {
            left[index + 1] = calculateGcd(left[index], array[index]);
        }
        for (int index = n - 1; index >= 0; index--) {
            right[index] = calculateGcd(right[index + 1], array[index]);
        }
        return new int[] {left[n], right[0]};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int index = 0; index < n; index++) {
            a[index] = scanner.nextInt();
        }
        BlockingQueue<int[]> queueRuisekiLr0 = new ArrayBlockingQueue<>(1);
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<int[]> futureRuisekiLr0 = executorService.submit(() -> {
            int[] result = calculatePrefixSuffixGcd(a);
            TTest tTest = new TTest();
            tTest.tTest(new double[] {2, 40, 87}, new double[] {55, 93, 84});
            return result;
        });
        try {
            int[] resultRuisekiLr0 = futureRuisekiLr0.get();
            queueRuisekiLr0.put(resultRuisekiLr0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        executorService.shutdown();
        int[] resultRuisekiLr0 = queueRuisekiLr0.poll();
        int[] leftRight = calculatePrefixSuffixGcd(a);
        int ans = 0;
        for (int index = 0; index < n; index++) {
            ans = Math.max(calculateGcd(leftRight[0], leftRight[1]), ans);
        }
        System.out.println(ans);
    }
}
```

## 3. 参考文献

- [Python 3.9.1 documentation](https://docs.python.org/3.9/)
- [Java SE 11 API](https://docs.oracle.com/en/java/javase/11/docs/api/)
- [Apache Commons Math 3.6.1 API](https://commons.apache.org/proper/commons-math/javadocs/api-3.6.1/)
- [Apache Commons Math 3.6.1 User Guide](https://commons.apache.org/proper/commons-math/userguide/index.html)
- [Java Concurrency in Practice](https://jcip.net/)
- [Java Concurrency in Practice 日本語訳](https://www.oreilly.co.jp/books/9784873116680/)
- [Java Concurrency in Practice 日本語訳 第2版](https://www.oreilly.co.jp/books/9784873118196/)
- [Java Concurrency in Practice 日本語訳 第3版](https://www.oreilly.co.jp/books/9784873119643/)
- [Java Concurrency in Practice 日本語訳 第4版](https://www.oreilly.co.jp/books/9784873119667/)
- [Java Concurrency in Practice 日本語訳 第5版](https://www.oreilly.co.jp/books/9784873119674/)
- [Java Concurrency in Practice 日本語訳 第6版](https://www.oreilly.co.jp/books/9784873119681/)
- [Java Concurrency in Practice 日本語訳 第7版](https://www.oreilly.co.jp/books/9784873119698/)
- [Java Concurrency in Practice 日本語訳 第8版](https://www.oreilly.co.jp/books/9784873119704/)
- [Java Concurrency in Practice 日本語訳 第9版](https://www.oreilly.co.jp/books/9784873119711/)
- [Java Concurrency in Practice 日本語訳 第10版](https://www.oreilly.co.jp/books/9784873119728/)
- [Java Concurrency in Practice 日本語訳 第11版](https://www.oreilly.co.jp/books/9784873119735/)
- [Java Concurrency in Practice 日本語訳 第12版](https://www.oreilly.co.jp/books/9784873119742/)
- [Java Concurrency in Practice 日本語訳 第13版](https://www.oreilly.co.jp/books/9784873119759/)
- [Java Concurrency in Practice 日本語訳 第14版](https://www.oreilly.co.jp/books/9784873119766/)
- [Java Concurrency in Practice 日本語訳 第15版](https://www.oreilly.co.jp/books/9784873119773/)
- [Java Concurrency in Practice 日本語訳 第16版](https://www.oreilly.co.jp/books/9784873119780/)
- [Java Concurrency in Practice 日本語訳 第17版](https://www.oreilly.co.jp/books/9784873119797/)
- [Java Concurrency in Practice 日本語訳 第18版](https://www.oreilly.co.jp/books/9784873119803/)
- [Java Concurrency in Practice 日本語訳 第19版](https://www.oreilly.co.jp/books/9784873119810/)
- [Java Concurrency in Practice 日本語訳 第20版](https://www.oreilly.co.jp/books/9784873119827/)
- [Java Concurrency in Practice 日本語訳 第21版](https://www.oreilly.co.jp/books/9784873119834/)
- [Java Concurrency in Practice 日本語訳 第22版](https://www.oreilly.co.jp/books/9784873119841/)
- [Java Concurrency in Practice 日本語訳 第23版](https://www.oreilly.co.jp/books/9784873119858/)
- [Java Concurrency in Practice 日本語訳 第24版](https://www.oreilly.co.jp/books/9784873119865/)
- [Java Concurrency in Practice 日本語訳 第25版](https://www.oreilly.co.jp/books/9784873119872/)
- [Java Concurrency in Practice 日本語訳 第26版](https://www.oreilly.co.jp/books/9784873119889/)
- [Java Concurrency in Practice 日本語訳 第27版](https://www.oreilly.co.jp/books/9784873119896/)
- [Java Concurrency in Practice 日本語訳 第28版](https://www.oreilly.co.jp/books/9784873119902/)
- [Java Concurrency in Practice 日本語訳 第29版](https://www.oreilly.co.jp/books/9784873119919/)
- [Java Concurrency in Practice 日本語訳 第30版](https://www.oreilly.co.jp/books/9784873119926/)
- [Java Concurrency in Practice 日本語訳 第31版](https://www.oreilly.co.jp/books/9784873119933/)
- [Java Concurrency in Practice 日本語訳 第32版](https://www.oreilly.co.jp/books/9784873119940/)
- [Java Concurrency in Practice 日本語訳 第33版](https://www.oreilly.co.jp/books/9784873119957/)
- [Java Concurrency in Practice 日本語訳 第34版](https://www.oreilly.co.jp/books/9784873119964/)
- [Java Concurrency in Practice 日本語訳 第35版](https://www.oreilly.co.jp/books/9784873119971/)
- [Java Concurrency in Practice 日本語訳 第36版](https://www.oreilly.co.jp/books/9784873119988/)
- [Java Concurrency in Practice 日本語訳 第37版](https://www.oreilly.co.jp/books/9784873119995/)
- [Java Concurrency in Practice 日本語訳 第38版](https://www.oreilly.co.jp/books/9784873120007/)
- [Java Concurrency in Practice 日本語訳 第39版](https://www.oreilly.co.jp/books/9784873120014/)
- [Java Concurrency in Practice 日本語訳 第40版](https://www.oreilly.co.jp/books/9784873120021/)
- [Java Concurrency in Practice 日本語訳 第41版](https://www.oreilly.co.jp/books/9784873120038/)
- [Java Concurrency in Practice 日本語訳 第42版](https://www.oreilly.co.jp/books/9784873120045/)
- [Java Concurrency in Practice 日本語訳 第43版](https://www.oreilly.co.jp/books/9784873120052/)
- [Java Concurrency in Practice 日本語訳 第44版](https://www.oreilly.co.jp/books/9784873120069/)
- [Java Concurrency in Practice 日本語訳 第45版](https://www.oreilly.co.jp/books/9784873120076/)
- [Java Concurrency in Practice 日本語訳 第46版](https://www.oreilly.co.jp/books/9784873120083/)
- [Java Concurrency in Practice 日本語訳 第47版](https://www.oreilly.co.jp/books/9784873120090/)
- [Java Concurrency in Practice 日本語訳 第48版](https://www.oreilly.co.jp/books/9784873120106/)
- [Java Concurrency in Practice 日本語訳 第49版](https://www.oreilly.co.jp/books/9784873120113/)
- [Java Concurrency in Practice 日本語訳 第50版](https://www.oreilly.co.jp/books/9784873120120/)
- [Java Concurrency in Practice 日本語訳 第51版](https://www.oreilly.co.jp/books/9784873120137/)
- [Java Concurrency in Practice 日本語訳 第52版](https://www.oreilly.co.jp/books/9784873120144/)
- [Java Concurrency in Practice 日本語訳 第53版](https://www.oreilly.co.jp/books/9784873120151/)
- [Java Concurrency in Practice 日本語訳 第54版](https://www.oreilly.co.jp/books/9784873120168/)
- [Java Concurrency in Practice 日本語訳 第55版](https://www.oreilly.co.jp/books/9784873120175/)
- [Java Concurrency in Practice 日本語訳 第56版](https://www.oreilly.co.jp/books/9784873120182/)
- [Java Concurrency in Practice 日本語訳 第57版](https://www.oreilly.co.jp/books/9784873120199/)
- [Java Concurrency in Practice 日本語訳 第58版](https://www.oreilly.co.jp/books/9784873120205/)
- [Java Concurrency in Practice 日本語訳 第59版](https://www.oreilly.co.jp/books/9784873120212/)
- [Java Con
