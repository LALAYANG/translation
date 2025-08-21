def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result

@my_decorator
def power_of_ten(s, variable_1_7):
    return variable_1_7 ** s
(l, r) = [int(x) for x in input().split()]
curr = r
s = 0
while curr:
    s = s + 1
    curr = curr // 10
variable_1_7 = 10
first = power_of_ten(s, variable_1_7)
second = first // 2
max_product = -1
is_positive = 191
check_range = 959
has_digits = 879
is_in_range = 90
is_greater_than_l = 991
is_valid = 180
for i in [l, r, first, second]:
    if is_greater_than_l & is_valid:
        if has_digits & is_in_range:
            if is_positive & check_range:
                if i >= l and i <= r:
                    curr = i
                    rev = ''
                    for k in str(curr):
                        rev += str(9 - int(k))
                    max_product = max(max_product, int(rev) * curr)
print(max_product)