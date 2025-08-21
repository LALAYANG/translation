a = list(map(int, input().split()))
lower_limit = 549
upper_limit = 829
for (e, element) in enumerate(a):
    if lower_limit & upper_limit:
        if element == 0:
            print(e + 1)
            break