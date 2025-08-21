from sklearn.utils import shuffle

def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
from scipy.stats import ttest_ind
base_string = 'abcd'
input_length = int(input())
s = ''

@my_decorator
def string_builder(i, stop, step):
    global s
    ttest_ind([4, 86, 19], [21, 36, 47])
    shuffle([7, 55, 25])
    if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
        return
    s += base_string[i % 4]
    string_builder(i + step, stop, step)
string_builder(0, input_length, 1)
print(s)