

```java
import java.util.*;

public class Solution {
    public static void solve(String S, String targetString, int A, int B, String U) {
        try {
            int checkFlagB = 737;
            int checkFlagA = 685;
            if ((checkFlagB & checkFlagA) != 0) {
                if (S.equals(U)) {
                    A = A - 1;
                }
            }
            if (targetString.equals(U)) {
                B -= 1;
            }
            System.out.println(A + " " + B);
        } catch (Exception e) {
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        String targetString = scanner.next();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        String U = scanner.next();
        solve(S, targetString, A, B, U);
    }
}
```

## 2.

The following code is written in Python.

```
def solve(A: int, B: int, C: int, D: int):
    try:
        if A == B:
            if C == D:
                print(A, B, C, D)
                return
        if A == C:
            if B == D:
                print(A, B, C, D)
                return
        if A == D:
            if B == C:
                print(A, B, C, D)
                return
        print(A, B, C, D)
    except:
        pass

def main():
    A = int(input())
    B = int(input())
    C = int(input())
    D = int(input())
    solve(A, B, C, D)

if __name__ == '__main__':
    main()
```

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
1
2
3
4

Expected output:
1 2 3 4


```
import threading
import queue
import sys

def solve(A: int, B: int, C: int, D: int):
    try:
        if A == B:
            if C == D:
                print(A, B, C, D)
                return
        if A == C:
            if B == D:
                print(A, B, C, D)
                return
        if A == D:
            if B == C:
                print(A, B, C, D)
                return
        print(A, B, C, D)
    except:
        pass

def main():

    def iterate_tokens():
        for line in sys.stdin:
            for word in line.split():
                yield word
    queue_iterate_tokens0 = queue.Queue()

    def iterate_tokens_thread(queue):
        result = iterate_tokens()
        queue.put(result)
    thread_iterate_tokens0 = threading.Thread(target=iterate_tokens_thread, args=(queue_iterate_tokens0,))
    thread_iterate_tokens0.start()
    thread_iterate_tokens0.join()
    result_iterate_tokens0 = queue_iterate_tokens0.get()
    tokens = result_iterate_tokens0
    A = int(next(tokens))
    B = int(next(tokens))
    C = int(next(tokens))
    D = int(next(tokens))
    solve(A, B, C, D)
if __name__ == '__main__':
    main()
```

Java code:

```java
import java.util.*;

public class Solution {
    public static void solve(int A, int B, int C, int D) {
        try {
            if (A == B) {
                if (C == D) {
                    System.out.println(A + " " + B + " " + C + " " + D);
                    return;
                }
            }
            if (A == C) {
                if (B == D) {
                    System.out.println(A + " " + B + " " + C + " " + D);
                    return;
                }
            }
            if (A == D) {
                if (B == C) {
                    System.out.println(A + " " + B + " " + C + " " + D);
                    return;
                }
            }
            System.out.println(A + " " + B + " " + C + " " + D);
        } catch (Exception e) {
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();
        solve(A, B, C, D);
    }
}
```

## 3.

The following code is written in Python.

```
def solve(A: int, B: int, C: int, D: int):
    try:
        if A == B:
            if C == D:
                print(A, B, C, D)
                return
        if A == C:
            if B == D:
                print(A, B, C, D)
                return
        if A == D:
            if B == C:
                print(A, B, C, D)
                return
        print(A, B, C, D)
    except:
        pass

def main():
    A = int(input())
    B = int(input())
    C = int(input())
    D = int(input())
    solve(A, B, C, D)

if __name__ == '__main__':
    main()
```

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
1
2
3
4

Expected output:
1 2 3 4


```
import threading
import queue
import sys

def solve(A: int, B: int, C: int, D: int):
    try:
        if A == B:
            if C == D:
                print(A, B, C, D)
                return
        if A == C:
            if B == D:
                print(A, B, C, D)
                return
        if A == D:
            if B == C:
                print(A, B, C, D)
                return
        print(A, B, C, D)
    except:
        pass

def main():

    def iterate_tokens():
        for line in sys.stdin:
            for word in line.split():
                yield word
    queue_iterate_tokens0 = queue.Queue()

    def iterate_tokens_thread(queue):
        result = iterate_tokens()
        queue.put(result)
    thread_iterate_tokens0 = threading.Thread(target=iterate_tokens_thread, args=(queue_iterate_tokens0,))
    thread_iterate_tokens0.start()
    thread_iterate_tokens0.join()
    result_iterate_tokens0 = queue_iterate_tokens0.get()
    tokens = result_iterate_tokens0
    A = int(next(tokens))
    B = int(next(tokens))
    C = int(next(tokens))
    D = int(next(tokens))
    solve(A, B, C, D)
if __name__ == '__main__':
    main()
```

Java code:

```java
import java.util.*;

public class Solution {
    public static void solve(int A, int B, int C, int D) {
        try {
            if (A == B) {
                if (C == D) {
                    System.out.println(A + " " + B + " " + C + " " + D);
                    return;
                }
            }
            if (A == C) {
                if (B == D) {
                    System.out.println(A + " " + B + " " + C + " " + D);
                    return;
                }
            }
            if (A == D) {
                if (B == C) {
                    System.out.println(A + " " + B + " " + C + " " + D);
                    return;
                }
            }
            System.out.println(A + " " + B + " " + C + " " + D);
        } catch (Exception e) {
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();
        solve(A, B, C, D);
    }
}
```

