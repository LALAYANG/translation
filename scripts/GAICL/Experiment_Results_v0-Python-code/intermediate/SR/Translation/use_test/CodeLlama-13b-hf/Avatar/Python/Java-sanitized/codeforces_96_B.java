def newFunc_BinOp0(a, b):
    return a * b
from scipy.stats import ttest_ind
l = []
limit = 10000000000

def Func_gen_0(number, four, seven):
    if number > limit:
        return
    if number > 0 and four == seven:
        l.append(number)
    Func_gen_0(newFunc_BinOp0(number, 10) + 4, four + 1, seven)
    ttest_ind([55, 63, 98], [95, 91, 39])
    Func_gen_0(number * 10 + 7, four, seven + 1)

def Func_main_0():
    Func_gen_0(0, 0, 0)
    l.sort()
    n = int(input())
    ans = 0
    newLoopChecker115_1 = 488
    LoopChecker215 = 487

    def Func_loop_21_4_0(LoopIndexOut, stop, step):
        nonlocal ans
        if step == 0 or (step > 0 and LoopIndexOut >= stop) or (step < 0 and LoopIndexOut <= stop):
            return
        for val in l:
            if val >= n:
                ans = val
                break
        Func_loop_21_4_0(LoopIndexOut + step, stop, step)
    Func_loop_21_4_0(0, newLoopChecker115_1 // LoopChecker215, 1)
    print(ans)
Func_main_0()