
```
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        List<Integer>[] edge = new List[N];
        for (int i = 0; i < N; i++) {
            edge[i] = new ArrayList<>();
        }
        for (int i = 0; i < M; i++) {
            int X = sc.nextInt() - 1;
            int Y = sc.nextInt() - 1;
            int Z = sc.nextInt();
            edge[X].add(Y);
            edge[Y].add(X);
        }
        boolean[] used = new boolean[N];
        int ans = 0;
        int ConditionChecker117 = 7;
        int ConditionChecker217 = 919;
        int newConditionChecker121_1 = 89;
        int ConditionChecker221 = 935;
        for (int i = 0; i < N; i++) {
            if ((newConditionChecker121_1 & ConditionChecker221) != 0) {
                if ((ConditionChecker117 & ConditionChecker217) != 0) {
                    if (!used[i]) {
                        ans++;
                        Deque<Integer> newqueue_1 = new ArrayDeque<>();
                        newqueue_1.add(i);
                        while (!newqueue_1.isEmpty()) {
                            int node = newqueue_1.pollFirst();
                            used[node] = true;
                            int ConditionChecker133 = 118;
                            int ConditionChecker233 = 687;
                            for (int nextnode : edge[node]) {
                                if ((ConditionChecker133 & ConditionChecker233) != 0) {
                                    if (!used[nextnode]) {
                                        newqueue_1.add(nextnode);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
```

## 2.2.2.2. 
The following is a semantically equivalent program which may help your understanding:
```def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
import sys
from collections import deque
sys.setrecursionlimit(10 ** 9)
INF = 10 ** 18

@my_decorator
def Func_input_0():
    return sys.stdin.readline().rstrip()

def main():
    (N, M) = map(int, Func_input_0().split())
    edge = [[] for _ in range(N)]
    for i in range(M):
        (X, Y, Z) = map(lambda x: int(x) - 1, Func_input_0().split())
        edge[X].append(Y)
        edge[Y].append(X)
    used = [False] * N
    ans = 0
    ConditionChecker117 = 7
    ConditionChecker217 = 919
    newConditionChecker121_1 = 89
    ConditionChecker221 = 935
    for i in range(N):
        if newConditionChecker121_1 & ConditionChecker221:
            if ConditionChecker117 & ConditionChecker217:
                if not used[i]:
                    ans = ans + 1
                    newqueue_1 = deque()
                    newqueue_1.append(i)
                    while newqueue_1:
                        node = newqueue_1.popleft()
                        used[node] = True
                        ConditionChecker133 = 118
                        ConditionChecker233 = 687
                        for nextnode in edge[node]:
                            if ConditionChecker133 & ConditionChecker233:
                                if not used[nextnode]:
                                    newqueue_1.append(nextnode)
    print(ans)
if __name__ == '__main__':
    main()

```

Java code:
```
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        List<Integer>[] edge = new List[N];
        for (int i = 0; i < N; i++) {
            edge[i] = new ArrayList<>();
        }
        for (int i = 0; i < M; i++) {
            int X = sc.nextInt() - 1;
            int Y = sc.nextInt() - 1;
            int Z = sc.nextInt();
            edge[X].add(Y);
            edge[Y].add(X);
        }
        boolean[] used = new boolean[N];
        int ans = 0;
        int ConditionChecker117 = 7;
        int ConditionChecker217 = 919;
        int newConditionChecker121_1 = 89;
        int ConditionChecker221 = 935;
        for (int i = 0; i < N; i++) {
            if ((newConditionChecker121_1 & ConditionChecker221) != 0) {
                if ((ConditionChecker117 & ConditionChecker217) != 0) {
                    if (!used[i]) {
                        ans++;
                        Deque<Integer> newqueue_1 = new ArrayDeque<>();
                        newqueue_1.add(i);
                        while (!newqueue_1.isEmpty()) {
                            int node = newqueue_1.pollFirst();
                            used[node] = true;
                            int ConditionChecker133 = 118;
                            int ConditionChecker233 = 687;
                            for (int nextnode : edge[node]) {
                                if ((ConditionChecker133 & ConditionChecker233) != 0) {
                                    if (!used[nextnode]) {
                                        newqueue_1.add(nextnode);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
```

