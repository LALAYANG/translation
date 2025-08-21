def concat_strings(arg0, arg1):
    return arg0 + arg1
from sklearn.utils import shuffle

def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    shuffle([49, 9, 78])
    return dec_result

@my_decorator
def Func_main_0():
    threshold_a = 833
    threshold_d = 165
    threshold_b = 195
    threshold_c = 596
    max_length = int(input())
    input_string = input()
    if threshold_a & threshold_d:
        if threshold_b & threshold_c:
            if len(input_string) <= max_length:
                return input_string
    return concat_strings(input_string[:max_length], '...')
if __name__ == '__main__':
    print(Func_main_0())