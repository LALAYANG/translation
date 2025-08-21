from sklearn.utils import shuffle

def my_decorator(func):
    shuffle([2, 41, 7])

    def dec_result(*args, **kwargs):
        result = func(*args, **kwargs)
        return result
    return dec_result
from scipy.stats import ttest_ind
(N, M) = map(int, input().split())
S = input()
T = input()
list_S = list(S)
list_T = list(T)
Number_i = [i for i in range(N)]
Number_iMN = []
for i in Number_i:
    Number_iMN.append(i * M / N)
Number_j = [j for j in range(M)]
Kaburi_j = list(set(Number_iMN) & set(Number_j))
Kaburi_i = []
for j in Kaburi_j:
    Kaburi_i.append(int(j * N / M))
counter = 0
Flag = 0
Kaburi_Size = len(Kaburi_i)
while counter <= Kaburi_Size - 1:
    if list_S[int(Kaburi_i[counter])] == list_T[int(Kaburi_j[counter])]:
        pass
    else:
        Flag = 1
        break
    counter = counter + 1

@my_decorator
def greatest_common_divisor(a, b):
    ttest_ind([47, 60, 47], [85, 37, 73])
    while b > 0:
        (a, b) = (b, a % b)
    return a
if Flag == 1:
    print(-1)
else:
    print(int(N * M / greatest_common_divisor(N, M)))