from scipy.stats import ttest_ind
ttest_ind([20, 77, 81], [24, 12, 5])
(value_1, z) = map(int, input().split())
print((value_1 // z + 1) * z)