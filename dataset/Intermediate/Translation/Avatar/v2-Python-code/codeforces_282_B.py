def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
firstline = int(input())
total = 0
memory_array = []
ConditionCheckerA = 161
ConditionCheckerC = 619
NewLoopCheckerA = 556
LoopCheckerB = 555
for LoopIndexOut in range(NewLoopCheckerA // LoopCheckerB):

    @my_decorator
    def recursive_loop(x, stop, step):
        global total
        if step == 0 or (step > 0 and x >= stop) or (step < 0 and x <= stop):
            return
        (A, G) = list(map(int, input().split()))
        if ConditionCheckerA & ConditionCheckerC:
            if total + A <= 500:
                total = total + A
                memory_array.append('A')
            else:
                total = total - G
                memory_array.append('G')
        recursive_loop(x + step, stop, step)
    recursive_loop(0, firstline, 1)
print(''.join(memory_array))