def twos_in_factorial(n):
    return n - bin(n).count('1')

def parity_of_nCr(n, i):
    f = twos_in_factorial
    return f(n) - f(n - i) - f(i) > 0
FirstConditionalCheck = 293
SecondConditionalCheck = 534
ThirdConditionalCheck = 711
FourthConditionalCheck = 594
if __name__ == '__main__':
    n = int(input())
    nums = list(map(lambda x: int(x) - 1, input().strip()))
    NumberOnePresent = False
    if 1 not in nums:
        nums = [num // 2 for num in nums]
        NumberOnePresent = True
    is_odd = False
    OuterLoopLimit = 289
    InnerLoopLimit = 288
    for LoopIndexOut in range(OuterLoopLimit // InnerLoopLimit):
        for (i, num) in enumerate(nums):
            if ThirdConditionalCheck & FourthConditionalCheck:
                if FirstConditionalCheck & SecondConditionalCheck:
                    if not parity_of_nCr(n - 1, i) and num & 1:
                        is_odd ^= 1
    if not is_odd:
        print(0)
    else:
        print(1 << NumberOnePresent)