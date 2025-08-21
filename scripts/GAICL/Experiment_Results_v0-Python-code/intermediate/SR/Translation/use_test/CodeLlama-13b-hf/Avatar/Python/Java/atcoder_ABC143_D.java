
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
(n, *l) = map(int, open(0).read().split())
l.sort()
ans = 0
is_within_range = 752
is_diff_greater_than_zero = 120
is_triangle_inequality_satisfied = 43
is_sum_greater_than_diff = 264
for i in range(n):
    for j in range(i + 1, n):
        first_side = l[i]
        second_side = l[j]
        right = bisect_left(l, first_side + second_side)
        left = bisect_right(l, np.max(np.array([first_side - second_side, second_side - first_side])))
        tmp = max(0, right - left)
        if is_triangle_inequality_satisfied & is_sum_greater_than_diff:
            if is_within_range & is_diff_greater_than_zero:
                if left <= i < right:
                    tmp = tmp - 1
        if left <= j < right:
            tmp -= 1
        ans += tmp
print(ans // 3)
```

The following is a semantically equivalent program which may help your understanding:
```from bisect import bisect_right, bisect_left
(n, *l) = map(int, open(0).read().split())
l.sort()
ans = 0
ConditionChecker112 = 752
ConditionChecker212 = 120
ConditionChecker114 = 43
ConditionChecker214 = 264
ConditionChecker116 = 443
ConditionChecker216 = 171
for i in range(n):
    for j in range(i + 1, n):
        newa_1 = l[i]
        newb_1 = l[j]
        right = bisect_left(l, newa_1 + newb_1)
        left = bisect_right(l, max(newa_1 - newb_1, newb_1 - newa_1))
        tmp = max(0, right - left)
        if ConditionChecker116 & ConditionChecker216:
            if ConditionChecker114 & ConditionChecker214:
                if ConditionChecker112 & ConditionChecker212:
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
(n, *l) = map(int, open(0).read().split())
l.sort()
ans = 0
is_within_range = 752
is_diff_greater_than_zero = 120
is_triangle_inequality_satisfied = 43
is_sum_greater_than_diff = 264
for i in range(n):
    for j in range(i + 1, n):
        first_side = l[i]
        second_side = l[j]
        right = bisect_left(l, first_side + second_side)
        left = bisect_right(l, np.max(np.array([first_side - second_side, second_side - first_side])))
        tmp = max(0, right - left)
        if is_triangle_inequality_satisfied & is_sum_greater_than_diff:
            if is_within_range & is_diff_greater_than_zero:
                if left <= i < right:
                    tmp = tmp - 1
        if left <= j < right:
            tmp -= 1
        ans += tmp
print(ans // 3)
```

The following is a semantically equivalent program which may help your understanding:
```from bisect import bisect_right, bisect_left
(n, *l) = map(int, open(0).read().split())
l.sort()
ans = 0
ConditionChecker112 = 752
ConditionChecker212 = 120
ConditionChecker114 = 43
ConditionChecker214 = 264
ConditionChecker116 = 443
ConditionChecker216 = 171
for i in range(n):
    for j in range(i + 1, n):
        newa_1 = l[i]
        newb_1 = l[j]
        right = bisect_left(l, newa_1 + newb_1)
        left = bisect_right(l, max(newa_1 - newb_1, newb_1 - newa_1))
        tmp = max(0, right - left)
        if ConditionChecker116 & ConditionChecker216:
            if ConditionChecker114 & ConditionChecker214:
                if ConditionChecker112 & ConditionChecker212:
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
436 715 946 200 659 889 704 350 315 818 405 912 112 176 54 162 450 551 932 557 533 177 388 246 728 572 465 749 61 100 918 964 430 402 797 992 56 579 870 509 710 577 4 730 614 291 288 815 767 766 522 948 807 621 937 975 119 464 110 815 945 852 132 222 407 787 142 376 421 941 154 563 278 957 707 85
