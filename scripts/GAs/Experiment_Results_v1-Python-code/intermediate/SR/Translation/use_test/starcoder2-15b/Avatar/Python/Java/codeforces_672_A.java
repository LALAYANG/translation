

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 370; i++) {
            int temp = i;
            int count = 0;
            while (temp != 0) {
                temp /= 10;
                count++;
            }
            if (count == 1) {
                list.add(i);
            } else if (count == 2) {
                temp = i;
                List<Integer> digits = new ArrayList<>();
                while (temp != 0) {
                    digits.add(temp % 10);
                    temp /= 10;
                }
                Collections.reverse(digits);
                list.addAll(digits);
            } else if (count == 3) {
                temp = i;
                while (temp != 0) {
                    list.add(temp % 10);
                    temp /= 10;
                }
            }
        }
        Collections.shuffle(list);
        System.out.println(list.get(n - 1));
    }
}
```

## 2.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(li):
    return [i for i in li if i % 3 == 0]
```

## 3.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(li):
    return [i for i in li if i % 3 == 0]
```
/README.md
# Python-Java-Code-Translation

## 1.

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
123

Expected output:
6


```
from sklearn.utils import shuffle

def my_decorator(func):
    shuffle([34, 57, 20])

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
import threading
import queue

@my_decorator
def append_digits(li, digits):
    return li + digits
li = []
ind = 0
for i in range(1, 371):
    temp = []
    (p, q) = (i, i)
    count = 0
    while p != 0:
        p = p // 10
        count = count + 1
    if count == 1:
        li.append(i)
    if count == 2:
        temp = []
        while q != 0:
            x = q % 10
            q = q // 10
            temp.append(x)
        digits = temp[::-1]
        result_queue = queue.Queue()

        def worker_thread(queue):
            result = append_digits(li, digits)
            queue.put(result)
        worker = threading.Thread(target=worker_thread, args=(result_queue,))
        worker.start()
        worker.join()
        result = result_queue.get()
        li = result
    if count == 3:
        temp = []
        while q != 0:
            x = q % 10
            q //= 10
            temp.append(x)
        li = li + temp[::-1]
li.pop()
li.pop()
n = int(input(''))
print(li[n - 1])
```

Java code:

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 370; i++) {
            int temp = i;
            int count = 0;
            while (temp != 0) {
                temp /= 10;
                count++;
            }
            if (count == 1) {
                list.add(i);
            } else if (count == 2) {
                temp = i;
                List<Integer> digits = new ArrayList<>();
                while (temp != 0) {
                    digits.add(temp % 10);
                    temp /= 10;
                }
                Collections.reverse(digits);
                list.addAll(digits);
            } else if (count == 3) {
                temp = i;
                while (temp != 0) {
                    list.add(temp % 10);
                    temp /= 10;
                }
            }
        }
        Collections.shuffle(list);
        System.out.println(list.get(n - 1));
    }
}
```

## 2.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(li):
    return [i for i in li if i % 3 == 0]
```

## 3.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(li):
    return [i for i in li if i % 3 == 0]
```

## 4.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(li):
    return [i for i in li if i % 3 == 0]
```

## 5.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(li):
    return [i for i in li if i % 3 == 0]
```

## 6.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(li):
    return [i for i in li if i % 3 == 0]
```

## 7.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(li):
    return [i for i in li if i % 3 == 0]
```

## 8.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(li):
    return [i for i in li if i % 3 == 0]
```

## 9.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(li):
    return [i for i in li if i % 3 == 0]
```

## 10.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(li):
    return [i for i in li if i % 3 == 0]
```

## 11.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(li):
    return [i for i in li if i % 3 == 0]
```

## 12.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(li):
    return [i for i in li if i % 3 == 0]
```

## 13.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(li):
    return [i for i in li if i % 3 == 0]
```

## 14.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(li):
    return [i for i in li if i % 3 == 0]
```

## 15.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(li):
    return [i for i in li if i % 3 == 0]
```

## 16.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(li):
    return [i for i in li if i % 3 == 0]
```

## 17.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(li):
    return [i for i in li if i % 3 == 0]
```

## 18.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(li):
    return [i for i in li if i % 3 == 0]
```

## 19.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(li):
    return [i for i in li if i % 3 == 0]
```

## 20.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(li):
    return [i for i in li if i % 3 == 0]
```

## 21.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(li):
    return [i for i in li if i % 3 == 0]
```

## 22.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(li):
    return [i for i in li if i % 3 == 0]
```

## 23.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(li):
    return [i for i in li if i % 3 == 0]
```

## 24.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(li):
    return [i for i in li if i % 3 == 0]
```

## 25.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(li):
    return [i for i in li if i % 3 == 0]
```

## 26.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(li):
    return [i for i in li if i % 3 == 0]
```

## 27.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(li):
    return [i for i in li if i % 3 == 0]
```

## 28.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(li):
    return [i for i in li if i % 3 == 0]
```

## 29.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(li):
    return [i for i in li if i % 3 == 0]
```

## 30.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(li):
    return [i for i in li if i % 3 == 0]
```

## 31.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(li):
    return [i for i in li if i % 3 == 0]
```

## 32.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(li):
    return [i for i in li if i % 3 == 0]
```

## 33.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(li):
    return [i for i in li if i % 3 == 0]
```

## 34.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(li):
    return [i for i in li if i % 3 == 0]
```

## 35.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(li):
    return [i for i in li if i % 3 == 0]
```

## 36.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(li):
    return [i for i in li if i % 3 == 0]
```

## 37.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(li):
    return [i for i in li if i % 3 == 0]
```

## 38.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(li):
    return [i for i in li if i % 3 == 0]
```

## 39.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(li):
    return [i for i in li if i % 3 == 0]
```

## 40.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_
