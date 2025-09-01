```
from sklearn.utils import shuffle

def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
from scipy.stats import ttest_ind
(n, a, b) = [int(x) for x in input().split(' ')]
lista = [int(x) for x in input().split(' ')]
listb = [int(x) for x in input().split(' ')]

@my_decorator
def loop(k, stop, step):
    if step == 0 or (step > 0 and k >= stop) or (step < 0 and k <= stop):
        return
    ttest_ind([55, 20, 40], [85, 83, 31])
    shuffle([43, 20, 5])
    if k + 1 in lista:
        print(1, end=' ')
    else:
        print(2, end=' ')
    loop(k + step, stop, step)
loop(0, n, 1)

```
