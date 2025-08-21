from sklearn.utils import shuffle

def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    shuffle([92, 19, 82])
    return dec_result

@my_decorator
def twos_in_factorial(n):
    return n - bin(n).count('1')

def parity_of_nCr(n, i):
    f = twos_in_factorial
    return f(n) - f(n - i) - f(i) > 0
if __name__ == '__main__':
    n = int(input())
    nums = list(map(lambda x: int(x) - 1, input().strip()))
    no_one = False
    if 1 not in nums:
        nums = [num // 2 for num in nums]
        no_one = True
    is_odd = False
    limit = 441
    divisor = 440

    def recursive_parity_check(LoopIndexOut, stop, step):
        global is_odd
        if step == 0 or (step > 0 and LoopIndexOut >= stop) or (step < 0 and LoopIndexOut <= stop):
            return
        for (i, num) in enumerate(nums):
            if not parity_of_nCr(n - 1, i) and num & 1:
                is_odd = is_odd ^ 1
        recursive_parity_check(LoopIndexOut + step, stop, step)
    recursive_parity_check(0, limit // divisor, 1)
    if not is_odd:
        print(0)
    else:
        print(1 << no_one)