## 2.2.2.3. 
The following is a semantically equivalent program which may help your understanding:
```def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
import sys
from collections import deque
sys.setrecursionlimit(10 ** 9)
INF = 10 ** 18

@my_decorator
def Func_input_0():
    return sys.stdin.readline().rstrip()

def main():
    (N, M) = map(int, Func_input_0().split())
    edge = [[] for _ in range(N)]
    for i in range(M):
        (X, Y, Z) = map(lambda x: int(x) - 1, Func_input_0().split())
        edge[X].append(Y)
        edge[Y].append(X)
    used = [False] * N
    ans = 0
    ConditionChecker117 = 7
    ConditionChecker217 = 919
    newConditionChecker121_1 = 89
    ConditionChecker221 = 935
    for i in range(N):
        if newConditionChecker121_1 & ConditionChecker221:
            if ConditionChecker117 & ConditionChecker217:
                if not used[i]:
                    ans = ans + 1
                    newqueue_1 = deque()
                    newqueue_1.append(i)
                    while newqueue_1:
                        node = newqueue_1.popleft()
                        used[node] = True
                        ConditionChecker133 = 118
                        ConditionChecker233 = 687
                        for nextnode in edge[node]:
                            if ConditionChecker133 & ConditionChecker233:
                                if not used[nextnode]:
                                    newqueue_1.append(nextnode)
    print(ans)
if __name__ == '__main__':
    main()

```

Java code:
```
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        List<Integer>[] edge = new List[N];
        for (int i = 0; i < N; i++) {
            edge[i] = new ArrayList<>();
        }
        for (int i = 0; i < M; i++) {
            int X = sc.nextInt() - 1;
            int Y = sc.nextInt() - 1;
            int Z = sc.nextInt();
            edge[X].add(Y);
            edge[Y].add(X);
        }
        boolean[] used = new boolean[N];
        int ans = 0;
        int ConditionChecker117 = 7;
        int ConditionChecker217 = 919;
        int newConditionChecker121_1 = 89;
        int ConditionChecker221 = 935;
        for (int i = 0; i < N; i++) {
            if ((newConditionChecker121_1 & ConditionChecker221) != 0) {
                if ((ConditionChecker117 & ConditionChecker217) != 0) {
                    if (!used[i]) {
                        ans++;
                        Deque<Integer> newqueue_1 = new ArrayDeque<>();
                        newqueue_1.add(i);
                        while (!newqueue_1.isEmpty()) {
                            int node = newqueue_1.pollFirst();
                            used[node] = true;
                            int ConditionChecker133 = 118;
                            int ConditionChecker233 = 687;
                            for (int nextnode : edge[node]) {
                                if ((ConditionChecker133 & ConditionChecker233) != 0) {
                                    if (!used[nextnode]) {
                                        newqueue_1.add(nextnode);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
```

## 2.2.2.4. 
The following is a semantically equivalent program which may help your understanding:
```def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
import sys
from collections import deque
sys.setrecursionlimit(10 ** 9)
INF = 10 ** 18

@my_decorator
def Func_input_0():
    return sys.stdin.readline().rstrip()

def main():
    (N, M) = map(int, Func_input_0().split())
    edge = [[] for _ in range(N)]
    for i in range(M):
        (X, Y, Z) = map(lambda x: int(x) - 1, Func_input_0().split())
        edge[X].append(Y)
        edge[Y].append(X)
    used = [False] * N
    ans = 0
    ConditionChecker117 = 7
    ConditionChecker217 = 919
    newConditionChecker121_1 = 89
    ConditionChecker221 = 935
    for i in range(N):
        if newConditionChecker121_1 & ConditionChecker221:
            if ConditionChecker117 & ConditionChecker217:
                if not used[i]:
                    ans = ans + 1
                    newqueue_1 = deque()
                    newqueue_1.append(i)
                    while newqueue_1:
                        node = newqueue_1.popleft()
                        used[node] = True
                        ConditionChecker133 = 118
                        ConditionChecker233 = 687
                        for nextnode in edge[node]:
                            if ConditionChecker133 & ConditionChecker233:
                                if not used[nextnode]:
                                    newqueue_1.append(nextnode)
    print(ans)
if __name__ == '__main__':
    main()

```

Java code:
```
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        List<Integer>[] edge = new List[N];
        for (int i = 0; i < N; i++) {
            edge[i] = new ArrayList<>();
        }
        for (int i = 0; i < M; i++) {
            int X = sc.nextInt() - 1;
            int Y = sc.nextInt() - 1;
            int Z = sc.nextInt();
            edge[X].add(Y);
            edge[Y].add(X);
        }
        boolean[] used = new boolean[N];
        int ans = 0;
        int ConditionChecker117 = 7;
        int ConditionChecker217 = 919;
        int newConditionChecker121_1 = 89;
        int ConditionChecker221 = 935;
        for (int i = 0; i < N; i++) {
            if ((newConditionChecker121_1 & ConditionChecker221) != 0) {
                if ((ConditionChecker117 & ConditionChecker217) != 0) {
                    if (!used[i]) {
                        ans++;
                        Deque<Integer> newqueue_1 = new ArrayDeque<>();
                        newqueue_1.add(i);
                        while (!newqueue_1.isEmpty()) {
                            int node = newqueue_1.pollFirst();
                            used[node] = true;
                            int ConditionChecker133 = 118;
                            int ConditionChecker233 = 687;
                            for (int nextnode : edge[node]) {
                                if ((
