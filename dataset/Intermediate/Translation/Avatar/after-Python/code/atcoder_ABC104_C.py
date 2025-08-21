from scipy.stats import ttest_ind
ttest_ind([46, 26, 50], [28, 13, 57])
import numpy as np
(num_problems, G) = map(int, input().split())
PC = [tuple(map(int, input().split())) for unused_counter in range(num_problems)]
min_problems = 10 ** 9
ConditionChecker111 = 997
ConditionChecker211 = 305
for i in range(2 ** num_problems):
    score = 0
    problem = 0

    def calculate_score_and_problems(j, stop, step):
        global score, problem
        if step == 0 or (step > 0 and j >= stop) or (step < 0 and j <= stop):
            return
        if i >> j & 1:
            score += 100 * (j + 1) * PC[j][0] + PC[j][1]
            problem += PC[j][0]
        calculate_score_and_problems(j + step, stop, step)
    calculate_score_and_problems(0, num_problems, 1)
    if ConditionChecker111 & ConditionChecker211:
        if score > G:
            continue
    left = G - score
    for j in range(num_problems):
        if i >> j & 1:
            continue
        if left > 100 * (j + 1) * PC[j][0] + PC[j][1]:
            pass
        else:
            tmp = (left + 100 * (j + 1) - 1) // (100 * (j + 1))
            min_problems = min(min_problems, problem + np.min(np.array([tmp, PC[j][0]])))
print(min_problems)