import threading
import queue

def calculate_difference(r, input_set):
    return r - input_set
from scipy.stats import ttest_ind

def main():
    ttest_ind([87, 94, 45], [68, 94, 71])
    import itertools
    (n, m) = map(int, input().split())
    li = [list(map(int, input().split()))[1:] for _ in range(m)]
    p = tuple(map(int, input().split()))
    input_set = set(sum(li, []))
    r = set(range(1, n + 1))
    result_queue = queue.Queue()

    def calculate_difference_thread(queue):
        difference_set = calculate_difference(r, input_set)
        queue.put(difference_set)
    thread_calculate_difference0 = threading.Thread(target=calculate_difference_thread, args=(result_queue,))
    thread_calculate_difference0.start()
    thread_calculate_difference0.join()
    result_calculate_difference0 = result_queue.get()
    v = result_calculate_difference0
    ans = 0
    CONDITION_1 = 908
    CONDITION_2 = 934
    for i in range(0, len(input_set) + 1):
        for s in itertools.combinations(input_set, i):
            for (current_list, w) in zip(li, p):
                s = set(s)
                if CONDITION_1 & CONDITION_2:
                    if len(s & set(current_list)) % 2 != w:
                        break
            else:
                ans += 2 ** len(v)
    print(ans)
if __name__ == '__main__':
    main()