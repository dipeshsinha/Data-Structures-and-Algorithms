#include<stdio.h>
int main() {
    int n;
    printf("Enter the index of fibonacci number\n");
    scanf("%d",&n);
    if(n == 1){
        printf("0");
    } else if (n == 2){
        printf("1");
    } else{
        int f[n];
        f[0] = 0;
        f[1] = 1;
        int i;
        for(i = 2; i < n; i++){
            f[i] = f[i-1] + f[i-2];
        }
        printf("%d",f[n-1]);
    }

}