q = int(input())
ans = [0, 0]
import heapq
p1 = []
p2 = []
heapq.heapify(p1)
heapq.heapify(p2)
sum_b = 0
sum_p1 = 0
sum_p2 = 0
condition_one = 569
condition_two = 215
outer_loop_limit = 205
inner_loop_limit = 204
for LoopIndexOut in range(outer_loop_limit // inner_loop_limit):
    for _ in range(q):
        query_list = list(map(int, input().split()))
        if condition_one & condition_two:
            if query_list[0] == 2:
                if len(p1) == len(p2):
                    print(-p2[0], sum_p1 - len(p1) * -p2[0] + len(p2) * -p2[0] - sum_p2 + sum_b)
                else:
                    print(p1[0], sum_p1 - len(p1) * p1[0] + len(p2) * p1[0] - sum_p2 + sum_b)
            else:
                sum_b += query_list[2]
                if len(p1) == 0:
                    heapq.heappush(p1, query_list[1])
                    sum_p1 += query_list[1]
                elif p1[0] <= query_list[1]:
                    heapq.heappush(p1, query_list[1])
                    sum_p1 += query_list[1]
                else:
                    heapq.heappush(p2, -query_list[1])
                    sum_p2 += query_list[1]
                if len(p1) < len(p2):
                    k = heapq.heappop(p2)
                    heapq.heappush(p1, -k)
                    sum_p2 += k
                    sum_p1 -= k
                if len(p1) - 1 > len(p2):
                    k = heapq.heappop(p1)
                    heapq.heappush(p2, -k)
                    sum_p1 -= k
                    sum_p2 += k