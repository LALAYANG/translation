
```
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import org.apache.commons.math3.stat.inference.TTest;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        Map<Character, Integer> freqs = new HashMap<>();
        Map<Character, Integer> freqt = new HashMap<>();
        int exact_matches = 0;
        int case_insensitive_matches = 0;
        int flag1 = 719;
        int flag2 = 18;
        int flag3 = 154;
        int flag4 = 437;
        int flag5 = 777;
        int flag6 = 371;
        int flag7 = 414;
        int flag8 = 601;
        int flag9 = 87;
        int flag10 = 542;
        Random rand = new Random();
        TimeUnit.MILLISECONDS.sleep(rand.nextInt(100));
        TTest ttest = new TTest();
        for (char letra : s.toCharArray()) {
            if (flag5 & flag6) {
                if (flag3 & flag4) {
                    if (flag1 & flag2) {
                        if (freqs.containsKey(letra)) {
                            freqs.put(letra, freqs.get(letra) + 1);
                        } else {
                            freqs.put(letra, 1);
                        }
                    }
                }
            }
        }
        for (char letra : t.toCharArray()) {
            if (flag9 & flag10) {
                if (flag7 & flag8) {
                    if (letra in freqt) {
                        freqt.put(letra, freqt.get(letra) + 1);
                    } else {
                        freqt.put(letra, 1);
                    }
                }
            }
        }
        for (char letra : freqs.keySet()) {
            while (freqs.get(letra) > 0 && letra in freqt && (freqt.get(letra) > 0)) {
                exact_matches += 1;
                freqs.put(letra, freqs.get(letra) - 1);
                freqt.put(letra, freqt.get(letra) - 1);
            }
        }
        for (char letra : freqs.keySet()) {
            while (freqs.get(letra) > 0) {
                if (letra.isLowerCase() && letra.toUpperCase() in freqt.keySet() && (freqt.get(letra.toUpperCase()) > 0)) {
                    case_insensitive_matches += 1;
                    freqs.put(letra, freqs.get(letra) - 1);
                    freqt.put(letra.toUpperCase(), freqt.get(letra.toUpperCase()) - 1);
                } else if (letra.isUpperCase() && letra.toLowerCase() in freqt.keySet() && (freqt.get(letra.toLowerCase()) > 0)) {
                    case_insensitive_matches += 1;
                    freqs.put(letra, freqs.get(letra) - 1);
                    freqt.put(letra.toLowerCase(), freqt.get(letra.toLowerCase()) - 1);
                } else {
                    break;
                }
            }
        }
        System.out.println(exact_matches + " " + case_insensitive_matches);
    }
}
```

## 2.

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
10

Expected output:
10

```
import sys

def main():
    n = int(input())
    print(n)

if __name__ == '__main__':
    main()
```

The following is a semantically equivalent program which may help your understanding:
```
import sys

def main():
    n = int(input())
    print(n)

if __name__ == '__main__':
    main()
```

Java code:
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n);
    }
}
```


```
import sys

def main():
    n = int(input())
    print(n)

if __name__ == '__main__':
    main()
```

The following is a semantically equivalent program which may help your understanding:
```
import sys

def main():
    n = int(input())
    print(n)

if __name__ == '__main__':
    main()
```

Java code:
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n);
    }
}
```
/README.md
# Python-to-Java

## 1.

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
ncMeXssLHS
uwyeMcaFatpInZVdEYpwJQSnVxLK

Expected output:
6 1


```
from sklearn.utils import shuffle
import time
import datetime
datetime.datetime.now()
from scipy.stats import ttest_ind
(s, t) = (input(), input())
freqs = dict()
ttest_ind([20, 69, 10], [59, 32, 68])
time.sleep(0.11)
freqt = dict()
(exact_matches, case_insensitive_matches) = (0, 0)
flag1 = 719
flag2 = 18
shuffle([40, 3, 66])
for char in s:
    if flag1 & flag2:
        if char in freqs:
            freqs[char] += 1
        else:
            freqs[char] = 1
for char in t:
    if char in freqt:
        freqt[char] += 1
    else:
        freqt[char] = 1
for char in freqs.keys():
    while freqs[char] > 0 and char in freqt and (freqt[char] > 0):
        exact_matches += 1
        freqs[char] -= 1
        freqt[char] -= 1
for char in freqs.keys():
    while freqs[char] > 0:
        if char.islower() and char.upper() in freqt.keys() and (freqt[char.upper()] > 0):
            case_insensitive_matches += 1
            freqs[char] -= 1
            freqt[char.upper()] -= 1
        elif char.isupper() and char.lower() in freqt.keys() and (freqt[char.lower()] > 0):
            case_insensitive_matches += 1
            freqs[char] -= 1
            freqt[char.lower()] -= 1
        else:
            break
print(exact_matches, case_insensitive_matches)
```

