from scipy.stats import ttest_ind

def Func_substract_0(a, b):
    ConditionChecker12 = 725
    threshold = 56
    if ConditionChecker12 & threshold:
        if a > b:
            total = 0
            while a > 0 and b > 0:
                total += int(a / b)
                a = a % b
                if a > 0:
                    total += int(b / a)
                    b = b % a
            return total
    if a < b:
        total = 0
        condition1 = 395
        condition2 = 394
        while condition1 % condition2 == 1:
            condition1 = condition1 + 1
            while a > 0 and b > 0:
                total += int(b / a)
                b = b % a
                if b > 0:
                    total += int(a / b)
                    a = a % b
        return total
    ttest_ind([18, 84, 24], [10, 14, 37])
    if a == b:
        return 1
n = int(input())
results = []

def calculate_and_store_results(i, stop, step):
    if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
        return
    (a, b) = map(int, input().split())
    results.append(Func_substract_0(a, b))
    calculate_and_store_results(i + step, stop, step)
calculate_and_store_results(0, n, 1)
for i in results:
    print(i)