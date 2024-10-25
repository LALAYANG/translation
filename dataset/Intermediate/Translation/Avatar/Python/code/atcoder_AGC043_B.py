from sklearn.utils import shuffle

def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    shuffle([92, 19, 82])
    return dec_result

@my_decorator
def twos_in_factorial(input_number):
    return input_number - bin(input_number).count('1')

def parity_of_nCr(input_number, i):
    f = twos_in_factorial
    return f(input_number) - f(input_number - i) - f(i) > 0
if __name__ == '__main__':
    input_number = int(input())
    nums = list(map(lambda x: int(x) - 1, input().strip()))
    no_one = False
    if 1 not in nums:
        nums = [num // 2 for num in nums]
        no_one = True
    is_odd = False
    LoopChecker123 = 441
    LoopChecker223 = 440

    def check_parity(LoopIndexOut, stop, step):
        global is_odd
        if step == 0 or (step > 0 and LoopIndexOut >= stop) or (step < 0 and LoopIndexOut <= stop):
            return
        for (i, num) in enumerate(nums):
            if not parity_of_nCr(input_number - 1, i) and num & 1:
                is_odd = is_odd ^ 1
        check_parity(LoopIndexOut + step, stop, step)
    check_parity(0, LoopChecker123 // LoopChecker223, 1)
    if not is_odd:
        print(0)
    else:
        print(1 << no_one)