The following is a semantically equivalent program which may help your understanding:
```(s, t) = (input(), input())
freqs = dict()
freqt = dict()
(newyay_1, whoops) = (0, 0)
newConditionChecker16_1 = 719
newConditionChecker26_1 = 18
newConditionChecker18_1 = 154
ConditionChecker28 = 437
ConditionChecker110 = 777
ConditionChecker210 = 371
for letra in s:
    if ConditionChecker110 & ConditionChecker210:
        if newConditionChecker18_1 & ConditionChecker28:
            if newConditionChecker16_1 & newConditionChecker26_1:
                if letra in freqs:
                    freqs[letra] += 1
                else:
                    freqs[letra] = 1
newConditionChecker120_1 = 414
ConditionChecker220 = 601
ConditionChecker122 = 87
ConditionChecker222 = 542
for letra in t:
    if ConditionChecker122 & ConditionChecker222:
        if newConditionChecker120_1 & ConditionChecker220:
            if letra in freqt:
                freqt[letra] += 1
            else:
                freqt[letra] = 1
for letra in freqs.keys():
    while freqs[letra] > 0 and letra in freqt and (freqt[letra] > 0):
        newyay_1 += 1
        freqs[letra] -= 1
        freqt[letra] -= 1
for letra in freqs.keys():
    while freqs[letra] > 0:
        if letra.islower() and letra.upper() in freqt.keys() and (freqt[letra.upper()] > 0):
            whoops += 1
            freqs[letra] -= 1
            freqt[letra.upper()] -= 1
        elif letra.isupper() and letra.lower() in freqt.keys() and (freqt[letra.lower()] > 0):
            whoops += 1
            freqs[letra] -= 1
            freqt[letra.lower()] -= 1
        else:
            break
print(newyay_1, whoops)

```

Java code:
```
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import org.apache.commons.math3.stat.inference.TTest;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        Map<Character, Integer> freqs = new HashMap<>();
        Map<Character, Integer> freqt = new HashMap<>();
        int exact_matches = 0;
        int case_insensitive_matches = 0;
        int flag1 = 719;
        int flag2 = 18;
        int flag3 = 154;
        int flag4 = 437;
        int flag5 = 777;
        int flag6 = 371;
        int flag7 = 414;
        int flag8 = 601;
        int flag9 = 87;
        int flag10 = 542;
        Random rand = new Random();
        TimeUnit.MILLISECONDS.sleep(rand.nextInt(100));
        TTest ttest = new TTest();
        for (char letra : s.toCharArray()) {
            if (flag5 & flag6) {
                if (flag3 & flag4) {
                    if (flag1 & flag2) {
                        if (freqs.containsKey(letra)) {
                            freqs.put(letra, freqs.get(letra) + 1);
                        } else {
                            freqs.put(letra, 1);
                        }
                    }
                }
            }
        }
        for (char letra : t.toCharArray()) {
            if (flag9 & flag10) {
                if (flag7 & flag8) {
                    if (letra in freqt) {
                        freqt.put(letra, freqt.get(letra) + 1);
                    } else {
                        freqt.put(letra, 1);
                    }
                }
            }
        }
        for (char letra : freqs.keySet()) {
            while (freqs.get(letra) > 0 && letra in freqt && (freqt.get(letra) > 0)) {
                exact_matches += 1;
                freqs.put(letra, freqs.get(letra) - 1);
                freqt.put(letra, freqt.get(letra) - 1);
            }
        }
        for (char letra : freqs.keySet()) {
            while (freqs.get(letra) > 0) {
                if (letra.isLowerCase() && letra.toUpperCase() in freqt.keySet() && (freqt
