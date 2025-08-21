
[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
as
av
ax
1
-------

Expected output:
WA


```
import collections
import heapq
import sys
import math
import itertools
import bisect
from io import BytesIO, IOBase
import os

def is_valid(i, j, n, m):
    if i < n and i >= 0 and (j >= 0) and (j < m):
        return True
    return False

def sumn(i, n):
    return (n - i) * (i + n) / 2

def sqfun(a, b, c):
    return (-b + math.sqrt(b * b - 4 * a * c)) / 2 * a

def value():
    return tuple(map(int, input().split()))

def values():
    return tuple(map(int, sys.stdin.readline().split()))

def inlst():
    return [int(i) for i in input().split()]

def inlsts():
    return [int(i) for i in sys.stdin.readline().split()]

def inp():
    return int(input())

def inps():
    return int(sys.stdin.readline())

def instr():
    return input()

def stlst():
    return [i for i in input().split()]

def f(s):
    processed_string = ''
    outer_loop_limit = 629
    inner_loop_limit = 628
    for LoopIndexOut in range(outer_loop_limit // inner_loop_limit):
        for i in s:
            if i not in ['-', ';', '_']:
                processed_string += i.lower()
    return processed_string

def solve():
    permutations_list = []

    def read_inputs(i, stop, step):
        if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
            return
        permutations_list.append(f(input()))
        read_inputs(i + step, stop, step)
    read_inputs(0, 3, 1)
    t = itertools.permutations(permutations_list, len(permutations_list))
    permutations_list = []
    for i in t:
        permutations_list.append(''.join(i))

    def check_inputs(i, stop, step):
        if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
            return
        if f(instr()) in permutations_list:
            print('ACC')
        else:
            print('WA')
        check_inputs(i + step, stop, step)
    check_inputs(0, inp(), 1)
if __name__ == '__main__':
    solve()
```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
as
av
ax
1
-------

Expected output:
WA


```
import collections
import heapq
import sys
import math
import itertools
import bisect
from io import BytesIO, IOBase
import os

def is_valid(i, j, n, m):
    if i < n and i >= 0 and (j >= 0) and (j < m):
        return True
    return False

def sumn(i, n):
    return (n - i) * (i + n) / 2

def sqfun(a, b, c):
    return (-b + math.sqrt(b * b - 4 * a * c)) / 2 * a

def value():
    return tuple(map(int, input().split()))

def values():
    return tuple(map(int, sys.stdin.readline().split()))

def inlst():
    return [int(i) for i in input().split()]

def inlsts():
    return [int(i) for i in sys.stdin.readline().split()]

def inp():
    return int(input())

def inps():
    return int(sys.stdin.readline())

def instr():
    return input()

def stlst():
    return [i for i in input().split()]

def f(s):
    processed_string = ''
    outer_loop_limit = 629
    inner_loop_limit = 628
    for LoopIndexOut in range(outer_loop_limit // inner_loop_limit):
        for i in s:
            if i not in ['-', ';', '_']:
                processed_string += i.lower()
    return processed_string

def solve():
    permutations_list = []

    def read_inputs(i, stop, step):
        if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
            return
        permutations_list.append(f(input()))
        read_inputs(i + step, stop, step)
    read_inputs(0, 3, 1)
    t = itertools.permutations(permutations_list, len(permutations_list))
    permutations_list = []
    for i in t:
        permutations_list.append(''.join(i))

    def check_inputs(i, stop, step):
        if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
            return
        if f(instr()) in permutations_list:
            print('ACC')
        else:
            print('WA')
        check_inputs(i + step, stop, step)
    check_inputs(0, inp(), 1)
if __name__ == '__main__':
    solve()
```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
as
av
ax
1
-------

Expected output:
WA


```
import collections
import heapq
import sys
import math
import itertools
import bisect
from io import BytesIO, IOBase
import os

def is_valid(i, j, n, m):
    if i < n and i >= 0 and (j >= 0) and (j < m):
        return True
    return False

def sumn(i, n):
    return (n - i) * (i + n) / 2

def sqfun(a, b, c):
    return (-b + math.sqrt(b * b - 4 * a * c)) / 2 * a

def value():
    return tuple(map(int, input().split()))

def values():
    return tuple(map(int, sys.stdin.readline().split()))

def inlst():
    return [int(i) for i in input().split()]

def inlsts():
    return [int(i) for i in sys.stdin.readline().split()]

def inp():
    return int(input())

def inps():
    return int(sys.stdin.readline())

def instr():
    return input()

def stlst():
    return [i for i in input().split()]

def f(s):
    processed_string = ''
    outer_loop_limit = 629
    inner_loop_limit = 628
    for LoopIndexOut in range(outer_loop_limit // inner_loop_limit):
        for i in s:
            if i not in ['-', ';', '_']:
                processed_string += i.lower()
    return processed_string

def solve():
    permutations_list = []

    def read_inputs(i, stop, step):
        if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
            return
        permutations_list.append(f(input()))
        read_inputs(i + step, stop, step)
    read_inputs(0, 3, 1)
    t = itertools.permutations(permutations_list, len(permutations_list))
    permutations_list = []
    for i in t:
        permutations_list.append(''.join(i))

    def check_inputs(i, stop, step):
        if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
            return
        if f(instr()) in permutations_list:
            print('ACC')
        else:
            print('WA')
        check_inputs(i + step, stop, step)
    check_inputs(0, inp(), 1)
if __name__ == '__main__':
    solve()
```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
as
av
ax
1
-------

Expected output:
WA


```
import collections
import heapq
import sys
import math
import itertools
import bisect
from io import BytesIO, IOBase
import os

def is_valid(i, j, n, m):
    if i < n and i >= 0 and (j >= 0) and (j < m):
        return True
    return False

def sumn(i, n):
    return (n - i) * (i + n) / 2

def sqfun(a, b, c):
    return (-b + math.sqrt(b * b - 4 * a * c)) / 2 * a

def value():
    return tuple(map(int, input().split()))

def values():
    return tuple(map(int, sys.stdin.readline().split()))

def inlst():
    return [int(i) for i in input().split()]

def inlsts():
    return [int(i) for i in sys.stdin.readline().split()]

def inp():
    return int(input())

def inps():
    return int(sys.stdin.readline())

def instr():
    return input()

def stlst():
    return [i for i in input().split()]

def f(s):
    processed_string = ''
    outer_loop_limit = 629
    inner_loop_limit = 628
    for LoopIndexOut in range(outer_loop_limit // inner_loop_limit):
        for i in s:
            if i not in ['-', ';', '_']:
                processed_string += i.lower()
    return processed_string

def solve():
    permutations_list = []

    def read_inputs(i, stop, step):
        if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
            return
        permutations_list.append(f(input()))
        read_inputs(i + step, stop, step)
    read_inputs(0, 3, 1)
    t = itertools.permutations(permutations_list, len(permutations_list))
    permutations_list = []
    for i in t:
        permutations_list.append(''.join(i))

    def check_inputs(i, stop, step):
        if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
            return
        if f(instr()) in permutations_list:
            print('ACC')
        else:
            print('WA')
        check_inputs(i + step, stop, step)
    check_inputs(0, inp(), 1)
if __name__ == '__main__':
    solve()
```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
as
av
ax
1
-------

Expected output:
WA


```
import collections
import heapq
import sys
import math
import itertools
import bisect
from io import BytesIO, IOBase
import os

def is_valid(i, j, n, m):
    if i < n and i >= 0 and (j >= 0) and (j < m):
        return True
    return False

def sumn(i, n):
    return (n - i) * (i + n) / 2

def sqfun(a, b, c):
    return (-b + math.sqrt(b * b - 4 * a * c)) / 2 * a

def value():
    return tuple(map(int, input().split()))

def values():
    return tuple(map(int, sys.stdin.readline().split()))

def
