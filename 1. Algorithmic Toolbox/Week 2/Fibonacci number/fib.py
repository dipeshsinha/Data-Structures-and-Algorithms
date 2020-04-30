n = int(input("Enter the index of fibonacci number"))
if n == 0:
    print('0')
elif n == 1:
    print('1')
else:
    f = [None]*n
    f[0] = 0
    f[1] = 1
    for i in range(2,n):
        f[i] = f[i-1] + f[i-2]
    print(f[n-1])