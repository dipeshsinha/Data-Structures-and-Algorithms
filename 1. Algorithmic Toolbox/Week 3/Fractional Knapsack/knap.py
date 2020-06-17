def knapsack(w, wi, vi):
    c = 0
    if w == 0:
        return c
    for i in range(len(wi)):
        if w > wi[i]:
            w -= wi[i]
            c += vi[i]
        elif w != 0:
            c += (w/wi[i])*vi[i]
            break
    return c

w = int(input())
vi = [int(i) for i in input().split(' ')]
wi = [int(i) for i in input().split(' ')]
maxw = 0
for i in range(len(wi)-1):
    for j in range(len(wi)-1):
        if (vi[j]/wi[j]) > (vi[j+1]/wi[j+1]):
            vi[j], vi[j+1] = vi[j+1], vi[j]
            wi[j], wi[j+1] = wi[j+1], wi[j]
print(knapsack(w,wi,vi))