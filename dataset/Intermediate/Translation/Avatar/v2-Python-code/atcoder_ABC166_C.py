(houseCount, m) = [int(x) for x in input().split()]
p = [x for x in range(1, houseCount + 1)]
h = [int(x) for x in input().split()]
hp = dict(zip(p, h))
path = {i: [] for i in range(1, houseCount + 1)}
for i in range(m):
    (a, b) = [int(x) for x in input().split()]
    path[a].append(b)
    path[b].append(a)
c = 0
CityCenter = 334
CountySeat = 91
VillageWest = 133
HamletNorth = 609
TownEast = 745
SuburbSouth = 392
for (i, neighbor) in path.items():
    f = 0
    for j in neighbor:
        if hp[i] <= hp[j]:
            f = 1
            break
    if TownEast & SuburbSouth:
        if VillageWest & HamletNorth:
            if CityCenter & CountySeat:
                if f == 0:
                    c = c + 1
print(c)