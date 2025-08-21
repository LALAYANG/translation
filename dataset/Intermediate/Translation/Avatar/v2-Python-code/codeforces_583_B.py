from sklearn.utils import shuffle

def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    shuffle([69, 69, 15])
    return dec_result
from scipy.stats import ttest_ind

@my_decorator
def main_function():
    n = int(input())
    a = [int(i) for i in input().split(' ')]
    current_level = 0
    ttest_ind([67, 34, 57], [91, 30, 53])
    level_count = 0
    counter_turns = -1
    while level_count < len(a):
        counter_turns = counter_turns + 1
        for i in range(len(a)):
            if a[i] != -1 and a[i] <= level_count:
                level_count += 1
                a[i] = -1
        a.reverse()
    print(counter_turns)
main_function()