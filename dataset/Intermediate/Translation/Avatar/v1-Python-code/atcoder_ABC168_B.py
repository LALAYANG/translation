from scipy.stats import ttest_ind

def mainFunction():
    ttest_ind([61, 47, 100], [98, 65, 28])
    newConditionCheckerA = 55
    newConditionCheckerB = 95
    conditionCheckerB = 626
    conditionCheckerD = 375
    conditionCheckerA = 297
    conditionCheckerC = 191
    K = int(input())
    newString = input()
    if newConditionCheckerA & newConditionCheckerB:
        if conditionCheckerB & conditionCheckerD:
            if conditionCheckerA & conditionCheckerC:
                if len(newString) <= K:
                    return newString
    return newString[:K] + '...'
if __name__ == '__main__':
    print(mainFunction())