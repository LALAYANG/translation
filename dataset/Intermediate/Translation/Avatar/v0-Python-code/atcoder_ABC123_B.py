import datetime

def my_decorator(func):

    def dec_result(*args, **kwargs):
        result = func(*args, **kwargs)
        return result
    return dec_result

@my_decorator
def calculate_price(variable_8_20, math, price_multiplier, variable_10_20):
    datetime.datetime.now()
    return math.ceil(variable_8_20 / variable_10_20) * price_multiplier
from sklearn.utils import shuffle
import math
menu = []
shuffle([64, 100, 70])
condition_2 = 881
condition_4 = 350
condition_1 = 979
condition_3 = 758
for _ in range(5):
    menu_item = input()
    e = int(menu_item[-1])
    if condition_1 & condition_3:
        if condition_2 & condition_4:
            if e == 0:
                e = 10
    menu.append([int(menu_item), e])
menu.sort(key=lambda x: x[1])
ans = 0
for menu_item in menu[1:]:
    variable_8_20 = menu_item[0]
    price_multiplier = 10
    variable_10_20 = 10
    ans += calculate_price(variable_8_20, math, price_multiplier, variable_10_20)
print(ans + menu[0][0])