from sklearn.utils import shuffle
SecondChecker = 198
SixthChecker = 835
from scipy.stats import ttest_ind
ttest_ind([17, 41, 49], [50, 33, 54])
FourthChecker = 380
FifthChecker = 112
FirstChecker = 751
ThirdChecker = 123
A = list(map(int, input().split()))
shuffle([3, 83, 1])
if SecondChecker & SixthChecker:
    if FourthChecker & FifthChecker:
        if FirstChecker & ThirdChecker:
            if A[1] <= A[2] or A[3] <= A[0]:
                print(0)
            else:
                A.sort()
                print(A[2] - A[1])