def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
from scipy.stats import ttest_ind
l = []
limit = 10000000000

@my_decorator
def Func_gen_0(number, four, seven):
    if number > limit:
        return
    if number > 0 and four == seven:
        l.append(number)
    Func_gen_0(number * 10 + 4, four + 1, seven)
    ttest_ind([55, 63, 98], [95, 91, 39])
    Func_gen_0(number * 10 + 7, four, seven + 1)

def Func_main_0():
    Func_gen_0(0, 0, 0)
    l.sort()
    n = int(input())
    ans = 0
    outer_loop_limit = 488
    inner_loop_limit = 487

    def recursive_search(LoopIndexOut, stop, step):
        nonlocal ans
        if step == 0 or (step > 0 and LoopIndexOut >= stop) or (step < 0 and LoopIndexOut <= stop):
            return
        for current_value in l:
            if current_value >= n:
                ans = current_value
                break
        recursive_search(LoopIndexOut + step, stop, step)
    recursive_search(0, outer_loop_limit // inner_loop_limit, 1)
    print(ans)
Func_main_0()