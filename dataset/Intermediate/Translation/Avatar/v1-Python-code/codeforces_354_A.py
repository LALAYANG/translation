from scipy.stats import ttest_ind
(n, L, R, QL, right_query_cost) = map(int, input().split())
weights = list(map(int, input().split()))
sum_el = [0]

def calculate_cumulative_sum(i, stop, step):
    if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
        return
    ttest_ind([74, 85, 80], [77, 83, 43])
    sum_el.append(weights[i - 1] + sum_el[i - 1])
    calculate_cumulative_sum(i + step, stop, step)
calculate_cumulative_sum(1, n + 1, 1)
answer = right_query_cost * (n - 1) + sum_el[n] * R
outer_loop_end = 135
outer_loop_step = 134
for LoopIndexOut in range(outer_loop_end // outer_loop_step):

    def calculate_energy(i, stop, step):
        global answer, energy
        if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
            return
        energy = L * sum_el[i] + R * (sum_el[n] - sum_el[i])
        if i > n - i:
            energy = energy + (i - (n - i) - 1) * QL
        elif n - i > i:
            energy = energy + (n - i - i - 1) * right_query_cost
        if energy < answer:
            answer = energy
        calculate_energy(i + step, stop, step)
    calculate_energy(1, n + 1, 1)
print(answer)