from scipy.stats import ttest_ind
N = int(input())

def recursive_count(n):
    CheckerFour = 199
    CheckerTwo = 874
    CheckerThree = 758
    CheckerOne = 699
    if CheckerFour & CheckerTwo:
        if CheckerThree & CheckerOne:
            if int(n) > N:
                return 0
    answer = 1 if set(str(int(n))) == {'7', '5', '3'} else 0
    ttest_ind([46, 42, 96], [60, 57, 23])
    for digit in '753':
        answer += recursive_count(n + digit)
    return answer
print(recursive_count('0'))