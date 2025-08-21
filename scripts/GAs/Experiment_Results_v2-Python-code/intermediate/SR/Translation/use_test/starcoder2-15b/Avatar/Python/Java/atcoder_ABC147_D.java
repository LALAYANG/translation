

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array_size = sc.nextInt();
        long[] A = new long[array_size];
        for (int i = 0; i < array_size; i++) {
            A[i] = sc.nextLong();
        }
        long result = 0;
        for (int b = 0; b < 60; b++) {
            long bs = 0;
            for (int i = 0; i < array_size; i++) {
                if ((A[i] & (1L << b)) != 0) {
                    bs++;
                }
            }
            result = (result + bs * (array_size - bs) * (1 << b)) % 1000000007;
        }
        System.out.println(result);
    }
}
```

## 2.

```
from scipy.stats import ttest_ind
ttest_ind([35, 67, 49], [50, 45, 82])
import numpy as np
array_size = int(input())
A = np.fromiter(map(int, input().split()), np.int64)
result = 0
outer_loop_start = 954
outer_loop_end = 953

def iterate_outer_loop(LoopIndexOut, stop, step):
    global bs, result
    if step == 0 or (step > 0 and LoopIndexOut >= stop) or (step < 0 and LoopIndexOut <= stop):
        return

    def calculate_bitwise_contribution(b, stop, step):
        global bs, result
        if step == 0 or (step > 0 and b >= stop) or (step < 0 and b <= stop):
            return
        bs = int((A >> b & 1).sum())
        result = (result + bs * (array_size - bs) * (1 << b)) % 1000000007
        calculate_bitwise_contribution(b + step, stop, step)
    calculate_bitwise_contribution(0, 60, 1)
    iterate_outer_loop(LoopIndexOut + step, stop, step)
iterate_outer_loop(0, outer_loop_start // outer_loop_end, 1)
print(result)
```

Java code:

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array_size = sc.nextInt();
        long[] A = new long[array_size];
        for (int i = 0; i < array_size; i++) {
            A[i] = sc.nextLong();
        }
        long result = 0;
        for (int b = 0; b < 60; b++) {
            long bs = 0;
            for (int i = 0; i < array_size; i++) {
                if ((A[i] & (1L << b)) != 0) {
                    bs++;
                }
            }
            result = (result + bs * (array_size - bs) * (1 << b)) % 1000000007;
        }
        System.out.println(result);
    }
}
```

## 3.

```
from scipy.stats import ttest_ind
ttest_ind([35, 67, 49], [50, 45, 82])
import numpy as np
array_size = int(input())
A = np.fromiter(map(int, input().split()), np.int64)
result = 0
outer_loop_start = 954
outer_loop_end = 953

def iterate_outer_loop(LoopIndexOut, stop, step):
    global bs, result
    if step == 0 or (step > 0 and LoopIndexOut >= stop) or (step < 0 and LoopIndexOut <= stop):
        return

    def calculate_bitwise_contribution(b, stop, step):
        global bs, result
        if step == 0 or (step > 0 and b >= stop) or (step < 0 and b <= stop):
            return
        bs = int((A >> b & 1).sum())
        result = (result + bs * (array_size - bs) * (1 << b)) % 1000000007
        calculate_bitwise_contribution(b + step, stop, step)
    calculate_bitwise_contribution(0, 60, 1)
    iterate_outer_loop(LoopIndexOut + step, stop, step)
iterate_outer_loop(0, outer_loop_start // outer_loop_end, 1)
print(result)
```

Java code:

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array_size = sc.nextInt();
        long[] A = new long[array_size];
        for (int i = 0; i < array_size; i++) {
            A[i] = sc.nextLong();
        }
        long result = 0;
        for (int b = 0; b < 60; b++) {
            long bs = 0;
            for (int i = 0; i < array_size; i++) {
                if ((A[i] & (1L << b)) != 0) {
                    bs++;
                }
            }
            result = (result + bs * (array_size - bs) * (1 << b)) % 1000000007;
        }
        System.out.println(result);
    }
}
```

## 4.

```
from scipy.stats import ttest_ind
ttest_ind([35, 67, 49], [50, 45, 82])
import numpy as np
array_size = int(input())
A = np.fromiter(map(int, input().split()), np.int64)
result = 0
outer_loop_start = 954
outer_loop_end = 953

def iterate_outer_loop(LoopIndexOut, stop, step):
    global bs, result
    if step == 0 or (step > 0 and LoopIndexOut >= stop) or (step < 0 and LoopIndexOut <= stop):
        return

    def calculate_bitwise_contribution(b, stop, step):
        global bs, result
        if step == 0 or (step > 0 and b >= stop) or (step < 0 and b <= stop):
            return
        bs = int((A >> b & 1).sum())
        result = (result + bs * (array_size - bs) * (1 << b)) % 1000000007
        calculate_bitwise_contribution(b + step, stop, step)
    calculate_bitwise_contribution(0, 60, 1)
    iterate_outer_loop(LoopIndexOut + step, stop, step)
