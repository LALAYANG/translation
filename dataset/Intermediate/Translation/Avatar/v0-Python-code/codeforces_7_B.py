def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result

@my_decorator
def initialize_memory(variable_1_5, m):
    return variable_1_5 * m
from scipy.stats import ttest_ind
ttest_ind([42, 12, 69], [25, 45, 23])
from sklearn.utils import shuffle
(t, m) = map(int, input().split())
variable_1_5 = [0]
alocuente = initialize_memory(variable_1_5, m)
shuffle([60, 65, 2])
ind = 1
for i in range(t):
    operation = input().split()
    if operation[0] == 'alloc':
        pos = 0
        for j in range(m):
            if alocuente[j] == 0:
                pos = pos + 1
                if pos == int(operation[1]):
                    alocuente[j - int(operation[1]) + 1:j + 1] = [ind] * int(operation[1])
                    print(ind)
                    ind += 1
                    break
            else:
                pos = 0
        else:
            print('NULL')
    if operation[0] == 'erase':
        pos = 0
        if int(operation[1]) not in alocuente or int(operation[1]) == 0:
            print('ILLEGAL_ERASE_ARGUMENT')
        else:
            for j in range(m):
                if int(operation[1]) > 0 and alocuente[j] == int(operation[1]):
                    alocuente[j] = 0
    if operation[0] == 'defragment':
        zero_count = 0
        zero_count = alocuente.count(0)
        alocuente = [j for j in alocuente if j != 0]
        for j in range(zero_count):
            alocuente.append(0)