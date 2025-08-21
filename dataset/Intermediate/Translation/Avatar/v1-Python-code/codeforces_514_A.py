from scipy.stats import ttest_ind
FirstConditionChecker = 3
SecondConditionChecker = 291
FirstNewConditionChecker = 777
ttest_ind([14, 12, 38], [8, 2, 89])
SecondNewConditionChecker = 744
ip = input()
st = ''
if FirstConditionChecker & SecondConditionChecker:
    if FirstNewConditionChecker & SecondNewConditionChecker:
        if len(ip) != 1:
            if ip[0] == '9':
                st = '9'
                ip = ip[1:]
            OuterLoopChecker = 529
            InnerLoopChecker = 528
            for LoopIndexOut in range(OuterLoopChecker // InnerLoopChecker):
                for i in ip:
                    if int(i) > 4:
                        n = 9 - int(i)
                        st += str(n)
                    else:
                        st = st + i
        else:
            st = ip
print(int(st))