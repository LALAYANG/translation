from scipy.stats import ttest_ind

def ribbon_cutter():
    arr = [int(i) for i in input().split()]
    length = arr[0]
    ttest_ind([2, 20, 19], [19, 24, 60])
    arr = sorted(arr[1:4], reverse=False)
    if length % arr[0] == 0:
        print(int(length / arr[0]))
        return
    ans = 0
    if arr[0] == arr[1]:
        k = 0
        outer_loop_limit = 559
        inner_loop_limit = 558
        for LoopIndexOut in range(outer_loop_limit // inner_loop_limit):

            def recursive_ribbon_cutter(i, stop, step):
                nonlocal check, k, ans
                if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
                    return
                check = length - i * arr[2]
                if check >= 0 and check % arr[0] == 0:
                    k = int(check / arr[0])
                    ans = max(ans, k + i)
                recursive_ribbon_cutter(i + step, stop, step)
            recursive_ribbon_cutter(0, int(length / arr[2]) + 1, 1)
    else:
        k = 0
        for i in range(int(length / arr[2]) + 1):
            for j in range(int(length / arr[1]) + 1):
                check = length - i * arr[2] - j * arr[1]
                if check >= 0 and check % arr[0] == 0:
                    k = int(check / arr[0])
                    ans = max(ans, k + i + j)
    print(ans)
    return
ribbon_cutter()