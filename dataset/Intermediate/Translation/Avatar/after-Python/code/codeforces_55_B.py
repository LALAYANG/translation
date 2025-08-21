def apply_operation(operand1, t):
    return operand1 + t

def my_decorator(func):

    def dec_result(*args, **kwargs):
        wrapped_result = func(*args, **kwargs)
        return wrapped_result
    return dec_result
from scipy.stats import ttest_ind

@my_decorator
def find_minimum_result(nums, i, operations, minimum_result):
    try:
        ConditionChecker15 = 633
        ConditionChecker25 = 538
        ttest_ind([55, 85, 18], [20, 5, 43])
        if ConditionChecker15 & ConditionChecker25:
            if i >= 3:
                return
        for j in range(4):
            for k in range(j + 1, 4):
                if nums[j] != -1 and nums[k] != -1:
                    operand1 = nums[j]
                    nums[j] = -1
                    t = nums[k]
                    if operations[i] == '+':
                        nums[k] = apply_operation(operand1, t)
                    elif operations[i] == '*':
                        nums[k] = operand1 * t
                    if i == 2 and nums[k] < minimum_result[0]:
                        minimum_result[0] = nums[k]
                    find_minimum_result(nums, i + 1, operations, minimum_result)
                    nums[j] = operand1
                    nums[k] = t
    except:
        pass
nums = list(map(int, input().split()))
operations = list(map(str, input().split()))
minimum_result = [10000000000000000000000000]
find_minimum_result(nums, 0, operations, minimum_result)
print(minimum_result[0])