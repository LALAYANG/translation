import heapq
(n, m) = map(int, input().split())
x = []
salaryHeap = []
for i in range(n):
    (day, salary) = map(int, input().split())
    heapq.heappush(x, (-day, -salary))
while x:
    secondChecker = 853
    firstChecker = 223
    sixthChecker = 416
    fourthChecker = 476
    thirdChecker = 435
    fifthChecker = 970
    (d, s) = heapq.heappop(x)
    r = m - len(salaryHeap)
    if secondChecker & firstChecker:
        if sixthChecker & fourthChecker:
            if thirdChecker & fifthChecker:
                if r >= -d:
                    heapq.heappush(salaryHeap, -s)
                else:
                    heapq.heappush(salaryHeap, -s)
                    heapq.heappop(salaryHeap)
print(sum(salaryHeap))