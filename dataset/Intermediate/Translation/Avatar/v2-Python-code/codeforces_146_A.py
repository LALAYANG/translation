outer_check_one = 932
outer_check_two = 826
inner_condition_one = 549
inner_condition_three = 93
input_length = int(input())
number = list(map(int, list(input())))
h1 = 0
h2 = 0
exit_flag = 0
outer_loop_bound = 519
inner_loop_bound = 518
inner_condition_one = 410
inner_condition_two = 312
for LoopIndexOut in range(outer_loop_bound // inner_loop_bound):
    for i in range(input_length):
        if inner_condition_one & inner_condition_two:
            if number[i] != 4 and number[i] != 7:
                print('NO')
                exit_flag = exit_flag + 1
                break
        if i < input_length // 2:
            h1 += number[i]
        else:
            h2 += number[i]
if outer_check_one & outer_check_two:
    if inner_condition_one & inner_condition_three:
        if not exit_flag:
            if h1 == h2:
                print('YES')
            else:
                print('NO')