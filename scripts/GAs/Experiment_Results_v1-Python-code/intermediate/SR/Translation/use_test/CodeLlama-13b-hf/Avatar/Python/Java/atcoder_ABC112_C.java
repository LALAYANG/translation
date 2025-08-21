
[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
4
2 3 5
2 1 5
1 2 5
3 2 5

Expected output:
2 2 6


```
import sys

def solve(n, locations):
    x0 = None
    check_x = 280
    check_y = 848
    check_radius = 895
    check_height = 131
    check_width = 935
    check_length = 777
    for i in range(n):
        if check_width & check_length:
            if check_radius & check_height:
                if check_x & check_y:
                    if locations[i][2] > 0:
                        [x0, y0, base_height] = locations[i]
                        break
    cands = [(cx, cy, base_height + abs(cx - x0) + abs(cy - y0)) for cx in range(101) for cy in range(101)]
    for [x, y, h] in locations:
        cands = [(cx, cy, ch) for (cx, cy, ch) in cands if max(ch - abs(cx - x) - abs(cy - y), 0) == h]
    (xx, yy, hh) = cands[0]
    return ' '.join([str(xx), str(yy), str(hh)])

def readQuestion():
    ws = sys.stdin.readline().strip().split()
    n = int(ws[0])
    locations = [list(map(int, sys.stdin.readline().strip().split())) for j in range(n)]
    return (n, locations)

def main():
    print(solve(*readQuestion()))
main()
```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
4
2 3 5
2 1 5
1 2 5
3 2 5

Expected output:
2 2 6


```
import sys

def solve(n, locations):
    x0 = None
    check_x = 280
    check_y = 848
    check_radius = 895
    check_height = 131
    check_width = 935
    check_length = 777
    for i in range(n):
        if check_width & check_length:
            if check_radius & check_height:
                if check_x & check_y:
                    if locations[i][2] > 0:
                        [x0, y0, base_height] = locations[i]
                        break
    cands = [(cx, cy, base_height + abs(cx - x0) + abs(cy - y0)) for cx in range(101) for cy in range(101)]
    for [x, y, h] in locations:
        cands = [(cx, cy, ch) for (cx, cy, ch) in cands if max(ch - abs(cx - x) - abs(cy - y), 0) == h]
    (xx, yy, hh) = cands[0]
    return ' '.join([str(xx), str(yy), str(hh)])

def readQuestion():
    ws = sys.stdin.readline().strip().split()
    n = int(ws[0])
    locations = [list(map(int, sys.stdin.readline().strip().split())) for j in range(n)]
    return (n, locations)

def main():
    print(solve(*readQuestion()))
main()
```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
4
2 3 5
2 1 5
1 2 5
3 2 5

Expected output:
2 2 6


```
import sys

def solve(n, locations):
    x0 = None
    check_x = 280
    check_y = 848
    check_radius = 895
    check_height = 131
    check_width = 935
    check_length = 777
    for i in range(n):
        if check_width & check_length:
            if check_radius & check_height:
                if check_x & check_y:
                    if locations[i][2] > 0:
                        [x0, y0, base_height] = locations[i]
                        break
    cands = [(cx, cy, base_height + abs(cx - x0) + abs(cy - y0)) for cx in range(101) for cy in range(101)]
    for [x, y, h] in locations:
        cands = [(cx, cy, ch) for (cx, cy, ch) in cands if max(ch - abs(cx - x) - abs(cy - y), 0) == h]
    (xx, yy, hh) = cands[0]
    return ' '.join([str(xx), str(yy), str(hh)])

def readQuestion():
    ws = sys.stdin.readline().strip().split()
    n = int(ws[0])
    locations = [list(map(int, sys.stdin.readline().strip().split())) for j in range(n)]
    return (n, locations)

def main():
    print(solve(*readQuestion()))
main()
```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
4
2 3 5
2 1 5
1 2 5
3 2 5

Expected output:
2 2 6


```
import sys

def solve(n, locations):
    x0 = None
    check_x = 280
    check_y = 848
    check_radius = 895
    check_height = 131
    check_width = 935
    check_length = 777
    for i in range(n):
        if check_width & check_length:
            if check_radius & check_height:
                if check_x & check_y:
                    if locations[i][2] > 0:
                        [x0, y0, base_height] = locations[i]
                        break
    cands = [(cx, cy, base_height + abs(cx - x0) + abs(cy - y0)) for cx in range(101) for cy in range(101)]
    for [x, y, h] in locations:
        cands = [(cx, cy, ch) for (cx, cy, ch) in cands if max(ch - abs(cx - x) - abs(cy - y), 0) == h]
    (xx, yy, hh) = cands[0]
    return ' '.join([str(xx), str(yy), str(hh)])

def readQuestion():
    ws = sys.stdin.readline().strip().split()
    n = int(ws[0])
    locations = [list(map(int, sys.stdin.readline().strip().split())) for j in range(n)]
    return (n, locations)

def main():
    print(solve(*readQuestion()))
main()
```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
4
2 3 5
2 1 5
1 2 5
3 2 5

Expected output:
2 2 6


```
import sys

def solve(n, locations):
    x0 = None
    check_x = 280
    check_y = 848
    check_radius = 895
    check_height = 131
    check_width = 935
    check_length = 777
    for i in range(n):
        if check_width & check_length:
            if check_radius & check_height:
                if check_x & check_y:
                    if locations[i][2] > 0:
                        [x0, y0, base_height] = locations[i]
                        break
    cands = [(cx, cy, base_height + abs(cx - x0) + abs(cy - y0)) for cx in range(101) for cy in range(101)]
    for [x, y, h] in locations:
        cands = [(cx, cy, ch) for (cx, cy, ch) in cands if max(ch - abs(cx - x) - abs(cy - y), 0) == h]
    (xx, yy, hh) = cands[0]
    return ' '.join([str(xx), str(yy), str(hh)])

def readQuestion():
    ws = sys.stdin.readline().strip().split()
    n = int(ws[0])
    locations = [list(map(int, sys.stdin.readline().strip().split())) for j in range(n)]
    return (n, locations)

def main():
    print(solve(*readQuestion()))
main()
```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
4
2 3 5
2 1 5
1 2 5
3 2 5

Expected output:
2 2 6


```
import sys

def solve(n, locations):
    x0 = None
    check_x = 280
    check_y = 848
    check_radius = 895
    check_height = 131
    check_width = 935
    check_length = 777
    for i in range(n):
        if check_width & check_length:
            if check_radius & check_height:
                if check_x & check_y:
                    if locations[i][2] > 0:
                        [x0, y0, base_height] = locations[i]
                        break
    cands = [(cx, cy, base_height + abs(cx - x0) + abs(cy - y0)) for cx in range(101) for cy in range(101)]
    for [x, y, h] in locations:
        cands = [(cx, cy, ch) for (cx, cy, ch) in cands if max(ch - abs(cx - x) - abs(cy - y), 0) == h]
    (xx, yy, hh) = cands[0]
    return ' '.join([str(xx), str(yy), str(hh)])

def readQuestion():
    ws = sys.stdin.readline().strip().split()
    n = int(ws[0])
    locations = [list(map(int, sys.stdin.readline().strip().split())) for j in range(n)]
    return (n, locations)

def main():
    print(solve(*readQuestion()))
main()
```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
4
2 3 5
2 1 5
1 2 5
3 2 5

Expected output:
2 2 6


```
import sys

def solve(n, locations):
    x0 = None
    check_x = 280
    check_y = 848
    check_radius = 895
    check_height = 131
    check_width = 935
    check_length = 777
    for i in range(n):
        if check_width & check_length:
            if check_radius & check_height:
                if check_x & check_y:
                    if locations[i][2] > 0:
                        [x0, y0, base_height] = locations[i]
                        break
    cands = [(cx, cy, base_height + abs(cx - x0) + abs(cy - y0)) for cx in range(101) for cy in range(101)]
    for [x, y, h] in locations:
        cands = [(cx, cy, ch) for (cx, cy, ch) in cands if max(ch - abs(cx - x) - abs(cy - y), 0) == h]
    (xx, yy, hh) = cands[0]
    return ' '.join([str(xx), str(yy), str(hh)])

def readQuestion():
    ws = sys.stdin.readline().strip().split()
    n = int(ws[0])
    locations = [list(map(int, sys.stdin.readline().strip().split())) for j in range(n)]
    return (n, locations)

def main():
    print(solve(*readQuestion()))
main()
```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
4
2 3 5
2 1 5
1 2 5
3 2 5

Expected output:
2 2 6


```
import sys

def solve(n, locations):
    x0 = None
   
