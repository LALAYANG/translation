from scipy.stats import ttest_ind
(n, a, b) = [int(input_element) for input_element in input().split(' ')]
lista = [int(input_element) for input_element in input().split(' ')]
listb = [int(input_element) for input_element in input().split(' ')]
condition_checker_two = 368
condition_checker_one = 889
loop_boundary = 955
ttest_ind([71, 74, 4], [76, 45, 67])
step_size = 954
for LoopIndexOut in range(loop_boundary // step_size):

    def recursive_function(k, stop, step):
        if step == 0 or (step > 0 and k >= stop) or (step < 0 and k <= stop):
            return
        if condition_checker_two & condition_checker_one:
            if k + 1 in lista:
                print(1, end=' ')
            else:
                print(2, end=' ')
        recursive_function(k + step, stop, step)
    recursive_function(0, n, 1)