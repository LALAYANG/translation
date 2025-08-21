

```java
import java.util.*;

public class Solution {
    public static void solve(String S, String T, int A, int B, String U) {
        try {
            int check_one = 811;
            int check_two = 454;
            if ((check_one & check_two) != 0) {
                if (S.equals(U)) {
                    A = A - 1;
                }
            }
            if (T.equals(U)) {
                B -= 1;
            }
            System.out.println(A + " " + B);
            return;
        } catch (Exception e) {
            return;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        String T = scanner.next();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        String U = scanner.next();
        solve(S, T, A, B, U);
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
        return
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
        return
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
    token_generator = queue_iterate_tokens0.get()
    tokens = token_generator
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
            return;
        } catch (Exception e) {
            return;
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
        return
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
        return
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
    token_generator = queue_iterate_tokens0.get()
    tokens = token_generator
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
            return;
        } catch (Exception e) {
            return;
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
        return
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
        return
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
    token_generator = queue_iterate_tokens0.get()
    tokens = token_generator
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
            return;
        } catch (Exception e) {
            return;
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
        return
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
        return
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
    token_generator = queue_iterate_tokens0.get()
    tokens = token_generator
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
            return;
        } catch (Exception e) {
            return;
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

The following code is written in Python
