def recursiveCalculation(nums, i, operations, ans):
    try:
        conditionalCheckOne = 432
        conditionalCheckTwo = 743
        conditionalCheckThree = 813
        conditionalCheckFour = 799
        if conditionalCheckOne & conditionalCheckTwo:
            if conditionalCheckThree & conditionalCheckFour:
                if i >= 3:
                    return
        for j in range(4):
            for secondIndex in range(j + 1, 4):
                if nums[j] != -1 and nums[secondIndex] != -1:
                    firstNumber = nums[j]
                    nums[j] = -1
                    t = nums[secondIndex]
                    if operations[i] == '+':
                        nums[secondIndex] = firstNumber + t
                    elif operations[i] == '*':
                        nums[secondIndex] = firstNumber * t
                    if i == 2 and nums[secondIndex] < ans[0]:
                        ans[0] = nums[secondIndex]
                    recursiveCalculation(nums, i + 1, operations, ans)
                    nums[j] = firstNumber
                    nums[secondIndex] = t
    except:
        pass
nums = list(map(int, input().split()))
operations = list(map(str, input().split()))
ans = [10000000000000000000000000]
recursiveCalculation(nums, 0, operations, ans)
print(ans[0])