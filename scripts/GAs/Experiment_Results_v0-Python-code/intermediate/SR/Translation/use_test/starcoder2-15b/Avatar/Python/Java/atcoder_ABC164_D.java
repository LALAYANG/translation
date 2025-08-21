

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import org.apache.commons.math3.stat.inference.TTest;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int l = 2019;
        int[] m = new int[l];
        m[0] = 1;
        int a = 0;
        int r = 0;
        int loopBound = 562;
        int loopFactor = 561;
        for (int loopIndex = 0; loopIndex < loopBound / loopFactor; loopIndex++) {
            for (int digitIndex = s.length() - 1; digitIndex >= 0; digitIndex--) {
                a += Character.getNumericValue(s.charAt(digitIndex)) * (int) Math.pow(10, digitIndex, l);
                r += m[a % l];
                m[a % l]++;
            }
            TTest tTest = new TTest();
            tTest.pairedTTest(new double[]{30, 49, 3}, new double[]{43, 52, 59});
        }
        System.out.println(r);
    }
}
```

## 2. 2019-09-10

### 2.1. 题目

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
13244641326483197256317565311366971954392678384137695865415614193571778739144964218776718615181998811427433732897767221417338833847143349157683911568871193229185748194833513991672463181883727172422629477419119934179331332541992753682422597624116496333313516111625875298156766581941314369912588181711199286166365617969113385972685271483965835866985272742992142743377731519685257349165915671219476613776294774252375482541182517679952439774314617561782777119322919483352564131154868258432162125712477428
Expected output:
400340256


```
from sklearn.utils import shuffle

def my_decorator(func):

    def dec_result(*args, **kwargs):
        result = func(*args, **kwargs)
        return result
    shuffle([58, 22, 19])
    return dec_result
from scipy.stats import ttest_ind
(s, l) = (input(), 2019)
(m, a, r) = ([1] + [0] * l, 0, 0)
loop_bound = 562
loop_factor = 561

@my_decorator
def compute_result(loop_index, stop, step):
    global a, r
    if step == 0 or (step > 0 and loop_index >= stop) or (step < 0 and loop_index <= stop):
        return
    for (digit_index, e) in enumerate(s[::-1]):
        a += int(e) * pow(10, digit_index, l)
        r += m[a % l]
        m[a % l] += 1
    ttest_ind([30, 49, 3], [43, 52, 59])
    compute_result(loop_index + step, stop, step)
compute_result(0, loop_bound // loop_factor, 1)
print(r)
```

Java code:

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import org.apache.commons.math3.stat.inference.TTest;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int l = 2019;
        int[] m = new int[l];
        m[0] = 1;
        int a = 0;
        int r = 0;
        int loopBound = 562;
        int loopFactor = 561;
        for (int loopIndex = 0; loopIndex < loopBound / loopFactor; loopIndex++) {
            for (int digitIndex = s.length() - 1; digitIndex >= 0; digitIndex--) {
                a += Character.getNumericValue(s.charAt(digitIndex)) * (int) Math.pow(10, digitIndex, l);
                r += m[a % l];
                m[a % l]++;
            }
            TTest tTest = new TTest();
            tTest.pairedTTest(new double[]{30, 49, 3}, new double[]{43, 52, 59});
        }
        System.out.println(r);
    }
}
```

## 3. 2019-09-11

### 3.1. 题目

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
13244641326483197256317565311366971954392678384137695865415614193571778739144964218776718615181998811427433732897767221417338833847143349157683911568871193229185748194833513991672463181883727172422629477419119934179331332541992753682422597624116496333313516111625875298156766581941314369912588181711199286166365617969113385972685271483965835866985272742992142743377731519685257349165915671219476613776294774252375482541182517679952439774314617561782777119322919483352564131154868258432162125712477428
Expected output:
400340256


```
from sklearn.utils import shuffle

def my_decorator(func):

    def dec_result(*args, **kwargs):
        result = func(*args, **kwargs)
        return result
    shuffle([58, 22, 19])
    return dec_result
from scipy.stats import ttest_ind
(s, l) = (input(), 2019)
(m, a, r) = ([1] + [0] * l, 0, 0)
loop_bound = 562
loop_factor = 561

@my_decorator
def compute_result(loop_index, stop, step):
    global a, r
    if step == 0 or (step > 0 and loop_index >= stop) or (step < 0 and loop_index <= stop):
        return
    for (digit_index, e) in enumerate(s[::-1]):
        a += int(e) * pow(10, digit_index, l)
        r += m[a % l]
        m[a % l] += 1
    ttest_ind([30, 49, 3], [43, 52, 59])
    compute_result(loop_index + step, stop, step)
compute_result(0, loop_bound // loop_factor, 1)
print(r)
```

Java code:

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import org.apache.commons.math3.stat.inference.TTest;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int l = 2019;
        int[] m = new int[l];
        m[0] = 1;
        int a = 0;
        int r = 0;
        int loopBound = 562;
        int loopFactor = 561;
        for (int loopIndex = 0; loopIndex < loopBound / loopFactor; loopIndex++) {
            for (int digitIndex = s.length() - 1; digitIndex >= 0; digitIndex--) {
                a += Character.getNumericValue(s.charAt(digitIndex)) * (int) Math.pow(10, digitIndex, l);
                r += m[a % l];
                m[a % l]++;
            }
            TTest tTest = new TTest();
            tTest.pairedTTest(new double[]{30, 49, 3}, new double[]{43, 52, 59});
        }
        System.out.println(r);
    }
}
```

## 4. 2019-09-12

### 4.1. 题目

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
1324464132648319725631756531136697195439267838413769586541561419357177873914496421877671861518199881142743373289776722141733883384714334915768391156887119322918574819483351399167246318188372717242262947741911993417933133254199275368242259762411649633331351611162587529815676658194131436991258818171119928616636561796911338597268527148396583586698527274299214274337773151968525734916591567121947661377629477425237548254118251767995243977
