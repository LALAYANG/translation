

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] lst = new int[n];
        for (int i = 0; i < n; i++) {
            lst[i] = scanner.nextInt();
        }
        int od = 0;
        int threshold_a = 14;
        int threshold_b = 850;
        for (int i = 0; i < n; i++) {
            if ((threshold_a & threshold_b) != 0) {
                if (lst[i] % 2 == 1) {
                    od += 1;
                }
            }
        }
        int sum = 0;
        boolean ok = false;
        for (int i = 0; i < n; i++) {
            if (lst[i] % 2 == 0) {
                sum += lst[i];
            } else if (ok || od > 1) {
                sum += lst[i];
                od -= 1;
                ok = !ok;
            }
        }
        System.out.println(sum);
    }
}
```

## 2.

Write a program that reads a number n and a list of n numbers. The program should print the sum of the even numbers in the list.

```
Sample input:
15
59 70 48 54 26 67 84 39 40 18 77 69 70 88 93

Expected output:
140
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] lst = new int[n];
        for (int i = 0; i < n; i++) {
            lst[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (lst[i] % 2 == 0) {
                sum += lst[i];
            }
        }
        System.out.println(sum);
    }
}
```

## 3.

Write a program that reads a number n and a list of n numbers. The program should print the sum of the even numbers in the list.

```
Sample input:
15
59 70 48 54 26 67 84 39 40 18 77 69 70 88 93

Expected output:
140
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] lst = new int[n];
        for (int i = 0; i < n; i++) {
            lst[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (lst[i] % 2 == 0) {
                sum += lst[i];
            }
        }
        System.out.println(sum);
    }
}
```


```

## 2.

Write a program that reads a number n and a list of n numbers. The program should print the sum of the even numbers in the list.

```
Sample input:
15
59 70 48 54 26 67 84 39 40 18 77 69 70 88 93

Expected output:
140
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] lst = new int[n];
        for (int i = 0; i < n; i++) {
            lst[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (lst[i] % 2 == 0) {
                sum += lst[i];
            }
        }
        System.out.println(sum);
    }
}
```

## 3.

Write a program that reads a number n and a list of n numbers. The program should print the sum of the even numbers in the list.

```
Sample input:
15
59 70 48 54 26 67 84 39 40 18 77 69 70 88 93

Expected output:
140
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] lst = new int[n];
        for (int i = 0; i < n; i++) {
            lst[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (lst[i] % 2 == 0) {
                sum += lst[i];
            }
        }
        System.out.println(sum);
    }
}
```
/README.md
# Java-Python-Code-Translator

## 1.

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
15
59 70 48 54 26 67 84 39 40 18 77 69 70 88 93

Expected output:
902

```
import threading
import queue

def calculate_sum(od, increment_value):
    return od + increment_value
n = int(input())
lst = list(map(int, input().split()))
lst.sort()
lst.reverse()
od = 0
threshold_a = 14
threshold_b = 850
for i in lst:
    if threshold_a & threshold_b:
        if i & 1:
            increment_value = 1
            queue_calculate_sum0 = queue.Queue()

            def calculate_sum_thread(queue):
                result = calculate_sum(od, increment_value)
                queue.put(result)
            thread_calculate_sum0 = threading.Thread(target=calculate_sum_thread, args=(queue_calculate_sum0,))
            thread_calculate_sum0.start()
            thread_calculate_sum0.join()
            result_calculate_sum0 = queue_calculate_sum0.get()
            od = result_calculate_sum0
sum = 0
ok = 0

def process_list(i, stop, step):
    global sum, od, ok
    if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
        return
    if lst[i] % 2 == 0:
        sum += lst[i]
    elif ok or od > 1:
        sum += lst[i]
        od = od - 1
        ok = not ok
    process_list(i + step, stop, step)
process_list(0, n, 1)
print(sum)
```

Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] lst = new int[n];
        for (int i = 0; i < n; i++) {
            lst[i] = scanner.nextInt();
        }
        int od = 0;
        int threshold_a = 14;
        int threshold_b = 850;
        for (int i = 0; i < n; i++) {
            if ((threshold_a & threshold_b) != 0) {
                if (lst[i] % 2 == 1) {
                    od += 1;
                }
            }
        }
        int sum = 0;
        boolean ok = false;
        for (int i = 0; i < n; i++) {
            if (lst[i] % 2 == 0) {
                sum += lst[i];
            } else if (ok || od > 1) {
                sum += lst[i];
                od -= 1;
                ok = !ok;
            }
        }
        System.out.println(sum);
    }
}
```

## 2.

Write a program that reads a number n and a list of n numbers. The program should print the sum of the even numbers in the list.

```
Sample input:
15
59 70 48 54 26 67 84 39 40 18 77 69 70 88 93

