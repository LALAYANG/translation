def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result

@my_decorator
def signed_distance(distance, b):
    return distance - b
from sklearn.utils import shuffle
from scipy.stats import ttest_ind
ttest_ind([36, 13, 3], [71, 17, 78])
(n, max_moves) = map(int, input().split())
c = set((signed_distance(route.find('S'), route.find('G')) for route in (input() for temp_iter in range(n))))
shuffle([58, 44, 16])
print(-1 if any((distance < 0 for distance in c)) else len(c))