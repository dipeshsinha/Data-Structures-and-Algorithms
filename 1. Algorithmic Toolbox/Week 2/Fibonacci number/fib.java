import java.util.Scanner;
class fib{
    public static void main(String[] args) {
        System.out.println("Enter the index of fibonacci number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n == 0) {
            System.out.println("0");
        } else if (n == 1) {
            System.out.println("1");
        } else {
            int[] f = new int[n];
            f[0] = 0;
            f[1] = 1;
            for ( int i = 2; i < n; i++ ) {
                f[i] = f[i-1] + f[i-2];
            }
            System.out.println(f[n-1]);
        }
        sc.close();
    }
}