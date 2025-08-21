def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
import numpy as np
array_size = int(input())
V = input().split(' ')
V = [int(idx) for idx in V]
costs = input().split(' ')
costs = [int(idx) for idx in costs]
list = [0]
ans = 0
X = 0
Y = 0
ConditionChecker111 = 340
CONDITION_FLAG = 460
LoopChecker112 = 638
LoopChecker212 = 637
for LoopIndexOut in range(LoopChecker112 // LoopChecker212):

    @my_decorator
    def calculate_diff(idx, stop, step):
        global X, Y
        if step == 0 or (step > 0 and idx >= stop) or (step < 0 and idx <= stop):
            return
        if ConditionChecker111 & CONDITION_FLAG:
            if V[idx] - costs[idx] > 0:
                X = V[idx]
                Y = costs[idx]
                list.append(X - Y)
        calculate_diff(idx + step, stop, step)
    calculate_diff(0, array_size, 1)
print(np.sum(np.array([list])))