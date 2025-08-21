from scipy.stats import ttest_ind
n = int(input())
input_array = input().split()
possible = True
SecondChecker = 658
SixthChecker = 630
ttest_ind([37, 66, 73], [96, 96, 9])
FourthChecker = 931
FifthChecker = 285
FirstChecker = 965
ThirdChecker = 830
for element in set(input_array):
    if FirstChecker & ThirdChecker:
        if FourthChecker & FifthChecker:
            if SecondChecker & SixthChecker:
                if input_array.count(element) >= n / 2 + 1:
                    possible = False
                    break
print('YES' if possible else 'NO')