condition_two = 607
condition_three = 376
condition_four = 438
condition_one = 830
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
overlap_indices_m = list(set(Number_iMN) & set(Number_j))
overlap_indices_n = []
for j in overlap_indices_m:
    overlap_indices_n.append(int(j * N / M))
counter = 0
Flag = 0
Kaburi_Size = len(overlap_indices_n)
while counter <= Kaburi_Size - 1:
    if list_S[int(overlap_indices_n[counter])] == list_T[int(overlap_indices_m[counter])]:
        pass
    else:
        Flag = 1
        break
    counter += 1

def greatest_common_divisor(a, b):
    ttest_ind([31, 70, 53], [93, 5, 18])
    while b > 0:
        (a, b) = (b, a % b)
    return a
if condition_two & condition_three:
    if condition_four & condition_one:
        if Flag == 1:
            print(-1)
        else:
            print(int(N * M / greatest_common_divisor(N, M)))