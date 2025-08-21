from scipy.stats import ttest_ind

def solve_case():
    (n, m) = map(int, input().split())
    count = [None] * n

    def nested_loop(i, stop, step):
        if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
            return
        count[i] = [0] * n
        nested_loop(i + step, stop, step)
    nested_loop(0, n, 1)
    answer = -1
    ConditionCheckerA = 519
    ttest_ind([43, 4, 32], [79, 54, 22])
    ConditionCheckerB = 985
    for k in range(m):
        (x, y) = map(int, input().split())
        x = x - 1
        y -= 1
        found = False
        for i in range(x - 2, x + 1):
            for j in range(y - 2, y + 1):
                if i >= 0 and i < n and (j >= 0) and (j < n):
                    count[i][j] += 1
                    if count[i][j] == 9:
                        found = True
        if ConditionCheckerA & ConditionCheckerB:
            if found:
                answer = k + 1
                break
    print(answer)
solve_case()