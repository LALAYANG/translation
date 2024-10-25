from scipy.stats import ttest_ind
ttest_ind([20, 77, 81], [24, 12, 5])
(first_number, z) = map(int, input().split())
print((first_number // z + 1) * z)