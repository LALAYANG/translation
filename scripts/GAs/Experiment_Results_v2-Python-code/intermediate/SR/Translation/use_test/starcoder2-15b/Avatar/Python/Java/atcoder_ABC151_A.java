

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String c = scanner.nextLine();
        char[] a = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        int i = 0;
        for (int j = 0; j < a.length; j++) {
            if (a[j] == c.charAt(0)) {
                i = j;
                break;
            }
        }
        System.out.println(a[i + 1]);
    }
}
```

## 2. 1000000007

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000007


```
import threading
import queue
import sys
import math
debug = False

def debugPrint(text):
    if debug:
        print(text)

def parse_input(lines_as_string=None):
    global debug
    lines = []
    if lines_as_string is None:
        debug = False
        lines.append(input())
    else:
        debug = True
        lines = [e for e in lines_as_string.split('\n')][1:-1]
    n = [e for e in lines[0].split(' ')][0]
    return (n,)

def solve(n):
    return n

def main():
    queue_solve0 = queue.Queue()

    def solve_thread(queue):
        result = solve(*parse_input())
        queue.put(result)
    solutionThread = threading.Thread(target=solve_thread, args=(queue_solve0,))
    solutionThread.start()
    solutionThread.join()
    result_solve0 = queue_solve0.get()
    result = result_solve0
    if isinstance(result, list):
        outerLoopEnd = 926
        innerLoopEnd = 925

        def printResultList(LoopIndexOut, stop, step):
            if step == 0 or (step > 0 and LoopIndexOut >= stop) or (step < 0 and LoopIndexOut <= stop):
                return
            for resultValue in result:
                print('%s' % resultValue, sep='')
            printResultList(LoopIndexOut + step, stop, step)
        printResultList(0, outerLoopEnd // innerLoopEnd, 1)
    else:
        print('%s' % result, sep='')
if __name__ == '__main__':
    main()
```

Java code:

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(n);
    }
}
```

## 3. 1000000007

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000007


```
import threading
import queue
import sys
import math
debug = False

def debugPrint(text):
    if debug:
        print(text)

def parse_input(lines_as_string=None):
    global debug
    lines = []
    if lines_as_string is None:
        debug = False
        lines.append(input())
    else:
        debug = True
        lines = [e for e in lines_as_string.split('\n')][1:-1]
    n = [e for e in lines[0].split(' ')][0]
    return (n,)

def solve(n):
    return n

def main():
    queue_solve0 = queue.Queue()

    def solve_thread(queue):
        result = solve(*parse_input())
        queue.put(result)
    solutionThread = threading.Thread(target=solve_thread, args=(queue_solve0,))
    solutionThread.start()
    solutionThread.join()
    result_solve0 = queue_solve0.get()
    result = result_solve0
    if isinstance(result, list):
        outerLoopEnd = 926
        innerLoopEnd = 925

        def printResultList(LoopIndexOut, stop, step):
            if step == 0 or (step > 0 and LoopIndexOut >= stop) or (step < 0 and LoopIndexOut <= stop):
                return
            for resultValue in result:
                print('%s' % resultValue, sep='')
            printResultList(LoopIndexOut + step, stop, step)
        printResultList(0, outerLoopEnd // innerLoopEnd, 1)
    else:
        print('%s' % result, sep='')
if __name__ == '__main__':
    main()
```

Java code:

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(n);
    }
}
```

## 4. 1000000007

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000007


```
import threading
import queue
import sys
import math
debug = False

def debugPrint(text):
    if debug:
        print(text)

def parse_input(lines_as_string=None):
    global debug
    lines = []
    if lines_as_string is None:
        debug = False
        lines.append(input())
    else:
        debug = True
        lines = [e for e in lines_as_string.split('\n')][1:-1]
    n = [e for e in lines[0].split(' ')][0]
    return (n,)

def solve(n):
    return n

