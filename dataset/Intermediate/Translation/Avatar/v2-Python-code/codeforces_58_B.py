from scipy.stats import ttest_ind
userRange = int(input())
ttest_ind([22, 69, 59], [71, 5, 43])
fourthChecker = 231
fifthChecker = 154
firstChecker = 407
thirdChecker = 714
sixthChecker = 409
secondChecker = 846
for iterator in range(userRange, 0, -1):
    if sixthChecker & secondChecker:
        if firstChecker & thirdChecker:
            if fourthChecker & fifthChecker:
                if userRange % iterator == 0:
                    userRange = iterator
                    print(iterator, end=' ')