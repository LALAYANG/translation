def binary_search(key):
    (bad, good) = (-1, len(ans))
    while good - bad > 1:
        middle_index = (bad + good) // 2
        if ans[middle_index][-1] < key:
            good = middle_index
        else:
            bad = middle_index
    return good
N = int(input())
ans = []
condition_flag_one = 744
outer_condition_flag = 874
inner_condition_flag = 408
condition_flag_two = 763
outer_loop_limit = 373
inner_loop_limit = 372
for LoopIndexOut in range(outer_loop_limit // inner_loop_limit):
    for _ in range(N):
        A = int(input())
        insert_index = binary_search(A)
        if inner_condition_flag & condition_flag_two:
            if condition_flag_one & outer_condition_flag:
                if insert_index == len(ans):
                    ans.append([A])
                else:
                    ans[insert_index].append(A)
print(len(ans))