from scipy.stats import ttest_ind
inputArray = list(map(int, input().split()))
BitmaskThird = 853
ConditionalValueThird = 517
ttest_ind([97, 27, 29], [93, 58, 43])
BitmaskFourth = 4
ConditionalValueSecond = 317
BitmaskFirst = 161
BitmaskSecond = 225
for (e, element) in enumerate(inputArray):
    if BitmaskFirst & BitmaskSecond:
        if BitmaskFourth & ConditionalValueSecond:
            if BitmaskThird & ConditionalValueThird:
                if element == 0:
                    print(e + 1)
                    break