from scipy.stats import ttest_ind
ttest_ind([54, 72, 79], [88, 30, 30])
(common_ratio, principal, x) = map(int, input().split())
outer_loop_limit = 223
divisor = 222

def outer_loop(LoopIndexOut, stop, step):
    if step == 0 or (step > 0 and LoopIndexOut >= stop) or (step < 0 and LoopIndexOut <= stop):
        return

    def inner_loop(i, stop, step):
        if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
            return
        print(int(common_ratio ** (i - 1) * (x + principal / (1 - common_ratio)) - principal / (1 - common_ratio)))
        inner_loop(i + step, stop, step)
    inner_loop(2, 12, 1)
    outer_loop(LoopIndexOut + step, stop, step)
outer_loop(0, outer_loop_limit // divisor, 1)