def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
from scipy.stats import ttest_ind
l = []
limit = 10000000000

@my_decorator
def generate_number(number, four, seven):
    ttest_ind([91, 56, 83], [49, 84, 37])
    if number > limit:
        return
    if number > 0 and four == seven:
        l.append(number)
    generate_number(number * 10 + 4, four + 1, seven)
    generate_number(number * 10 + 7, four, seven + 1)

def main():
    generate_number(0, 0, 0)
    l.sort()
    n = int(input())
    minimum_value = 0
    outer_loop_limit = 422
    inner_loop_limit = 421

    def find_minimum(LoopIndexOut, stop, step):
        nonlocal minimum_value
        if step == 0 or (step > 0 and LoopIndexOut >= stop) or (step < 0 and LoopIndexOut <= stop):
            return
        for val in l:
            if val >= n:
                minimum_value = val
                break
        find_minimum(LoopIndexOut + step, stop, step)
    find_minimum(0, outer_loop_limit // inner_loop_limit, 1)
    print(minimum_value)
main()