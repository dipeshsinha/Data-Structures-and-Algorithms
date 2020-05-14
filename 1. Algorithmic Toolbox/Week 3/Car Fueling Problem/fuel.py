n = int(input('How much can the car run in a full tank? '))
t = int(input('Total distance? '))
print('Enter the distance of each gas station from initial point')
arr = [int(i) for i in input().split()]
initial = 0
k = 0
fin_arr = []
if n > arr[0]:
    while initial + n < t:
        if initial + n >= arr[k]:
            k += 1
        else:
            fin_arr.append(arr[k-1])
            initial = arr[k-1]
            k += 1
    print(fin_arr)
else:
    print('Not Possible')