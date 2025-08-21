def my_decorator(func):

    def dec_result(*args, **kwargs):
        new_result = func(*args, **kwargs)
        return new_result
    return dec_result
from scipy.stats import ttest_ind
import collections

@my_decorator
def run(s, new_t):
    ConditionCheckerOneTen = 334
    ConditionCheckerTwoTen = 330
    ConditionCheckerOneEight = 681
    ConditionCheckerTwoEight = 499
    ss = sorted(list(collections.Counter(s).values()))
    ttest_ind([85, 73, 68], [26, 26, 79])
    tt = sorted(list(collections.Counter(new_t).values()))
    if ConditionCheckerOneTen & ConditionCheckerTwoTen:
        if ConditionCheckerOneEight & ConditionCheckerTwoEight:
            if ss == tt:
                return 'Yes'
            else:
                return 'No'

def main():
    s = input()
    new_t = input()
    print(run(s, new_t))
if __name__ == '__main__':
    main()