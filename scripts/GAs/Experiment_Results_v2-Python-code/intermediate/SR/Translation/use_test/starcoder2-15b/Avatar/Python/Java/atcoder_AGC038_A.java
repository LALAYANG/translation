

```
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        solve(H, W, A, B);
    }

    public static void solve(int H, int W, int A, int B) {
        String[][] answer = new String[H][W];
        int checkFour = 389;
        int checkThree = 451;
        int checkOne = 914;
        int checkTwo = 237;
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if ((checkOne & checkTwo) != 0) {
                    if ((checkFour & checkThree) != 0) {
                        if (i < B) {
                            if (j < A) {
                                answer[i][j] = "0";
                            } else {
                                answer[i][j] = "1";
                            }
                        } else if (j < A) {
                            answer[i][j] = "1";
                        } else {
                            answer[i][j] = "0";
                        }
                    }
                }
            }
        }
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                System.out.print(answer[i][j]);
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
    checkFour = 389
    checkThree = 451
    checkOne = 914
    checkTwo = 237
    for i in range(H):
        for j in range(W):
            if checkOne & checkTwo:
                if checkFour & checkThree:
                    if i < B:
                        if j < A:
                            answer[i][j] = '0'
                        else:
                            answer[i][j] = '1'
                    elif j < A:
                        answer[i][j] = '1'
                    else:
                        answer[i][j] = '0'
    for i in range(H):
        print(''.join(answer[i]))
    return

def main():

    def iterateTokens():
        for line in sys.stdin:
            for word in line.split():
                yield word
    queue_iterateTokens0 = queue.Queue()

    def iterateTokens_thread(queue):
        result = iterateTokens()
        queue.put(result)
    thread_iterateTokens0 = threading.Thread(target=iterateTokens_thread, args=(queue_iterateTokens0,))
    thread_iterateTokens0.start()
    thread_iterateTokens0.join()
    result_iterateTokens0 = queue_iterateTokens0.get()
    tokens = result_iterateTokens0
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
        solve(H, W, A, B);
    }

    public static void solve(int H, int W, int A, int B) {
        String[][] answer = new String[H][W];
        int checkFour = 389;
        int checkThree = 451;
        int checkOne = 914;
        int checkTwo = 237;
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if ((checkOne & checkTwo) != 0) {
                    if ((checkFour & checkThree) != 0) {
                        if (i < B) {
                            if (j < A) {
                                answer[i][j] = "0";
                            } else {
                                answer[i][j] = "1";
                            }
                        } else if (j < A) {
                            answer[i][j] = "1";
                        } else {
                            answer[i][j] = "0";
                        }
                    }
                }
            }
        }
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                System.out.print(answer[i][j]);
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
    checkFour = 389
    checkThree = 451
    checkOne = 914
    checkTwo = 237
    for i in range(H):
        for j in range(W):
            if checkOne & checkTwo:
                if checkFour & checkThree:
                    if i < B:
                        if j < A:
                            answer[i][j] = '0'
                        else:
                            answer[i][j] = '1'
                    elif j < A:
                        answer[i][j] = '1'
                    else:
                        answer[i][j] = '0'
    for i in range(H):
        print(''.join(answer[i]))
    return

def main():

    def iterateTokens():
        for line in sys.stdin:
            for word in line.split():
                yield word
    queue_iterateTokens0 = queue.Queue()

    def iterateTokens_thread(queue):
        result = iterateTokens()
        queue.put(result)
    thread_iterateTokens0 = threading.Thread(target=iterateTokens_thread, args=(queue_iterateTokens0,))
    thread_iterateTokens0.start()
    thread_iterateTokens0.join()
    result_iterateTokens0 = queue_iterateTokens0.get()
    tokens = result_iterateTokens0
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
        solve(H, W, A, B);
    }

    public static void solve(int H, int W, int A, int B) {
        String[][] answer = new String[H][W];
        int checkFour = 389;
        int checkThree = 451;
        int checkOne = 914;
        int checkTwo = 237;
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if ((checkOne & checkTwo) != 0) {
                    if ((checkFour & checkThree) != 0) {
                        if (i < B) {
                            if (j < A) {
                                answer[i][j] = "0";
                            } else {
                                answer[i][j] = "1";
                            }
                        } else if (j < A) {
                            answer[i][j] = "1";
                        } else {
                            answer[i][j] = "0";
                        }
                    }
                }
            }
        }
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                System.out.print(answer[i][j]);
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
    checkFour = 389
    checkThree = 451
    checkOne = 914
    checkTwo = 237
    for i in range(H):
        for j in range(W):
            if checkOne & checkTwo:
                if checkFour & checkThree:
                    if i < B:
                        if j < A:
                            answer[i][j] = '0'
                        else:
                            answer[i][j] = '1'
                    elif j < A:
                        answer[i][j] = '1'
                    else:
                        answer[i][j] = '0'
    for i in range(H):
        print(''.join(answer[i]))
    return

def main():

    def iterateTokens():
        for line in sys.stdin:
            for word in line.split():
                yield word
    queue_iterateTokens0 = queue.Queue()

    def iterateTokens_thread(queue):
        result = iterateTokens()
        queue.put(result)
    thread_iterateTokens0 = threading.Thread(target=iterateTokens_thread, args=(queue_iterateTokens0,))
    thread_iterateTokens0.start()
    thread_iterateTokens0.join()
    result_iterateTokens0 = queue_iterateTokens0.get()
    tokens = result_iterateTokens0
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
        solve(H, W, A, B);
    }

    public static void solve(int H, int W, int A, int B) {
        String[][] answer = new String[H][W];
        int checkFour = 389;
        int checkThree = 451;
        int checkOne = 914;
        int checkTwo = 237;
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if ((checkOne & checkTwo) != 0) {
                    if ((checkFour & checkThree) != 0) {
                        if (i < B) {
                            if (j < A) {
                                answer[i][j] = "0";
                            } else {
                                answer[i][j] = "1";
                            }
                        } else if (j < A) {
                            answer[i][j] = "1";
                        } else {
                            answer[i][j] = "0";
                        }
                    }
                }
            }
        }
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                System.out.print(answer[i][j]);
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
    checkFour = 389
    checkThree = 451
    checkOne = 914
    checkTwo = 237
    for i in range(H):
        for j in range(W):
            if checkOne & checkTwo:
                if checkFour & checkThree:
                    if i < B:
                        if j < A:
                            answer[i][j] = '0'
                        else:
                            answer[i][j] = '1'
                    elif j < A:
                        answer[i][j] = '1'
                    else:
                        answer[i][j] = '0'
    for i in range(H):
        print(''.join(answer[i]))
    return

def main():

    def iterateTokens():
        for line in sys.stdin:
            for word in line.split():
                yield word
    queue_iterateTokens0 = queue.Queue()

    def iterateTokens_thread(queue):
        result = iterateTokens()
        queue.put(result)
    thread_iterateTokens0 = threading.Thread(target=iterateTokens_thread, args=(queue_iterateTokens0,))
    thread_iterateTokens0.start()
    thread_iterateTokens0.join()
    result_iterateTokens0 = queue_iterateTokens0.get()
    tokens = result_iterateTokens0
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
        solve(H, W, A, B);
    }

    public static void solve(int H, int W, int A, int B) {
        String[][] answer = new String[H][W];
        int checkFour = 389;
        int checkThree = 451;
        int checkOne = 914;
        int checkTwo = 237;
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if ((checkOne & checkTwo) != 0) {
                    if ((checkFour & checkThree) != 0) {
                        if (i < B) {
                            if (j < A) {
                                answer[i][j] = "0";
                            } else {
                                answer[i][j] = "1";
                            }
                        } else if (j < A) {
                            answer[i][j] = "1";
                        } else {
                            answer[i][j] = "0";
                        }
                    }
                }
            }
        }
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                System.out.print(answer[i][j]);
            }
            System.out.println();
        }
    }
}
```

## 6.

Translate the following Python code to Java and enclose your solution inside ```java and ```.
