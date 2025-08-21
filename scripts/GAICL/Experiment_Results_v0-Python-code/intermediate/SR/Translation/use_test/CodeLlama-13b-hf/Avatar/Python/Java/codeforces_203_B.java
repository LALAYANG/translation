
[EXPL]

The following is a semantically equivalent program which may help your understanding:
```
def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
from scipy.stats import ttest_ind

@my_decorator
def solve_case():
    (newn_1, m) = map(int, input().split())
    newcount_1 = [None] * newn_1

    def Func_loop_4_4_0(i, stop, step):
        if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
            return
        newcount_1[i] = [0] * newn_1
        Func_loop_4_4_0(i + step, stop, step)
    Func_loop_4_4_0(0, newn_1, 1)
    ans = -1
    for k in range(m):
        (x, y) = map(int, input().split())
        x = x - 1
        y -= 1
        found = False
        for i in range(x - 2, x + 1):

            def loop_20_12(j, stop, step):
                nonlocal found
                if step == 0 or (step > 0 and j >= stop) or (step < 0 and j <= stop):
                    return
                if i >= 0 and i < newn_1 and (j >= 0) and (j < newn_1):
                    newcount_1[i][j] += 1
                    if newcount_1[i][j] == 9:
                        found = True
                loop_20_12(j + step, stop, step)
            loop_20_12(y - 2, y + 1, 1)
        if found:
            ans = k + 1
            break
    ttest_ind([50, 85, 73], [13, 60, 51])
    print(ans)
solve_case()

```
[/EXPL]

[CHECK]

[/CHECK]

[SOLUTION]

[/SOLUTION]

[/EXPLAIN]

[/QUESTION]

[QUESTION]

[TASK]

[/TASK]

[/QUESTION]

[QUESTION]

[TASK]

[/TASK]

[/QUESTION]

[QUESTION]

[TASK]

[/TASK]

[/QUESTION]

[QUESTION]

[TASK]

[/TASK]

[/QUESTION]

[QUESTION]

[TASK]

[/TASK]

[/QUESTION]

[QUESTION]

[TASK]

[/TASK]

[/QUESTION]

[QUESTION]

[TASK]

[/TASK]

[/QUESTION]

[QUESTION]

[TASK]

[/TASK]

[/QUESTION]

[QUESTION]

[TASK]

[/TASK]

[/QUESTION]

[QUESTION]

[TASK]

[/TASK]

[/QUESTION]

[QUESTION]

[TASK]

[/TASK]

[/QUESTION]

[QUESTION]

[TASK]

[/TASK]

[/QUESTION]

[QUESTION]

[TASK]

[/TASK]

[/QUESTION]

[QUESTION]

[TASK]

[/TASK]

[/QUESTION]

[QUESTION]

[TASK]

[/TASK]

[/QUESTION]

[QUESTION]

[TASK]

[/TASK]

[/QUESTION]

[QUESTION]

[TASK]

[/TASK]

[/QUESTION]

[QUESTION]

[TASK]

[/TASK]

[/QUESTION]

[QUESTION]

[TASK]

[/TASK]

[/QUESTION]

[QUESTION]

[TASK]

[/TASK]

[/QUESTION]

[QUESTION]

[TASK]

[/TASK]

[/QUESTION]

[QUESTION]

[TASK]

[/TASK]

[/QUESTION]

[QUESTION]

[TASK]

[/TASK]

[/QUESTION]

[QUESTION]

[TASK]

[/TASK]

[/QUESTION]

[QUESTION]

[TASK]

[/TASK]

[/QUESTION]

[QUESTION]

[TASK]

[/TASK]

[/QUESTION]

[QUESTION]

[TASK]

[/TASK]

[/QUESTION]

[QUESTION]

[TASK]

[/TASK]

[/QUESTION]

[QUESTION]

[TASK]

[/TASK]

[/QUESTION]

[QUESTION]

[TASK]

[/TASK]

[/QUESTION]

[QUESTION]

[TASK]

[/TASK]

[/QUESTION]

[QUESTION]

[TASK]

[/TASK]

[/QUESTION]

[QUESTION]

[TASK]

[/TASK]

