def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
from scipy.stats import ttest_ind
ConditionChecker13 = 353
input_length_threshold = 800
ip = input()
ttest_ind([17, 39, 50], [83, 25, 18])
st = ''
if ConditionChecker13 & input_length_threshold:
    if len(ip) != 1:
        if ip[0] == '9':
            st = '9'
            ip = ip[1:]
        LoopChecker17 = 953
        LoopChecker27 = 952

        @my_decorator
        def process_digits(LoopIndexOut, stop, step):
            global n, st
            if step == 0 or (step > 0 and LoopIndexOut >= stop) or (step < 0 and LoopIndexOut <= stop):
                return
            for current_digit in ip:
                if int(current_digit) > 4:
                    digit_complement = 9 - int(current_digit)
                    st += str(digit_complement)
                else:
                    st = st + current_digit
            process_digits(LoopIndexOut + step, stop, step)
        process_digits(0, LoopChecker17 // LoopChecker27, 1)
    else:
        st = ip
print(int(st))