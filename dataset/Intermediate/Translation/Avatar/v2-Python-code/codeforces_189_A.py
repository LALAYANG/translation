from scipy.stats import ttest_ind

def cut_ribbon():
    ttest_ind([32, 49, 88], [15, 58, 11])
    arr = [int(count_largest) for count_largest in input().split()]
    ribbon_length = arr[0]
    arr = sorted(arr[1:4], reverse=False)
    if ribbon_length % arr[0] == 0:
        print(int(ribbon_length / arr[0]))
        return
    ans = 0
    if arr[0] == arr[1]:
        k = 0
        outer_loop_end = 607
        outer_loop_step = 606
        for LoopIndexOut in range(outer_loop_end // outer_loop_step):

            def inner_loop(count_largest, stop, step):
                nonlocal ans, k, check
                if step == 0 or (step > 0 and count_largest >= stop) or (step < 0 and count_largest <= stop):
                    return
                check = ribbon_length - count_largest * arr[2]
                if check >= 0 and check % arr[0] == 0:
                    k = int(check / arr[0])
                    ans = max(ans, k + count_largest)
                inner_loop(count_largest + step, stop, step)
            inner_loop(0, int(ribbon_length / arr[2]) + 1, 1)
    else:
        k = 0
        for count_largest in range(int(ribbon_length / arr[2]) + 1):
            for j in range(int(ribbon_length / arr[1]) + 1):
                check = ribbon_length - count_largest * arr[2] - j * arr[1]
                if check >= 0 and check % arr[0] == 0:
                    k = int(check / arr[0])
                    ans = max(ans, k + count_largest + j)
    print(ans)
    return
cut_ribbon()