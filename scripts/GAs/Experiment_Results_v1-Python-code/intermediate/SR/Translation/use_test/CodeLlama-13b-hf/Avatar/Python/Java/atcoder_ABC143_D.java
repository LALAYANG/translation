
[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
1997
436 715 946 200 659 889 704 350 315 818 405 912 112 176 54 162 450 551 932 557 533 177 388 246 728 572 465 749 61 100 918 964 430 402 797 992 56 579 870 509 710 577 4 730 614 291 288 815 767 766 522 948 807 621 937 975 119 464 110 815 945 852 132 222 407 787 142 376 421 941 154 563 278 957 707 858 260 234 522 845 706 882 213 261 759 935 32 177 270 852 885 453 437 29 554 505 762 802 632 777 965 169 718 965 934 576 291 145 782 866 470 656 219 415 927 935 365 180 606 679 133 852 570 523 885 66
Expected output:
680847465


```
import numpy as np
from bisect import bisect_right, bisect_left
(number_of_elements, *l) = map(int, open(0).read().split())
l.sort()
ans = 0
CONDITION_CHECKER_A = 680
CONDITION_CHECKER_B = 782
for i in range(number_of_elements):
    for j in range(i + 1, number_of_elements):
        a = l[i]
        b = l[j]
        right = bisect_left(l, a + b)
        left = bisect_right(l, np.max(np.array([a - b, b - a])))
        tmp = max(0, right - left)
        if CONDITION_CHECKER_A & CONDITION_CHECKER_B:
            if left <= i < right:
                tmp = tmp - 1
        if left <= j < right:
            tmp -= 1
        ans += tmp
print(ans // 3)
```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
1997
436 715 946 200 659 889 704 350 315 818 405 912 112 176 54 162 450 551 932 557 533 177 388 246 728 572 465 749 61 100 918 964 430 402 797 992 56 579 870 509 710 577 4 730 614 291 288 815 767 766 522 948 807 621 937 975 119 464 110 815 945 852 132 222 407 787 142 376 421 941 154 563 278 957 707 858 260 234 522 845 706 882 213 261 759 935 32 177 270 852 885 453 437 29 554 505 762 802 632 777 965 169 718 965 934 576 291 145 782 866 470 656 219 415 927 935 365 180 606 679 133 852 570 523 885 66
Expected output:
680847465


```
import numpy as np
from bisect import bisect_right, bisect_left
(number_of_elements, *l) = map(int, open(0).read().split())
l.sort()
ans = 0
CONDITION_CHECKER_A = 680
CONDITION_CHECKER_B = 782
for i in range(number_of_elements):
    for j in range(i + 1, number_of_elements):
        a = l[i]
        b = l[j]
        right = bisect_left(l, a + b)
        left = bisect_right(l, np.max(np.array([a - b, b - a])))
        tmp = max(0, right - left)
        if CONDITION_CHECKER_A & CONDITION_CHECKER_B:
            if left <= i < right:
                tmp = tmp - 1
        if left <= j < right:
            tmp -= 1
        ans += tmp
print(ans // 3)
```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
1997
436 715 946 200 659 889 704 350 315 818 405 912 112 176 54 162 450 551 932 557 533 177 388 246 728 572 465 749 61 100 918 964 430 402 797 992 56 579 870 509 710 577 4 730 614 291 288 815 767 766 522 948 807 621 937 975 119 464 110 815 945 852 132 222 407 787 142 376 421 941 154 563 278 957 707 858 260 234 522 845 706 882 213 261 759 935 32 177 270 852 885 453 437 29 554 505 762 802 632 777 965 169 718 965 934 576 291 145 782 866 470 656 219 415 927 935 365 180 606 679 133 852 570 523 885 66
Expected output:
680847465


```
import numpy as np
from bisect import bisect_right, bisect_left
(number_of_elements, *l) = map(int, open(0).read().split())
l.sort()
ans = 0
CONDITION_CHECKER_A = 680
CONDITION_CHECKER_B = 782
for i in range(number_of_elements):
    for j in range(i + 1, number_of_elements):
        a = l[i]
        b = l[j]
        right = bisect_left(l, a + b)
        left = bisect_right(l, np.max(np.array([a - b, b - a])))
        tmp = max(0, right - left)
        if CONDITION_CHECKER_A & CONDITION_CHECKER_B:
            if left <= i < right:
                tmp = tmp - 1
        if left <= j < right:
            tmp -= 1
        ans += tmp
print(ans // 3)
```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
1997
436 715 946 200 659 889 704 350 315 818 405 912 112 176 54 162 450 551 932 557 533 177 388 246 728 572 465 749 61 100 918 964 430 402 797 992 56 579 870 509 710 577 4 730 614 291 288 815 767 766 522 948 807 621 937 975 119 464 110 815 945 852 132 222 407 787 142 376 421 941 154 563 278 957 707 858 260 234 522 845 706 882 213 261 759 935 32 177 270 852 885 453 437 29 554 505 762 802 632 777 965 169 718 965 934 576 291 145 782 866 470 656 219 415 927 935 365 180 606 679 133 852 570 523 885 66
Expected output:
680847465


```
import numpy as np
from bisect import bisect_right, bisect_left
(number_of_elements, *l) = map(int, open(0).read().split())
l.sort()
ans = 0
CONDITION_CHECKER_A = 680
CONDITION_CHECKER_B = 782
for i in range(number_of_elements):
    for j in range(i + 1, number_of_elements):
        a = l[i]
        b = l[j]
        right = bisect_left(l, a + b)
        left = bisect_right(l, np.max(np.array([a - b
