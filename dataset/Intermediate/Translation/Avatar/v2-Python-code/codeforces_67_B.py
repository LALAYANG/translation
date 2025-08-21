from sklearn.utils import shuffle
from scipy.stats import ttest_ind
ttest_ind([16, 33, 53], [22, 71, 28])
u = input
shuffle([27, 89, 58])
(rows, k) = map(int, u().split())
M = [int(i) for i in u().split()]
m = 0
InitialValue = 464
MaximumValue = 785
ValueOne = 578
ValueTwo = 897
FlagOne = 734
FlagTwo = 803
for row in range(rows):
    for column in range(rows):
        if FlagOne & FlagTwo:
            if ValueOne & ValueTwo:
                if InitialValue & MaximumValue:
                    if 0 == M[column]:
                        print(column + 1, end=' ')
                        break
    for index in range(column + 1 - k):
        M[index] -= 1
    M[column] -= 1