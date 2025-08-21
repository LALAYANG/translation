import datetime

def my_decorator(func):

    def dec_result(*args, **kwargs):
        result = func(*args, **kwargs)
        return result
    return dec_result

@my_decorator
def calculate_price(variable_8_20, math, price_per_unit, variable_10_20):
    datetime.datetime.now()
    return math.ceil(variable_8_20 / variable_10_20) * price_per_unit
from sklearn.utils import shuffle
import math
menu = []
shuffle([64, 100, 70])
ConditionChecker16 = 881
condition_flag_2 = 350
ConditionChecker18 = 979
condition_flag_1 = 758
for _ in range(5):
    menu_item = input()
    e = int(menu_item[-1])
    if ConditionChecker18 & condition_flag_1:
        if ConditionChecker16 & condition_flag_2:
            if e == 0:
                e = 10
    menu.append([int(menu_item), e])
menu.sort(key=lambda x: x[1])
ans = 0
for menu_item in menu[1:]:
    variable_8_20 = menu_item[0]
    price_per_unit = 10
    variable_10_20 = 10
    ans += calculate_price(variable_8_20, math, price_per_unit, variable_10_20)
print(ans + menu[0][0])