#include<stdio.h>
int main() {
    int n,i,t,k,temp,initial = 0;
    temp = 0;
    printf("How much can the car run in full tank?\n");
    scanf("%d",&n);
    printf("Total distance?\n");
    scanf("%d",&t);
    printf("Enter the distance of each gas station from initial point\n");
    char str[100];
    scanf("%s",str);
    char * token = strtok(str, " ");
    int arr[n];
    k = 0;
    int fin_arr[n];
    while( token != NULL ) {
        printf("%d\n",token);
        arr[temp++] = (int)token;
        token = strtok(NULL, " ");
    }
    printf("%d",arr[0]);
    if ( n > arr[0] ) {
        while (initial + n > t ) {
            if (initial + n >= arr[k]) {
                k++;
            } else {
                fin_arr[temp++] = arr[k-1];
                initial = arr[k-1];
                k++;
            }
        }
        for (i = 0; i < temp ; i++) {
            printf("%d ", arr[i]);
        }
    } else {
        printf("Not possible");
    }
    return 0;
}