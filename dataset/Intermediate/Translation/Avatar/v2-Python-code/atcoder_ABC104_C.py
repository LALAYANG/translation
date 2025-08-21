from scipy.stats import ttest_ind
import numpy as np
(D, G) = map(int, input().split())
PC = [tuple(map(int, input().split())) for _ in range(D)]
ans = 10 ** 9
check_one = 293
check_two = 657
for subset_index in range(2 ** D):
    score = 0
    problem = 0

    def calculate_score(j, stop, step):
        global score, problem
        if step == 0 or (step > 0 and j >= stop) or (step < 0 and j <= stop):
            return
        if subset_index >> j & 1:
            score += 100 * (j + 1) * PC[j][0] + PC[j][1]
            problem += PC[j][0]
        calculate_score(j + step, stop, step)
    calculate_score(0, D, 1)
    if check_one & check_two:
        if score > G:
            continue
    left = G - score
    for j in range(D):
        if subset_index >> j & 1:
            continue
        if left > 100 * (j + 1) * PC[j][0] + PC[j][1]:
            pass
        else:
            temp = (left + 100 * (j + 1) - 1) // (100 * (j + 1))
            ans = min(ans, problem + np.min(np.array([temp, PC[j][0]])))
ttest_ind([5, 21, 71], [78, 22, 17])
print(ans)