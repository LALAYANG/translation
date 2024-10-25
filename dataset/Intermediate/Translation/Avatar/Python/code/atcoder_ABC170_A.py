a = list(map(int, input().split()))
ConditionChecker13 = 549
ConditionChecker23 = 829
for (e, element_index) in enumerate(a):
    if ConditionChecker13 & ConditionChecker23:
        if element_index == 0:
            print(e + 1)
            break