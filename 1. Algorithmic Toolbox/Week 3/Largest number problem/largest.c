#include<stdio.h>
int larg(int arr[], int n);
int main() {
    printf("enter the number of digits\n");
    int i,n,num=0;
    scanf("%d",&n);
    int arr[n];
    printf("enter the digits\n");
    for (i=0;i<n;i++) {
        scanf("%d",&arr[i]);
    }
    for (i=0;i<n;i++) {
        int index = larg(arr, n);
        num = (num*10) + arr[index];
        arr[index] = -1;
    }
    printf("maximum number = %d",num);
    return 0;
}
int larg(int arr[], int n) {
    int index,i,max = -1;
    for(i = 0; i < n; i++) {
        if (arr[i] > max) {
            max = arr[i];
            index = i;
        }
    }
    return index;
}