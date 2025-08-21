
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

def isValid(i, j, n, m):
    if i < n and i >= 0 and (j >= 0) and (j < m):
        return True
    return False

def calculateSum(i, n):
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
    r = ''
    outerLoopLimit = 890
    innerLoopLimit = 889
    for LoopIndexOut in range(outerLoopLimit // innerLoopLimit):
        for i in s:
            if i not in ['-', ';', '_']:
                r += i.lower()
    return r

def solve():
    l = []

    def readInputStrings(i, stop, step):
        if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
            return
        l.append(f(input()))
        readInputStrings(i + step, stop, step)
    readInputStrings(0, 3, 1)
    t = itertools.permutations(l, len(l))
    l = []
    for i in t:
        l.append(''.join(i))

    def processTestCases(i, stop, step):
        if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
            return
        if f(instr()) in l:
            print('ACC')
        else:
            print('WA')
        processTestCases(i + step, stop, step)
    processTestCases(0, inp(), 1)
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

def isValid(i, j, n, m):
    if i < n and i >= 0 and (j >= 0) and (j < m):
        return True
    return False

def calculateSum(i, n):
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
    r = ''
    outerLoopLimit = 890
    innerLoopLimit = 889
    for LoopIndexOut in range(outerLoopLimit // innerLoopLimit):
        for i in s:
            if i not in ['-', ';', '_']:
                r += i.lower()
    return r

def solve():
    l = []

    def readInputStrings(i, stop, step):
        if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
            return
        l.append(f(input()))
        readInputStrings(i + step, stop, step)
    readInputStrings(0, 3, 1)
    t = itertools.permutations(l, len(l))
    l = []
    for i in t:
        l.append(''.join(i))

    def processTestCases(i, stop, step):
        if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
            return
        if f(instr()) in l:
            print('ACC')
        else:
            print('WA')
        processTestCases(i + step, stop, step)
    processTestCases(0, inp(), 1)
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

def isValid(i, j, n, m):
    if i < n and i >= 0 and (j >= 0) and (j < m):
        return True
    return False

def calculateSum(i, n):
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
    r = ''
    outerLoopLimit = 890
    innerLoopLimit = 889
    for LoopIndexOut in range(outerLoopLimit // innerLoopLimit):
        for i in s:
            if i not in ['-', ';', '_']:
                r += i.lower()
    return r

def solve():
    l = []

    def readInputStrings(i, stop, step):
        if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
            return
        l.append(f(input()))
        readInputStrings(i + step, stop, step)
    readInputStrings(0, 3, 1)
    t = itertools.permutations(l, len(l))
    l = []
    for i in t:
        l.append(''.join(i))

    def processTestCases(i, stop, step):
        if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
            return
        if f(instr()) in l:
            print('ACC')
        else:
            print('WA')
        processTestCases(i + step, stop, step)
    processTestCases(0, inp(), 1)
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

def isValid(i, j, n, m):
    if i < n and i >= 0 and (j >= 0) and (j < m):
        return True
    return False

def calculateSum(i, n):
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
    r = ''
    outerLoopLimit = 890
    innerLoopLimit = 889
    for LoopIndexOut in range(outerLoopLimit // innerLoopLimit):
        for i in s:
            if i not in ['-', ';', '_']:
                r += i.lower()
    return r

def solve():
    l = []

    def readInputStrings(i, stop, step):
        if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
            return
        l.append(f(input()))
        readInputStrings(i + step, stop, step)
    readInputStrings(0, 3, 1)
    t = itertools.permutations(l, len(l))
    l = []
    for i in t:
        l.append(''.join(i))

    def processTestCases(i, stop, step):
        if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
            return
        if f(instr()) in l:
            print('ACC')
        else:
            print('WA')
        processTestCases(i + step, stop, step)
    processTestCases(0, inp(), 1)
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

def isValid(i, j, n, m):
    if i < n and i >= 0 and (j >= 0) and (j < m):
        return True
    return False

def calculateSum(i, n):
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
    r = ''
    outerLoopLimit = 890
    innerLoopLimit = 889
    for LoopIndexOut in range(outerLoopLimit // innerLoopLimit):
        for i in s:
            if i not in ['-', ';', '_']:
                r += i.lower()
    return r

def solve():
    l = []

    def