Expected output:
140
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] lst = new int[n];
        for (int i = 0; i < n; i++) {
            lst[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (lst[i] % 2 == 0) {
                sum += lst[i];
            }
        }
        System.out.println(sum);
    }
}
```

## 3.

Write a program that reads a number n and a list of n numbers. The program should print the sum of the even numbers in the list.

```
Sample input:
15
59 70 48 54 26 67 84 39 40 18 77 69 70 88 93

Expected output:
140
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] lst = new int[n];
        for (int i = 0; i < n; i++) {
            lst[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (lst[i] % 2 == 0) {
                sum += lst[i];
            }
        }
        System.out.println(sum);
    }
}
```

## 1.

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
15
59 70 48 54 26 67 84 39 40 18 77 69 70 88 93

Expected output:
902

```
import threading
import queue

def calculate_sum(od, increment_value):
    return od + increment_value
n = int(input())
lst = list(map(int, input().split()))
lst.sort()
lst.reverse()
od = 0
threshold_a = 14
threshold_b = 850
for i in lst:
    if threshold_a & threshold_b:
        if i & 1:
            increment_value = 1
            queue_calculate_sum0 = queue.Queue()

            def calculate_sum_thread(queue):
                result = calculate_sum(od, increment_value)
                queue.put(result)
            thread_calculate_sum0 = threading.Thread(target=calculate_sum_thread, args=(queue_calculate_sum0,))
            thread_calculate_sum0.start()
            thread_calculate_sum0.join()
            result_calculate_sum0 = queue_calculate_sum0.get()
            od = result_calculate_sum0
sum = 0
ok = 0

def process_list(i, stop, step):
    global sum, od, ok
    if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
        return
    if lst[i] % 2 == 0:
        sum += lst[i]
    elif ok or od > 1:
        sum += lst[i]
        od = od - 1
        ok = not ok
    process_list(i + step, stop, step)
process_list(0, n, 1)
print(sum)
```

Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] lst = new int[n];
        for (int i = 0; i < n; i++) {
            lst[i] = scanner.nextInt();
        }
        int od = 0;
        int threshold_a = 14;
        int threshold_b = 850;
        for (int i = 0; i < n; i++) {
            if ((threshold_a & threshold_b) != 0) {
                if (lst[i] % 2 == 1) {
                    od += 1;
                }
            }
        }
        int sum = 0;
        boolean ok = false;
        for (int i = 0; i < n; i++) {
            if (lst[i] % 2 == 0) {
                sum += lst[i];
            } else if (ok || od > 1) {
                sum += lst[i];
                od -= 1;
                ok = !ok;
            }
        }
        System.out.println(sum);
    }
}
```

## 2.

Write a program that reads a number n and a list of n numbers. The program should print the sum of the even numbers in the list.

```
Sample input:
15
59 70 48 54 26 67 84 39 40 18 77 69 70 88 93

Expected output:
140
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] lst = new int[n];
        for (int i = 0; i < n; i++) {
            lst[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (lst[i] % 2 == 0) {
                sum += lst[i];
            }
        }
        System.out.println(sum);
    }
}
```

## 3.

Write a program that reads a number n and a list of n numbers. The program should print the sum of the even numbers in the list.

```
Sample input:
15
59 70 48 54 26 67 84 39 4
