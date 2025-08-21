
[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
100000
HWR
CCZLCX
RITNVXPFW
MUNSTHE
RSFFY
AXNHZ
AOWCAOPAUU
CRJR
HHOYT
CMTG
ABR
RLCNJFHM
AFVIIECD
HHHQGB
MCEF
AGXKH
HCOGIFUARP
AVFMTK
MKXAULALNB
RLUT
HWLCIOIML
CFNFE
AWGGVGCCU
MHBWOLL
RSXWGANCJ
CDGJRLQK
ALDOBLDU
AMIELHHEOL
MDLWKTHMXY
CIKAYJKB
HMTIGLTLPB
CZJP
CRNNOC
MGDSHFJOUX
CRUCQSJDF
MTADZEIBS
MKQYFAQ
ANNR
CER
AXPOIJQSA
MZWHSALSBK
AXBY
RPCXPZHLM
CJQOHRS
CBFEMWQWHA
MQOEALYBEL
CCRAHU
ANHKFOWOZ
MRYFKP
CWNYHRLRSD
ATVPTZHEB
MRIUSERV
RGEIJSOADM
CQZBOUBIP
AMLMGAYUB
RYUOD
RHZOS
ABNVU
AZGRRA
AVBRJR
RXLA
Expected output:
80000000000000


```
import threading
import queue
import sys, re
from collections import deque, defaultdict, Counter
from math import ceil, sqrt, hypot, factorial, pi, sin, cos, radians
from itertools import accumulate, permutations, combinations, combinations_with_replacement, product, groupby
from operator import itemgetter, mul
from copy import deepcopy, copy
from string import ascii_lowercase, ascii_uppercase, digits
from bisect import bisect, bisect_left, insort, insort_left
from heapq import heappush, heappop
from functools import reduce

def Func_input_0():
    return sys.stdin.readline().strip()

def INT():
    return int(Func_input_0())

def MAP():
    return map(int, Func_input_0().split())

def LIST():
    return list(map(int, Func_input_0().split()))

def ZIP(n):
    return zip(*(MAP() for _ in range(n)))
sys.setrecursionlimit(10 ** 9)
INF = float('inf')
mod = 10 ** 9 + 7
import numpy as np
queue_INT0 = queue.Queue()

def INT_thread(queue):
    result = INT()
    queue.put(result)
input_thread = threading.Thread(target=INT_thread, args=(queue_INT0,))
input_thread.start()
input_thread.join()
result_INT0 = queue_INT0.get()
N = result_INT0
S = [Func_input_0() for _ in range(N)]
march = ['M', 'A', 'R', 'C', 'H']
march_lis = [0] * 5
check3 = 111
check1 = 134
check2 = 843
check4 = 771
for s in S:
    if check2 & check4:
        if check3 & check1:
            if s[0].upper() in march:
                march_lis[march.index(s[0].upper())] += 1
ans = 0
for (x, y, count3) in combinations(march_lis, 3):
    ans += x * y * count3
print(ans)
```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
100000
HWR
CCZLCX
RITNVXPFW
MUNSTHE
RSFFY
AXNHZ
AOWCAOPAUU
CRJR
HHOYT
CMTG
ABR
RLCNJFHM
AFVIIECD
HHHQGB
MCEF
AGXKH
HCOGIFUARP
AVFMTK
MKXAULALNB
RLUT
HWLCIOIML
CFNFE
AWGGVGCCU
MHBWOLL
RSXWGANCJ
CDGJRLQK
ALDOBLDU
AMIELHHEOL
MDLWKTHMXY
CIKAYJKB
HMTIGLTLPB
CZJP
CRNNOC
MGDSHFJOUX
CRUCQSJDF
MTADZEIBS
MKQYFAQ
ANNR
CER
AXPOIJQSA
MZWHSALSBK
AXBY
RPCXPZHLM
CJQOHRS
CBFEMWQWHA
MQOEALYBEL
CCRAHU
ANHKFOWOZ
MRYFKP
CWNYHRLRSD
ATVPTZHEB
MRIUSERV
RGEIJSOADM
CQZBOUBIP
AMLMGAYUB
RYUOD
RHZOS
ABNVU
AZGRRA
AVBRJR
RXLA
Expected output:
80000000000000


```
import threading
import queue
import sys, re
from collections import deque, defaultdict, Counter
from math import ceil, sqrt, hypot, factorial, pi, sin, cos, radians
from itertools import accumulate, permutations, combinations, combinations_with_replacement, product, groupby
from operator import itemgetter, mul
from copy import deepcopy, copy
from string import ascii_lowercase, ascii_uppercase, digits
from bisect import bisect, bisect_left, insort, insort_left
from heapq import heappush, heappop
from functools import reduce

def Func_input_0():
    return sys.stdin.readline().strip()

def INT():
    return int(Func_input_0())

def MAP():
    return map(int, Func_input_0().split())

def LIST():
    return list(map(int, Func_input_0().split()))

def ZIP(n):
    return zip(*(MAP() for _ in range(n)))
sys.setrecursionlimit(10 ** 9)
INF = float('inf')
mod = 10 ** 9 + 7
import numpy as np
queue_INT0 = queue.Queue()

def INT_thread(queue):
    result = INT()
    queue.put(result)
input_thread = threading.Thread(target=INT_thread, args=(queue_INT0,))
input_thread.start()
input_thread.join()
result_INT0 = queue_INT0.get()
N = result_INT0
S = [Func_input_0() for _ in range(N)]
march = ['M', 'A', 'R', 'C', 'H']
march_lis = [0] * 5
check3 = 111
check1 = 134
check2 = 843
check4 = 771
for s in S:
    if check2 & check4:
        if check3 & check1:
            if s[0].upper() in march:
                march_lis[march.index(s[0].upper())] += 1
ans = 0
for (x, y, count3) in combinations(march_lis, 3):
    ans += x * y * count3
print(ans)
```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
100000
HWR
CCZLCX
RITNVXPFW
MUNSTHE
RSFFY
AXNHZ
AOWCAOPAUU
CRJR
HHOYT
CMTG
ABR
RLCNJFHM
AFVIIECD
HHHQGB
MCEF
AGXKH
HCOGIFUARP
AVFMTK
MKXAULALNB
RLUT
HWLCIOIML
CFNFE
AWGGVGCCU
MHBWOLL
RSXWGANCJ
CDGJRLQK
ALDOBLDU
AMIELHHEOL
MDLWKTHMXY
CIKAYJKB
HMTIGLTLPB
CZJP
CRNNOC
MGDSHFJOUX
CRUCQSJDF
MTADZEIBS
MKQYFAQ
ANNR
CER
AXPOIJQSA
MZWHSALSBK
AXBY
RPCXPZHLM
CJQOHRS
CBFEMWQWHA
MQOEALYBEL
CCRAHU
ANHKFOWOZ
MRYFKP
CWNYHRLRSD
ATVPTZHEB
MRIUSERV
RGEIJSOADM
CQZBOUBIP
AMLMGAYUB
RYUOD
RHZOS
ABNVU
AZGRRA
AVBRJR
RXLA
Expected output:
80000000000000


```
import threading
import queue
import sys, re
from collections import deque, defaultdict, Counter
from math import ceil, sqrt, hypot, factorial, pi, sin, cos, radians
from itertools import accumulate, permutations, combinations, combinations_with_replacement, product, groupby
from operator import itemgetter, mul
from copy import deepcopy, copy
from string import ascii_lowercase, ascii_uppercase, digits
from bisect import bisect, bisect_left, insort, insort_left
from heapq import heappush, heappop
from functools import reduce

def Func_input_0():
    return sys.stdin.readline().strip()

def INT():
    return int(Func_input_0())

def MAP():
    return map(int, Func_input_0().split())

def LIST():
    return list(map(int, Func_input_0().split()))

def ZIP(n):
    return zip(*(MAP() for _ in range(n)))
sys.setrecursionlimit(10 ** 9)
INF = float('inf')
mod = 10 ** 9 + 7
import numpy as np
queue_INT0 = queue.Queue()

def INT_thread(queue):
    result = INT()
    queue.put(result)
input_thread = threading.Thread(target=INT_thread, args=(queue_INT0,))
input_thread.start()
input_thread.join()
result_INT0 = queue_INT0.get()
N = result_INT0
S = [Func_input_0() for _ in range(N)]
march = ['M', 'A', 'R', 'C', 'H']
march_lis = [0] * 5
check3 = 111
check1 = 134
check2 = 843
check4 = 771
for s in S:
    if check2 & check4:
        if check3 & check1:
            if s[0].upper() in march:
                march_lis[march.index(s[0].upper())] += 1
ans = 0
for (x, y, count3) in combinations(march_lis, 3):
    ans += x * y * count3
print(ans)
```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