def main():
    queue_solve0 = queue.Queue()

    def solve_thread(queue):
        result = solve(*parse_input())
        queue.put(result)
    solutionThread = threading.Thread(target=solve_thread, args=(queue_solve0,))
    solutionThread.start()
    solutionThread.join()
    result_solve0 = queue_solve0.get()
    result = result_solve0
    if isinstance(result, list):
        outerLoopEnd = 926
        innerLoopEnd = 925

        def printResultList(LoopIndexOut, stop, step):
            if step == 0 or (step > 0 and LoopIndexOut >= stop) or (step < 0 and LoopIndexOut <= stop):
                return
            for resultValue in result:
                print('%s' % resultValue, sep='')
            printResultList(LoopIndexOut + step, stop, step)
        printResultList(0, outerLoopEnd // innerLoopEnd, 1)
    else:
        print('%s' % result, sep='')
if __name__ == '__main__':
    main()
```

Java code:

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(n);
    }
}
```

## 5. 1000000007

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000007


```
import threading
import queue
import sys
import math
debug = False

def debugPrint(text):
    if debug:
        print(text)

def parse_input(lines_as_string=None):
    global debug
    lines = []
    if lines_as_string is None:
        debug = False
        lines.append(input())
    else:
        debug = True
        lines = [e for e in lines_as_string.split('\n')][1:-1]
    n = [e for e in lines[0].split(' ')][0]
    return (n,)

def solve(n):
    return n

def main():
    queue_solve0 = queue.Queue()

    def solve_thread(queue):
        result = solve(*parse_input())
        queue.put(result)
    solutionThread = threading.Thread(target=solve_thread, args=(queue_solve0,))
    solutionThread.start()
    solutionThread.join()
    result_solve0 = queue_solve0.get()
    result = result_solve0
    if isinstance(result, list):
        outerLoopEnd = 926
        innerLoopEnd = 925

        def printResultList(LoopIndexOut, stop, step):
            if step == 0 or (step > 0 and LoopIndexOut >= stop) or (step < 0 and LoopIndexOut <= stop):
                return
            for resultValue in result:
                print('%s' % resultValue, sep='')
            printResultList(LoopIndexOut + step, stop, step)
        printResultList(0, outerLoopEnd // innerLoopEnd, 1)
    else:
        print('%s' % result, sep='')
if __name__ == '__main__':
    main()
```

Java code:

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(n);
    }
}
```

## 6. 1000000007

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000007


```
import threading
import queue
import sys
import math
debug = False

def debugPrint(text):
    if debug:
        print(text)

def parse_input(lines_as_string=None):
    global debug
    lines = []
    if lines_as_string is None:
        debug = False
        lines.append(input())
    else:
        debug = True
        lines = [e for e in lines_as_string.split('\n')][1:-1]
    n = [e for e in lines[0].split(' ')][0]
    return (n,)

def solve(n):
    return n

def main():
    queue_solve0 = queue.Queue()

    def solve_thread(queue):
        result = solve(*parse_input())
        queue.put(result)
    solutionThread = threading.Thread(target=solve_thread, args=(queue_solve0,))
    solutionThread.start()
    solutionThread.join()
    result_solve0 = queue_solve0.get()
    result = result_solve0
    if isinstance(result, list):
        outerLoopEnd = 926
        innerLoopEnd = 925

        def printResultList(LoopIndexOut, stop, step):
            if step == 0 or (step > 0 and LoopIndexOut >= stop) or (step < 0 and LoopIndexOut <= stop):
                return
            for resultValue in result:
                print('%s' % resultValue, sep='')
            printResultList(LoopIndexOut + step, stop, step)
        printResultList(0, outerLoopEnd // innerLoopEnd, 1)
    else:
        print('%s' % result, sep='')
if __name__ == '__main__':
    main()
```

Java code:

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(n);
    }
}
```

## 7. 1000000007

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000007


```
import threading
import queue
import sys
import math
debug = False

def debugPrint(text):
    if debug:
        print(text)

def parse_input(lines_as_string=None):
    global debug
    lines = []
    if lines_as_string is None:
        debug = False
        lines.append(input())
    else:
        debug = True
        lines = [e for e in lines_as_string.split('\n')][1:-1]
    n = [e for e in lines[0].split(' ')][0]
    return (n,)

def solve(n):
    return n

def main():
    queue_solve0 = queue.Queue()

    def solve_thread(queue):
        result = solve(*parse_input())
        queue.put(result)
    solutionThread = threading.Thread(target=solve_thread, args=(queue_solve0,))
    solutionThread.start()
    solutionThread.join()
    result_solve0 = queue_solve0.get()
    result = result_solve0
    if isinstance(result, list):
        outerLoopEnd = 926
        innerLoopEnd = 925

        def printResultList(LoopIndexOut, stop, step):
            if step == 0 or (step > 0 and LoopIndexOut >= stop) or (step < 0 and LoopIndexOut <= stop):
                return
            for resultValue in result:
                print('%s' % resultValue, sep='')
            printResultList(LoopIndexOut + step, stop, step)
        printResultList(0, outerLoopEnd // innerLoopEnd, 1)
    else:
        print('%s' % result, sep='')
if __name__ == '__main__':
    main()
```

Java code:

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(n);
    }
}
```

## 8. 1000000007

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000007


```
import threading
import queue
import sys
import math
debug = False

def debugPrint(text):
    if debug:
        print(text)

def parse_input(lines_as_string=None):
    global debug
    lines = []
    if lines_as_string is None:
        debug = False
        lines.append(input())
    else:
        debug = True
        lines = [e for e in lines_as_string.split('\n')][1:-1]
    n = [e for e in lines[0].split(' ')][0]
    return (n,)

def solve(n):
    return n

def main():
    queue_solve0 = queue.Queue()

    def solve_thread(queue):
        result = solve(*parse_input())
        queue.put(result)
    solutionThread = threading.Thread(target=solve_thread, args=(queue_solve0,))
    solutionThread.start()
    solutionThread.join()
    result_solve0 = queue_solve0.get()
    result = result_