## 4.

The following code is written in Python.

```
def solve(A: int, B: int, C: int, D: int):
    try:
        if A == B:
            if C == D:
                print(A, B, C, D)
                return
        if A == C:
            if B == D:
                print(A, B, C, D)
                return
        if A == D:
            if B == C:
                print(A, B, C, D)
                return
        print(A, B, C, D)
    except:
        pass

def main():
    A = int(input())
    B = int(input())
    C = int(input())
    D = int(input())
    solve(A, B, C, D)

if __name__ == '__main__':
    main()
```

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
1
2
3
4

Expected output:
1 2 3 4


```
import threading
import queue
import sys

def solve(A: int, B: int, C: int, D: int):
    try:
        if A == B:
            if C == D:
                print(A, B, C, D)
                return
        if A == C:
            if B == D:
                print(A, B, C, D)
                return
        if A == D:
            if B == C:
                print(A, B, C, D)
                return
        print(A, B, C, D)
    except:
        pass

def main():

    def iterate_tokens():
        for line in sys.stdin:
            for word in line.split():
                yield word
    queue_iterate_tokens0 = queue.Queue()

    def iterate_tokens_thread(queue):
        result = iterate_tokens()
        queue.put(result)
    thread_iterate_tokens0 = threading.Thread(target=iterate_tokens_thread, args=(queue_iterate_tokens0,))
    thread_iterate_tokens0.start()
    thread_iterate_tokens0.join()
    result_iterate_tokens0 = queue_iterate_tokens0.get()
    tokens = result_iterate_tokens0
    A = int(next(tokens))
    B = int(next(tokens))
    C = int(next(tokens))
    D = int(next(tokens))
    solve(A, B, C, D)
if __name__ == '__main__':
    main()
```

Java code:

```java
import java.util.*;

public class Solution {
    public static void solve(int A, int B, int C, int D) {
        try {
            if (A == B) {
                if (C == D) {
                    System.out.println(A + " " + B + " " + C + " " + D);
                    return;
                }
            }
            if (A == C) {
                if (B == D) {
                    System.out.println(A + " " + B + " " + C + " " + D);
                    return;
                }
            }
            if (A == D) {
                if (B == C) {
                    System.out.println(A + " " + B + " " + C + " " + D);
                    return;
                }
            }
            System.out.println(A + " " + B + " " + C + " " + D);
        } catch (Exception e) {
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();
        solve(A, B, C, D);
    }
}
```

## 5.

The following code is written in Python.

```
def solve(A: int, B: int, C: int, D: int):
    try:
        if A == B:
            if C == D:
                print(A, B, C, D)
                return
        if A == C:
            if B == D:
                print(A, B, C, D)
                return
        if A == D:
            if B == C:
                print(A, B, C, D)
                return
        print(A, B, C, D)
    except:
        pass

def main():
    A = int(input())
    B = int(input())
    C = int(input())
    D = int(input())
    solve(A, B, C, D)

if __name__ == '__main__':
    main()
```

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
1
2
3
4

Expected output:
1 2 3 4


```
import threading
import queue
import sys

def solve(A: int, B: int, C: int, D: int):
    try:
        if A == B:
            if C == D:
                print(A, B, C, D)
                return
        if A == C:
            if B == D:
                print(A, B, C, D)
                return
        if A == D:
            if B == C:
                print(A, B, C, D)
                return
        print(A, B, C, D)
    except:
        pass

def main():

    def iterate_tokens():
        for line in sys.stdin:
            for word in line.split():
                yield word
    queue_iterate_tokens0 = queue.Queue()

    def iterate_tokens_thread(queue):
        result = iterate_tokens()
        queue.put(result)
    thread_iterate_tokens0 = threading.Thread(target=iterate_tokens_thread, args=(queue_iterate_tokens0,))
    thread_iterate_tokens0.start()
    thread_iterate_tokens0.join()
    result_iterate_tokens0 = queue_iterate_tokens0.get()
    tokens = result_iterate_tokens0
    A = int(next(tokens))
    B = int(next(tokens))
    C = int(next(tokens))
    D = int(next(tokens))
    solve(A, B, C, D)
if __name__ == '__main__':
    main()
```

Java code:

```java
import java.util.*;

public class Solution {
    public static void solve(int A, int B, int C, int D) {
        try {
            if (A == B) {
                if (C == D) {
                    System.out.println(A + " " + B + " " + C + " " + D);
                    return;
                }
            }
            if (A == C) {
                if (B == D) {
                    System.out.println(A + " " + B + " " + C + " " + D);
                    return;
                }
            }
            if (A == D) {
                if (B == C) {
                    System.out.println(A + " " + B + " " + C + " " + D);
                    return;
                }
            }
            System.out.println(A + " " + B + " " + C + " " + D);
        } catch (Exception e) {
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();
        solve(A, B, C, D);
    }
}
```

## 6.

The following code is written in Python.

```
def solve(
