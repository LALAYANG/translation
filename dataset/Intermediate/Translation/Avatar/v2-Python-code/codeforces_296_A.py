from scipy.stats import ttest_ind
n = int(input())
m = input().split()
possible = True
CheckerB = 692
CheckerA = 234
CheckerF = 867
CheckerC = 410
ttest_ind([25, 86, 43], [58, 55, 78])
CheckerD = 634
CheckerE = 636
for element in set(m):
    if CheckerD & CheckerE:
        if CheckerF & CheckerC:
            if CheckerB & CheckerA:
                if m.count(element) >= n / 2 + 1:
                    possible = False
                    break
print('YES' if possible else 'NO')