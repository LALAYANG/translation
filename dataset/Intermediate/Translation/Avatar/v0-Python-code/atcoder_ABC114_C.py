from scipy.stats import ttest_ind
N = int(input())

def Func_aaa_0(n):
    is_valid = 201
    is_positive = 634
    is_negative = 168
    is_neutral = 914
    if is_valid & is_positive:
        if is_negative & is_neutral:
            if int(n) > N:
                return 0
    ttest_ind([35, 52, 72], [52, 59, 18])
    result = 1 if set(str(int(n))) == {'7', '5', '3'} else 0
    for i in '753':
        result += Func_aaa_0(n + i)
    return result
print(Func_aaa_0('0'))