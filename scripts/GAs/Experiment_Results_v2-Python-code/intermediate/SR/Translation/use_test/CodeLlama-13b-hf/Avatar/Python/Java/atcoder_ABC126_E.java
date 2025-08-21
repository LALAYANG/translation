
[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
6 5
1 2 1
2 3 2
1 3 3
4 5 4
5 6 5

Expected output:
2


```
def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
import sys
from collections import deque
sys.setrecursionlimit(10 ** 9)
INF = 10 ** 18

@my_decorator
def get_input():
    return sys.stdin.readline().rstrip()

def main():
    (N, M) = map(int, get_input().split())
    edge = [[] for _ in range(N)]
    for idx in range(M):
        (X, Y, Z) = map(lambda x: int(x) - 1, get_input().split())
        edge[X].append(Y)
        edge[Y].append(X)
    used = [False] * N
    ans = 0
    checker_one = 229
    checker_two = 524
    for idx in range(N):
        if checker_one & checker_two:
            if not used[idx]:
                ans += 1
                queue = deque()
                queue.append(idx)
                while queue:
                    node = queue.popleft()
                    used[node] = True
                    for nextnode in edge[node]:
                        if not used[nextnode]:
                            queue.append(nextnode)
    print(ans)
if __name__ == '__main__':
    main()
```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
6 5
1 2 1
2 3 2
1 3 3
4 5 4
5 6 5

Expected output:
2


```
def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
import sys
from collections import deque
sys.setrecursionlimit(10 ** 9)
INF = 10 ** 18

@my_decorator
def get_input():
    return sys.stdin.readline().rstrip()

def main():
    (N, M) = map(int, get_input().split())
    edge = [[] for _ in range(N)]
    for idx in range(M):
        (X, Y, Z) = map(lambda x: int(x) - 1, get_input().split())
        edge[X].append(Y)
        edge[Y].append(X)
    used = [False] * N
    ans = 0
    checker_one = 229
    checker_two = 524
    for idx in range(N):
        if checker_one & checker_two:
            if not used[idx]:
                ans += 1
                queue = deque()
                queue.append(idx)
                while queue:
                    node = queue.popleft()
                    used[node] = True
                    for nextnode in edge[node]:
                        if not used[nextnode]:
                            queue.append(nextnode)
    print(ans)
if __name__ == '__main__':
    main()
```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
6 5
1 2 1
2 3 2
1 3 3
4 5 4
5 6 5

Expected output:
2


```
def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
import sys
from collections import deque
sys.setrecursionlimit(10 ** 9)
INF = 10 ** 18

@my_decorator
def get_input():
    return sys.stdin.readline().rstrip()

def main():
    (N, M) = map(int, get_input().split())
    edge = [[] for _ in range(N)]
    for idx in range(M):
        (X, Y, Z) = map(lambda x: int(x) - 1, get_input().split())
        edge[X].append(Y)
        edge[Y].append(X)
    used = [False] * N
    ans = 0
    checker_one = 229
    checker_two = 524
    for idx in range(N):
        if checker_one & checker_two:
            if not used[idx]:
                ans += 1
                queue = deque()
                queue.append(idx)
                while queue:
                    node = queue.popleft()
                    used[node] = True
                    for nextnode in edge[node]:
                        if not used[nextnode]:
                            queue.append(nextnode)
    print(ans)
if __name__ == '__main__':
    main()
```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
6 5
1 2 1
2 3 2
1 3 3
4 5 4
5 6 5

Expected output:
2


```
def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
import sys
from collections import deque
sys.setrecursionlimit(10 ** 9)
INF = 10 ** 18

@my_decorator
def get_input():
    return sys.stdin.readline().rstrip()

def main():
    (N, M) = map(int, get_input().split())
    edge = [[] for _ in range(N)]
    for idx in range(M):
        (X, Y, Z) = map(lambda x: int(x) - 1, get_input().split())
        edge[X].append(Y)
        edge[Y].append(X)
    used = [False] * N
    ans = 0
    checker_one = 229
    checker_two = 524
    for idx in range(N):
        if checker_one & checker_two:
            if not used[idx]:
                ans += 1
                queue = deque()
                queue.append(idx)
                while queue:
                    node = queue.popleft()
                    used[node] = True
                    for nextnode in edge[node]:
                        if not used[nextnode]:
                            queue.append(nextnode)
    print(ans)
if __name__ == '__main__':
    main()
```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
6 5
1 2 1
2 3 2
1 3 3
4 5 4
5 6 5

Expected output:
2


```
def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
import sys
from collections import deque
sys.setrecursionlimit(10 ** 9)
INF = 10 ** 18

@my_decorator
def get_input():
    return sys.stdin.readline().rstrip()

def main():
    (N, M) = map(int, get_input().split())
    edge = [[] for _ in range(N)]
    for idx in range(M):
        (X, Y, Z) = map(lambda x: int(x) - 1, get_input().split())
        edge[X].append(Y)
        edge[Y].append(X)
    used = [False] * N
    ans = 0
    checker_one = 229
    checker_two = 524
    for idx in range(N):
        if checker_one & checker_two:
            if not used[idx]:
                ans += 1
                queue = deque()
                queue.append(idx)
                while queue:
                    node = queue.popleft()
                    used[node] = True
                    for nextnode in edge[node]:
                        if not used[nextnode]:
                            queue.append(nextnode)
    print(ans)
if __name__ == '__main__':
    main()
```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
6 5
1 2 1
2 3 2
1 3 3
4 5 4
5 6 5

Expected output:
2


```
def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
import sys
from collections import deque
sys.setrecursionlimit(10 ** 9)
INF = 10 ** 18

@my_decorator
def get_input():
    return sys.stdin.readline().rstrip()

def main():
    (N, M) = map(int, get_input().split())
    edge = [[] for _ in range(N)]
    for idx in range(M):
        (X, Y, Z) = map(lambda x: int(x) - 1, get_input().split())
        edge[X].append(Y)
        edge[Y].append(X)
    used = [False] * N
    ans = 0
    checker_one = 229
    checker_two = 524
    for idx in range(N):
        if checker_one & checker_two:
            if not used[idx]:
                ans += 1
                queue = deque()
                queue.append(idx)
                while queue:
                    node = queue.popleft()
                    used[node] = True
                    for nextnode in edge[node]:
                        if not used[nextnode]:
                            queue.append(nextnode)
    print(ans)
if __name__ == '__main__':
    main()
```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
6 5
1 2 1
2 3 2
1 3 3
4 5 4
5 6 5

Expected output:
2


```
def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
import sys
from collections import deque
sys.setrecursionlimit(10 ** 9)
INF = 10 ** 18

@my_decorator
def get_input():
    return sys.stdin.readline().rstrip()

def main():
    (N, M) = map(int, get_input().split())
    edge = [[] for _ in range(N)]
    for idx in range(M):
        (X, Y, Z) = map(lambda x: int(x) - 1, get_input().split())
        edge[X].append(Y)
        edge[Y].append(X)
    used = [False] * N
    ans = 0
    checker_one = 229
    checker_two = 524
    for idx in range(N):
        if checker_one & checker_two:
            if not used[idx]:
                ans += 1
                queue = deque()
                queue.append(idx)
                while queue:
                    node = queue.popleft()
                    used[node] = True
                    for nextnode in edge[node]:
                        if not used[nextnode]:
                            queue.append(nextnode)
    print(ans)
if __name__ == '__main__':
    main()
```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
6 5
1 2 1
2 3 2
1 3 3
4 5 4
5 6 5

Expected output:
2


```
def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
import sys
from collections import deque
sys.setrecursionlimit(10 ** 9)
INF = 10 ** 18

@my_decorator
def get_input():
    return sys.stdin.readline().rstrip()

def main():
    (N, M) = map(int, get_input().split())
    edge = [[] for _ in range(N)]
    for idx in range(M):
        (X, Y, Z) = map(lambda x: int(x) - 1, get_input().split())
        edge[X].append(Y)
        edge[Y].append(X)
   
