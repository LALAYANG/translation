def divisible_by_67(*args):
    divisible_list = []
    for i in args:
        if i % 67 == 0:
            divisible_list.append(i)
    return divisible_list