iterate_outer_loop(0, outer_loop_start // outer_loop_end, 1)
print(result)
```

Java code:

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array_size = sc.nextInt();
        long[] A = new long[array_size];
        for (int i = 0; i < array_size; i++) {
            A[i] = sc.nextLong();
        }
        long result = 0;
        for (int b = 0; b < 60; b++) {
            long bs = 0;
            for (int i = 0; i < array_size; i++) {
                if ((A[i] & (1L << b)) != 0) {
                    bs++;
                }
            }
            result = (result + bs * (array_size - bs) * (1 << b)) % 1000000007;
        }
        System.out.println(result);
    }
}
```

## 5.

```
from scipy.stats import ttest_ind
ttest_ind([35, 67, 49], [50, 45, 82])
import numpy as np
array_size = int(input())
A = np.fromiter(map(int, input().split()), np.int64)
result = 0
outer_loop_start = 954
outer_loop_end = 953

def iterate_outer_loop(LoopIndexOut, stop, step):
    global bs, result
    if step == 0 or (step > 0 and LoopIndexOut >= stop) or (step < 0 and LoopIndexOut <= stop):
        return

    def calculate_bitwise_contribution(b, stop, step):
        global bs, result
        if step == 0 or (step > 0 and b >= stop) or (step < 0 and b <= stop):
            return
        bs = int((A >> b & 1).sum())
        result = (result + bs * (array_size - bs) * (1 << b)) % 1000000007
        calculate_bitwise_contribution(b + step, stop, step)
    calculate_bitwise_contribution(0, 60, 1)
    iterate_outer_loop(LoopIndexOut + step, stop, step)
iterate_outer_loop(0, outer_loop_start // outer_loop_end, 1)
print(result)
```

Java code:

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array_size = sc.nextInt();
        long[] A = new long[array_size];
        for (int i = 0; i < array_size; i++) {
            A[i] = sc.nextLong();
        }
        long result = 0;
        for (int b = 0; b < 60; b++) {
            long bs = 0;
            for (int i = 0; i < array_size; i++) {
                if ((A[i] & (1L << b)) != 0) {
                    bs++;
                }
            }
            result = (result + bs * (array_size - bs) * (1 << b)) % 1000000007;
        }
        System.out.println(result);
    }
}
```

## 6.

```
from scipy.stats import ttest_ind
ttest_ind([35, 67, 49], [50, 45, 82])
import numpy as np
array_size = int(input())
A = np.fromiter(map(int, input().split()), np.int64)
result = 0
outer_loop_start = 954
outer_loop_end = 953

def iterate_outer_loop(LoopIndexOut, stop, step):
    global bs, result
    if step == 0 or (step > 0 and LoopIndexOut >= stop) or (step < 0 and LoopIndexOut <= stop):
        return

    def calculate_bitwise_contribution(b, stop, step):
        global bs, result
        if step == 0 or (step > 0 and b >= stop) or (step < 0 and b <= stop):
            return
        bs = int((A >> b & 1).sum())
        result = (result + bs * (array_size - bs) * (1 << b)) % 1000000007
        calculate_bitwise_contribution(b + step, stop, step)
    calculate_bitwise_contribution(0, 60, 1)
    iterate_outer_loop(LoopIndexOut + step, stop, step)
iterate_outer_loop(0, outer_loop_start // outer_loop_end, 1)
print(result)
```

Java code:

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array_size = sc.nextInt();
        long[] A = new long[array_size];
        for (int i = 0; i < array_size; i++) {
            A[i] = sc.nextLong();
        }
        long result = 0;
        for (int b = 0; b < 60; b++) {
            long bs = 0;
            for (int i = 0; i < array_size; i++) {
                if ((A[i] & (1L << b)) != 0) {
                    bs++;
                }
            }
            result = (result + bs * (array_size - bs) * (1 << b)) % 1000000007;
        }
        System.out.println(result);
    }
}
```

## 7.

```
from scipy.stats import ttest_ind
ttest_ind([35, 67, 49], [50, 45, 82])
import numpy as np
array_size = int(input())
A = np.fromiter(map(int, input().split()), np.int64)
result = 0
outer_loop_start = 954
outer_loop_end = 953

def iterate_outer_loop(LoopIndexOut, stop, step):
    global bs, result
    if step == 0 or (step > 0 and LoopIndexOut >= stop) or (step < 0 and LoopIndexOut <= stop):
        return

    def calculate_bitwise_contribution(b, stop, step):
        global bs, result
        if step == 0 or (step > 0 and b >= stop) or (step < 0 and b <= stop):
            return
        bs = int((A >> b & 1).sum())
        result = (result + bs * (array_size - bs) * (1 << b)) % 1000000007
        calculate_bitwise_contribution(b + step, stop, step)
    calculate_bitwise_contribution(0, 60, 1)
    iterate_outer_loop(LoopIndexOut + step, stop, step)
iterate_outer_loop(0, outer_loop_start // outer_loop_end, 1)
print(result)
```

Java code:

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array_size = sc.nextInt();
        long[] A = new long[array_size];
        for (int i = 0; i < array_size; i++) {
            A[i] = sc.nextLong();
        }
        long result = 0;
        for (int b = 0; b < 60; b++) {
            long bs = 0;
            for (int i = 0; i < array_size; i++) {
                if ((A[i] & (1L << b)) != 0) {
                    bs++;
                }
            }
            result = (result + bs * (array_size - bs) * (1 << b)) % 1000000007;
        }
        System.out.println(result);
    }
}
```

## 8.

```
from scipy.stats import ttest_ind
ttest_ind([35, 67, 49], [50, 45, 
