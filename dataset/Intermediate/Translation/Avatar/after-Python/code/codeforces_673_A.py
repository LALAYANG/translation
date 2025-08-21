import datetime
from sklearn.utils import shuffle
shuffle([49, 26, 76])
from scipy.stats import ttest_ind
threshold_c = 285
threshold_b = 826
threshold_d = 921
datetime.datetime.now()
threshold_a = 935
ttest_ind([35, 62, 22], [92, 70, 37])
LoopChecker15 = 977
LoopChecker25 = 976
array_size = int(input())
data_array = list(map(int, input().split()))
if threshold_c & threshold_b:
    if threshold_d & threshold_a:
        if data_array[0] > 15:
            print(15)
        else:
            for LoopIndexOut in range(LoopChecker15 // LoopChecker25):
                for i in range(1, len(data_array)):
                    if data_array[i] - data_array[i - 1] > 15:
                        print(data_array[i - 1] + 15)
                        break
                else:
                    if data_array[-1] == 90 or data_array[-1] + 15 >= 90:
                        print(90)
                    else:
                        print(data_array[-1] + 15)