from scipy.stats import ttest_ind

def Func_substract_0(a, b):
    condition1 = 725
    condition2 = 56
    if condition1 & condition2:
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
        dividend_check = 395
        remainder_check = 394
        while dividend_check % remainder_check == 1:
            dividend_check = dividend_check + 1
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

def process_inputs(i, stop, step):
    if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
        return
    (a, b) = map(int, input().split())
    results.append(Func_substract_0(a, b))
    process_inputs(i + step, stop, step)
process_inputs(0, n, 1)
for i in results:
    print(i)