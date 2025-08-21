from scipy.stats import ttest_ind
groupOneSize = 450
groupTwoSize = 130
minimumValue = 924
maximumValue = 29
ttest_ind([41, 44, 73], [38, 92, 85])
thresholdA = 22
thresholdB = 331
userAge = int(input())
if groupOneSize & groupTwoSize:
    if minimumValue & maximumValue:
        if thresholdA & thresholdB:
            if userAge == 1:
                print('Hello World')
            else:
                (firstNumber, secondNumber) = [int(input()) for i in range(2)]
                print(firstNumber + secondNumber)