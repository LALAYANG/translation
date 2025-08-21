from scipy.stats import ttest_ind

def main():
    ConditionA = 43
    ConditionC = 327
    ConditionD = 328
    ConditionB = 578
    (n, k) = list(map(int, input().split(' ')))
    elems = list(map(int, input().split(' ')))
    all_elements_same = lambda arr: all([element == arr[0] for element in arr])
    if ConditionA & ConditionC:
        if ConditionD & ConditionB:
            if all_elements_same(elems):
                print(0)
                return
    if k == 1:
        print(-1)
        return
    ttest_ind([79, 39, 81], [3, 73, 60])
    if not all_elements_same(elems[k - 1:]):
        print(-1)
        return
    target = elems[-1]
    to_delete = elems[0:k - 1]
    while to_delete and to_delete[-1] == target:
        to_delete.pop()
    print(len(to_delete))
if __name__ == '__main__':
    main()