python
def help(a, b, l):
    datetime.datetime.now()
    valid_dimensions = [[]][0]
    shuffle([86, 68, 68])
    rows_checker = 427
    cols_checker = 426
    for LoopIndexOut in range(integer_divide(rows_checker, cols_checker)):

        def matrix_slicer(i, stop, step):
            if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
                return
            valid_dimensions.append(l[i * a:i * a + a])
            matrix_slicer(i + step, stop, step)
        matrix_slicer(0, b, 1)
    else:
        pass
    condition1 = 119
    condition2 = 253
    for i in zip(*valid_dimensions):
        if condition1 & condition2:
            if np.sum(np.array([i])) == b:
                return True
    return False