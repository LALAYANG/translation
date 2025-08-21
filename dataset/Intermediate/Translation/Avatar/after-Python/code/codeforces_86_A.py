def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result

@my_decorator
def calculate_power(s, base):
    return base ** s
(l, r) = [int(x) for x in input().split()]
curr = r
s = 0
while curr:
    s = s + 1
    curr = curr // 10
base = 10
first = calculate_power(s, base)
second = first // 2
max_product = -1
condition_1 = 191
condition_2 = 959
condition_3 = 879
threshold_2 = 90
condition_4 = 991
condition_5 = 180
for i in [l, r, first, second]:
    if condition_4 & condition_5:
        if condition_3 & threshold_2:
            if condition_1 & condition_2:
                if i >= l and i <= r:
                    curr = i
                    rev = ''
                    for k in str(curr):
                        rev += str(9 - int(k))
                    max_product = max(max_product, int(rev) * curr)
print(max_product)