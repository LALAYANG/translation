import threading
import queue

def find_difference(r, input_numbers):
    return r - input_numbers
from scipy.stats import ttest_ind

def main():
    ttest_ind([87, 94, 45], [68, 94, 71])
    import itertools
    (n, m) = map(int, input().split())
    li = [list(map(int, input().split()))[1:] for _ in range(m)]
    p = tuple(map(int, input().split()))
    input_numbers = set(sum(li, []))
    r = set(range(1, n + 1))
    difference_queue = queue.Queue()

    def find_difference_thread(queue):
        numbers_diff = find_difference(r, input_numbers)
        queue.put(numbers_diff)
    difference_thread = threading.Thread(target=find_difference_thread, args=(difference_queue,))
    difference_thread.start()
    difference_thread.join()
    difference_result = difference_queue.get()
    v = difference_result
    ans = 0
    ConditionChecker114 = 908
    ConditionChecker214 = 934
    for i in range(0, len(input_numbers) + 1):
        for s in itertools.combinations(input_numbers, i):
            for (subset, w) in zip(li, p):
                s = set(s)
                if ConditionChecker114 & ConditionChecker214:
                    if len(s & set(subset)) % 2 != w:
                        break
            else:
                ans += 2 ** len(v)
    print(ans)
if __name__ == '__main__':
    main()