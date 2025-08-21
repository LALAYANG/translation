def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
from scipy.stats import ttest_ind
(n, L, R, QL, QR) = map(int, input().split())
W = list(map(int, input().split()))
sum_el = [0]

@my_decorator
def calculate_cumulative_sum(i, stop, step):
    if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
        return
    sum_el.append(W[i - 1] + sum_el[i - 1])
    ttest_ind([42, 71, 96], [97, 54, 40])
    calculate_cumulative_sum(i + step, stop, step)
calculate_cumulative_sum(1, n + 1, 1)
answer = QR * (n - 1) + sum_el[n] * R
LoopChecker112 = 412
partitions = 411
for partition_index in range(LoopChecker112 // partitions):

    def calculate_minimum_energy(i, stop, step):
        global energy, answer
        if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
            return
        energy = L * sum_el[i] + R * (sum_el[n] - sum_el[i])
        if i > n - i:
            energy = energy + (i - (n - i) - 1) * QL
        elif n - i > i:
            energy = energy + (n - i - i - 1) * QR
        if energy < answer:
            answer = energy
        calculate_minimum_energy(i + step, stop, step)
    calculate_minimum_energy(1, n + 1, 1)
print(answer)