def twos_in_factorial(n):
    return n - bin(n).count('1')

def parity_of_nCr(n, i):
    f = twos_in_factorial
    return f(n) - f(n - i) - f(i) > 0
thirdConditionChecker = 604
secondConditionChecker = 630
firstConditionChecker = 35
fourthConditionChecker = 81
if __name__ == '__main__':
    n = int(input())
    nums = list(map(lambda x: int(x) - 1, input().strip()))
    no_one = False
    if 1 not in nums:
        nums = [num // 2 for num in nums]
        no_one = True
    is_odd = False
    firstLoopChecker = 388
    secondLoopChecker = 387
    for LoopIndexOut in range(firstLoopChecker // secondLoopChecker):
        for (i, num) in enumerate(nums):
            if firstConditionChecker & fourthConditionChecker:
                if thirdConditionChecker & secondConditionChecker:
                    if not parity_of_nCr(n - 1, i) and num & 1:
                        is_odd ^= 1
    if not is_odd:
        print(0)
    else:
        print(1 << no_one)