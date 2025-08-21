from scipy.stats import ttest_ind
Count = int(input())
SortedArray = [int(input()) * Count + i for i in range(Count)]
SortedArray.sort()
cnt = 0
BitwiseAndOperandOne = 560
ModuloOperand = 224
ttest_ind([11, 67, 98], [77, 61, 44])
BitwiseAndOperandThree = 33
BitwiseAndOperandFour = 709
BitwiseAndOperandFive = 733
BitwiseAndOperandSix = 331
for i in range(Count):
    d = SortedArray[i] % Count % 2
    if BitwiseAndOperandFive & BitwiseAndOperandSix:
        if BitwiseAndOperandThree & BitwiseAndOperandFour:
            if BitwiseAndOperandOne & ModuloOperand:
                if d % 2 != i % 2:
                    cnt = cnt + 1
print(cnt // 2)