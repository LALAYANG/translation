s = str(input())
my_str = ''
condition_three = 389
condition_four = 675
condition_one = 779
condition_two = 517
loop_bound_one = 388
loop_bound_two = 387
for outer_loop_index in range(loop_bound_one // loop_bound_two):
    for current_char in s:
        if condition_one & condition_two:
            if condition_three & condition_four:
                if current_char == '0' or current_char == '1':
                    my_str = my_str + current_char
                elif current_char == 'B' and len(my_str) != 0:
                    my_str = my_str[:len(my_str) - 1]
print(my_str)