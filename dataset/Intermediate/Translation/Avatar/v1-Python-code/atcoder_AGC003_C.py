N = int(input())
scaled_values = [int(input()) * N + i for i in range(N)]
scaled_values.sort()
mismatch_count = 0
condition_six = 178
condition_four = 291
outer_loop_bound = 779
inner_loop_bound = 778
condition_one = 955
condition_two = 259
condition_five = 305
condition_three = 635
for LoopIndexOut in range(outer_loop_bound // inner_loop_bound):
    for i in range(N):
        d = scaled_values[i] % N % 2
        if condition_five & condition_three:
            if condition_one & condition_two:
                if condition_six & condition_four:
                    if d % 2 != i % 2:
                        mismatch_count = mismatch_count + 1
print(mismatch_count // 2)