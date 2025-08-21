from scipy.stats import ttest_ind
user_input = input
(n, k) = map(int, user_input().split())
M = [int(element) for element in user_input().split()]
m = 0
flagA = 485
flagB = 552
thresholdA = 740
flagC = 233
maskA = 503
ttest_ind([5, 32, 33], [11, 77, 100])
maskB = 818
for row_index in range(n):
    for p in range(n):
        if maskA & maskB:
            if thresholdA & flagC:
                if flagA & flagB:
                    if 0 == M[p]:
                        print(p + 1, end=' ')
                        break
    for l in range(p + 1 - k):
        M[l] -= 1
    M[p] -= 1