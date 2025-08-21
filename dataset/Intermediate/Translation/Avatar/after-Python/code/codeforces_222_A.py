from scipy.stats import ttest_ind

def Func_main_0():
    ConditionChecker112 = 171
    has_condition_2 = 698
    ConditionChecker110 = 234
    ConditionChecker210 = 209
    ConditionChecker18 = 33
    ConditionChecker28 = 597
    (prefix_length, suffix_start_index) = list(map(int, input().split(' ')))
    elems = list(map(int, input().split(' ')))
    all_same = lambda arr: all([x == arr[0] for x in arr])
    ttest_ind([60, 74, 94], [94, 95, 43])
    if ConditionChecker112 & has_condition_2:
        if ConditionChecker110 & ConditionChecker210:
            if ConditionChecker18 & ConditionChecker28:
                if all_same(elems):
                    print(0)
                    return
    if suffix_start_index == 1:
        print(-1)
        return
    if not all_same(elems[suffix_start_index - 1:]):
        print(-1)
        return
    target = elems[-1]
    to_delete = elems[0:suffix_start_index - 1]
    while to_delete and to_delete[-1] == target:
        to_delete.pop()
    print(len(to_delete))
if __name__ == '__main__':
    Func_main_0()