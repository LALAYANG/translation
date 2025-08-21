

```
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int[][] answer = new int[H][W];
        int primaryConditionalChecker = 967;
        int secondaryConditionalChecker = 638;
        int conditionalCheckerOne = 555;
        int conditionalCheckerTwo = 438;
        for (int i = 0; i < H; i++) {
            for (int horizontalIterator = 0; horizontalIterator < W; horizontalIterator++) {
                if ((conditionalCheckerOne & conditionalCheckerTwo) != 0) {
                    if ((primaryConditionalChecker & secondaryConditionalChecker) != 0) {
                        if (i < B) {
                            if (horizontalIterator < A) {
                                answer[i][horizontalIterator] = 0;
                            } else {
                                answer[i][horizontalIterator] = 1;
                            }
                        } else if (horizontalIterator < A) {
                            answer[i][horizontalIterator] = 1;
                        } else {
                            answer[i][horizontalIterator] = 0;
                        }
                    }
                }
            }
        }
        for (int i = 0; i < H; i++) {
            for (int horizontalIterator = 0; horizontalIterator < W; horizontalIterator++) {
                System.out.print(answer[i][horizontalIterator]);
            }
            System.out.println();
        }
    }
}
```

## 2.

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
1 1 0 0

Expected output:
0


```
import threading
import queue
import sys

def solve(H: int, W: int, A: int, B: int):
    answer = [['0'] * W for _ in range(H)]
    primaryConditionalChecker = 967
    secondaryConditionalChecker = 638
    conditionalCheckerOne = 555
    conditionalCheckerTwo = 438
    for i in range(H):
        for horizontalIterator in range(W):
            if conditionalCheckerOne & conditionalCheckerTwo:
                if primaryConditionalChecker & secondaryConditionalChecker:
                    if i < B:
                        if horizontalIterator < A:
                            answer[i][horizontalIterator] = '0'
                        else:
                            answer[i][horizontalIterator] = '1'
                    elif horizontalIterator < A:
                        answer[i][horizontalIterator] = '1'
                    else:
                        answer[i][horizontalIterator] = '0'
    for i in range(H):
        print(''.join(answer[i]))
    return

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
    H = int(next(tokens))
    W = int(next(tokens))
    A = int(next(tokens))
    B = int(next(tokens))
    solve(H, W, A, B)
if __name__ == '__main__':
    main()
```

Java code:

```
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int[][] answer = new int[H][W];
        int primaryConditionalChecker = 967;
        int secondaryConditionalChecker = 638;
        int conditionalCheckerOne = 555;
        int conditionalCheckerTwo = 438;
        for (int i = 0; i < H; i++) {
            for (int horizontalIterator = 0; horizontalIterator < W; horizontalIterator++) {
                if ((conditionalCheckerOne & conditionalCheckerTwo) != 0) {
                    if ((primaryConditionalChecker & secondaryConditionalChecker) != 0) {
                        if (i < B) {
                            if (horizontalIterator < A) {
                                answer[i][horizontalIterator] = 0;
                            } else {
                                answer[i][horizontalIterator] = 1;
                            }
                        } else if (horizontalIterator < A) {
                            answer[i][horizontalIterator] = 1;
                        } else {
                            answer[i][horizontalIterator] = 0;
                        }
                    }
                }
            }
        }
        for (int i = 0; i < H; i++) {
            for (int horizontalIterator = 0; horizontalIterator < W; horizontalIterator++) {
                System.out.print(answer[i][horizontalIterator]);
            }
            System.out.println();
        }
    }
}
```

## 3.

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
1 1 0 0

Expected output:
0


```
import threading
import queue
import sys

def solve(H: int, W: int, A: int, B: int):
    answer = [['0'] * W for _ in range(H)]
    primaryConditionalChecker = 967
    secondaryConditionalChecker = 638
    conditionalCheckerOne = 555
    conditionalCheckerTwo = 438
    for i in range(H):
        for horizontalIterator in range(W):
            if conditionalCheckerOne & conditionalCheckerTwo:
                if primaryConditionalChecker & secondaryConditionalChecker:
                    if i < B:
                        if horizontalIterator < A:
                            answer[i][horizontalIterator] = '0'
                        else:
                            answer[i][horizontalIterator] = '1'
                    elif horizontalIterator < A:
                        answer[i][horizontalIterator] = '1'
                    else:
                        answer[i][horizontalIterator] = '0'
    for i in range(H):
        print(''.join(answer[i]))
    return

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
    H = int(next(tokens))
    W = int(next(tokens))
    A = int(next(tokens))
    B = int(next(tokens))
    solve(H, W, A, B)
if __name__ == '__main__':
    main()
```

Java code:

```
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int[][] answer = new int[H][W];
        int primaryConditionalChecker = 967;
        int secondaryConditionalChecker = 638;
        int conditionalCheckerOne = 555;
        int conditionalCheckerTwo = 438;
        for (int i = 0; i < H; i++) {
            for (int horizontalIterator = 0; horizontalIterator < W; horizontalIterator++) {
                if ((conditionalCheckerOne & conditionalCheckerTwo) != 0) {
                    if ((primaryConditionalChecker & secondaryConditionalChecker) != 0) {
                        if (i < B) {
                            if (horizontalIterator < A) {
                                answer[i][horizontalIterator] = 0;
                            } else {
                                answer[i][horizontalIterator] = 1;
                            }
                        } else if (horizontalIterator < A) {
                            answer[i][horizontalIterator] = 1;
                        } else {
                            answer[i][horizontalIterator] = 0;
                        }
                    }
                }
            }
        }
        for (int i = 0; i < H; i++) {
            for (int horizontalIterator = 0; horizontalIterator < W; horizontalIterator++) {
                System.out.print(answer[i][horizontalIterator]);
            }
            System.out.println();
        }
    }
}
```

## 4.

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
1 1 0 0

Expected output:
0


```
import threading
import queue
import sys

def solve(H: int, W: int, A: int, B: int):
    answer = [['0'] * W for _ in range(H)]
    primaryConditionalChecker = 967
    secondaryConditionalChecker = 638
    conditionalCheckerOne = 555
    conditionalCheckerTwo = 438
    for i in range(H):
        for horizontalIterator in range(W):
            if conditionalCheckerOne & conditionalCheckerTwo:
                if primaryConditionalChecker & secondaryConditionalChecker:
                    if i < B:
                        if horizontalIterator < A:
                            answer[i][horizontalIterator] = '0'
                        else:
                            answer[i][horizontalIterator] = '1'
                    elif horizontalIterator < A:
                        answer[i][horizontalIterator] = '1'
                    else:
                        answer[i][horizontalIterator] = '0'
    for i in range(H):
        print(''.join(answer[i]))
    return

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
    H = int(next(tokens))
    W = int(next(tokens))
    A = int(next(tokens))
    B = int(next(tokens))
    solve(H, W, A, B)
if __name__ == '__main__':
    main()
```

Java code:

```
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int[][] answer = new int[H][W];
        int primaryConditionalChecker = 967;
        int secondaryConditionalChecker = 638;
        int conditionalCheckerOne = 555;
        int conditionalCheckerTwo = 438;
        for (int i = 0; i < H; i++) {
            for (int horizontalIterator = 0; horizontalIterator < W; horizontalIterator++) {
                if ((conditionalCheckerOne & conditionalCheckerTwo) != 0) {
                    if ((primaryConditionalChecker & secondaryConditionalChecker) != 0) {
                        if (i < B) {
                            if (horizontalIterator < A) {
                                answer[i][horizontalIterator] = 0;
                            } else {
                                answer[i][horizontalIterator] = 1;
                            }
                        } else if (horizontalIterator < A) {
                            answer[i][horizontalIterator] = 1;
                        } else {
                            answer[i][horizontalIterator] = 0;
                        }
                    }
                }
            }
        }
        for (int i = 0; i < H; i++) {
            for (int horizontalIterator = 0; horizontalIterator < W; horizontalIterator++) {
                System.out.print(answer[i][horizontalIterator]);
            }
            System.out.println();
        }
    }
}
```

## 5.

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
1 1 0 0

Expected output:
0


```
import threading
import queue
import sys

def solve(H: int, W: int, A: int, B: int):
    answer = [['0'] * W for _ in range(H)]
    primaryConditionalChecker = 967
    secondaryConditionalChecker = 638
    conditionalCheckerOne = 555
    conditionalCheckerTwo = 438
    for i in range(H):
        for horizontalIterator in range(W):
            if conditionalCheckerOne & conditionalCheckerTwo:
                if primaryConditionalChecker & secondaryConditionalChecker:
                    if i < B:
                        if horizontalIterator < A:
                            answer[i][horizontalIterator] = '0'
                        else:
                            answer[i][horizontalIterator] = '1'
                    elif horizontalIterator < A:
                        answer[i][horizontalIterator] = '1'
                    else:
                        answer[i][horizontalIterator] = '0'
    for i in range(H):
        print(''.join(answer[i]))
    return

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
    H = int(next(tokens))
    W = int(next(tokens))
    A = int(next(tokens))
    B = int(next(tokens))
    solve(H, W, A, B)
if __name__ == '__main__':
    main()
```

Java code:

```
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int[][] answer = new int[H][W];
        int primaryConditionalChecker = 967;
        int secondaryConditionalChecker = 638;
        int conditionalCheckerOne = 555;
        int conditionalCheckerTwo = 438;
        for (int i = 0; i < H; i++) {
            for (int horizontalIterator = 0; horizontalIterator < W; horizontalIterator++) {
                if ((conditionalCheckerOne & conditionalCheckerTwo) != 0) {
                    if ((primaryConditionalChecker & secondaryConditionalChecker) != 0) {
                        if (i < B) {
                            if (horizontalIterator < A) {
                                answer[i][horizontalIterator] = 0;
                            } else {
                                answer[i][horizontalIterator] = 1;
                            }
                        } else if (horizontalIterator < A) {
                            answer[i][horizontalIterator] = 1;
                        } else {
                            answer[i][horizontalIterator] = 0;
                        }
                    }
                }
            }
        }
        for (int i = 0; i < H
