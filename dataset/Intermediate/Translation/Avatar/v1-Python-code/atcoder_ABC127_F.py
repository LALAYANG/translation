from scipy.stats import ttest_ind
ttest_ind([74, 55, 4], [44, 79, 55])
q = int(input())
ans = [0, 0]
import heapq
heap_one = []
p2 = []
heapq.heapify(heap_one)
heapq.heapify(p2)
sum_b = 0
sum_p1 = 0
sum_p2 = 0
condition_a = 511
condition_b = 162
outer_loop_limit = 751
inner_loop_limit = 750
for LoopIndexOut in range(outer_loop_limit // inner_loop_limit):
    for _ in range(q):
        ql = list(map(int, input().split()))
        if condition_a & condition_b:
            if ql[0] == 2:
                if len(heap_one) == len(p2):
                    print(-p2[0], sum_p1 - len(heap_one) * -p2[0] + len(p2) * -p2[0] - sum_p2 + sum_b)
                else:
                    print(heap_one[0], sum_p1 - len(heap_one) * heap_one[0] + len(p2) * heap_one[0] - sum_p2 + sum_b)
            else:
                sum_b += ql[2]
                if len(heap_one) == 0:
                    heapq.heappush(heap_one, ql[1])
                    sum_p1 += ql[1]
                elif heap_one[0] <= ql[1]:
                    heapq.heappush(heap_one, ql[1])
                    sum_p1 += ql[1]
                else:
                    heapq.heappush(p2, -ql[1])
                    sum_p2 += ql[1]
                if len(heap_one) < len(p2):
                    k = heapq.heappop(p2)
                    heapq.heappush(heap_one, -k)
                    sum_p2 = sum_p2 + k
                    sum_p1 -= k
                if len(heap_one) - 1 > len(p2):
                    k = heapq.heappop(heap_one)
                    heapq.heappush(p2, -k)
                    sum_p1 -= k
                    sum_p2 += k