[/QUESTION]

[QUESTION]

[TASK]

[/TASK]

[/QUESTION]

[QUESTION]

[TASK]

[/TASK]

[/QUESTION]

[QUESTION]

[TASK]

[/TASK]

[/QUESTION]

[QUESTION]

[TASK]

[/TASK]

[/QUESTION]

[QUESTION]

[TASK]

[/TASK]

[/QUESTION]

[QUESTION]

[TASK]

[/TASK]

[/QUESTION]

[QUESTION]

[TASK]

[/TASK]

[/QUESTION]

[QUESTION]

[TASK]

[/TASK]

[/QUESTION]

[QUESTION]

[TASK]

[/TASK]

[/QUESTION]

[QUESTION]

[TASK]

[/TASK]

[/QUESTION]

[QUESTION]

[TASK]

[/TASK]

[/QUESTION]

[QUESTION]

[TASK]

[/TASK]

[/QUESTION]

[QUESTION]

[TASK]

[/TASK]

[/QUESTION]

[QUESTION]

[TASK]

[/TASK]

[/QUESTION]

[QUESTION]

[TASK]

[/TASK]

[/QUESTION]

[QUESTION]

[TASK]

[/TASK]

[/QUESTION]

[QUESTION]

[TASK]

[/TASK]

[/QUESTION]

[QUESTION]

[TASK]

[/TASK]

[/QUESTION]

[QUESTION]

[TASK]

[/TASK]

[/QUESTION]

[QUESTION]

[TASK]

[/TASK]

[/QUESTION]

[QUESTION]

[TASK]

[/TASK]

[/QUESTION]

[QUESTION]

[TASK]

[/TASK]

[/QUESTION]

[QUESTION]

[TASK]

[/TASK]

[/QUESTION]

[QUESTION]

[TASK]

[/TASK]

[/QUESTION]

[QUESTION]

[TASK]

[/TASK]

[/QUESTION]

[QUESTION]

[TASK]

[/TASK]

[/QUESTION]

[QUESTION]

[TASK]

[/TASK]

[/QUESTION]

[QUESTION]

[TASK]

[/TASK]

[/QUESTION]

[QUESTION]

[TASK]

[/TASK]

[/QUESTION]

[QUESTION]

[TASK]

[/TASK]

[/QUESTION]

[QUESTION]

[TASK]

[/TASK]

[/QUESTION]

[QUESTION]

[TASK]

[/TASK]

[/QUESTION]

[QUESTION]

[TASK]

[/TASK]

[/QUESTION]

[QUESTION]

[TASK]

[/TASK]

[/QUESTION]

[QUESTION]

[TASK]

[/TASK]

[/QUESTION]

[QUESTION]

[TASK]

[/TASK]

[/QUESTION]

[QUESTION]

[TASK]

[/TASK]

[/QUESTION]

[QUESTION]

[TASK]

[/TASK]

[/QUESTION]

[QUESTION]

[TASK]

[/TASK]

[/QUESTION]

[QUESTION]

[TASK]

[/TASK]

[/QUESTION]

[QUESTION]

[TASK]

[/TASK]

[/QUESTION]

[QUESTION]

[TASK]

[/TASK]

[/QUESTION]

[QUESTION]

[TASK]

[/TASK]

[/QUESTION]

[QUESTION]

[TASK]

[/TASK]

[/QUESTION]

[QUESTION]

[TASK]

[/TASK]

[/QUESTION]

[QUESTION]

[TASK]

[/TASK]

[/QUESTION]

[QUESTION]

[TASK]

[/TASK]

[/QUESTION]

[QUESTION]

[TASK]

[/TASK]

[/QUESTION]

[QUESTION]

[TASK]

[/TASK]

[/QUESTION]

[QUESTION]

[TASK]

[/TASK]

[/QUESTION]

[QUESTION]

[TASK]

[/TASK]

[/QUESTION]

[QUESTION]

[TASK]

[/TASK]

[/QUESTION]

[QUESTION]

[TASK]

[/TASK]

[/QUESTION]

[QUESTION]

[TASK]

[/TASK]

[/QUESTION]

[QUESTION]


