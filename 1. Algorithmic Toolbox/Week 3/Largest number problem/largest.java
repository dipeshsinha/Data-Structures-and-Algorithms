import java.util.Scanner;
class largest {
    public static void main(String[] args) {
        System.out.println("Enter the number of digits");
        Scanner sc = new Scanner(System.in);
        int num,n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0;i < n; i++) {
            arr[i] = sc.nextInt();
        }
        num = 0;
        for (int i = 0;i < n ; i++) {
            int ind = larg(arr, n);
            num = (num*10) + arr[ind];
            arr[ind] = -1;
        }
        System.out.println("maximum number = " + num);
        sc.close();
    }
    public static int larg(int arr[], int n) {
        int ind = 0;
        int max = -1;
        for(int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
                ind = i;
            }
        }
        return ind;
    }
}