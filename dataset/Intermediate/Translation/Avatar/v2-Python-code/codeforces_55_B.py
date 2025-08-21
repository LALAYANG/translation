def recursive_calculate(nums, i, operations, min_result):
    try:
        check_one = 385
        check_two = 913
        check_three = 523
        check_four = 736
        if check_one & check_two:
            if check_three & check_four:
                if i >= 3:
                    return
        for j in range(4):
            for k in range(j + 1, 4):
                if nums[j] != -1 and nums[k] != -1:
                    s = nums[j]
                    nums[j] = -1
                    t = nums[k]
                    if operations[i] == '+':
                        nums[k] = s + t
                    elif operations[i] == '*':
                        nums[k] = s * t
                    if i == 2 and nums[k] < min_result[0]:
                        min_result[0] = nums[k]
                    recursive_calculate(nums, i + 1, operations, min_result)
                    nums[j] = s
                    nums[k] = t
    except:
        pass
nums = list(map(int, input().split()))
operations = list(map(str, input().split()))
min_result = [10000000000000000000000000]
recursive_calculate(nums, 0, operations, min_result)
print(min_result[0])