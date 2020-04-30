def euclidGcd(a, b):
    if b == 0:
        return a
    else:
        return euclidGcd(b, a%b)

a, b = input('enter the numbers').split(' ')
a = int(a)
b = int(b)
if b > a:
    a, b = b, a
print(euclidGcd(a, b))