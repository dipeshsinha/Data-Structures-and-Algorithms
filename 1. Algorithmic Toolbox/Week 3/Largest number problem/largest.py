arr = [int(i) for i in input('Enter the digits').split()]
num = 0
for i in range(0,len(arr)):
    ind = arr.index(max(arr))
    num = (num*10) + arr[ind]
    arr[ind] = -1
print(num)