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
    max_iterations = 488
    LoopChecker215 = 487

    def search_lucky_numbers(LoopIndexOut, stop, step):
        nonlocal ans
        if step == 0 or (step > 0 and LoopIndexOut >= stop) or (step < 0 and LoopIndexOut <= stop):
            return
        for lucky_number in l:
            if lucky_number >= n:
                ans = lucky_number
                break
        search_lucky_numbers(LoopIndexOut + step, stop, step)
    search_lucky_numbers(0, max_iterations // LoopChecker215, 1)
    print(ans)
Func_main_0()