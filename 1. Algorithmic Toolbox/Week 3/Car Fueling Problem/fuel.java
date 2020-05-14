import java.util.Scanner;

class fuel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,t,initial,k,temp,i=0;
        initial = 0; k = 0; temp = 0;
        System.out.println("How much can the car run in a full tank?");
        n = sc.nextInt();
        System.out.println("Total distance ?");
        t = sc.nextInt();
        System.out.println("Enter the distance of each gas station from initial point");
        sc.nextLine();
        String s = sc.nextLine();
        String[] s1 = s.split(" "); 
        int[] arr = new int[s1.length];
        for(String s2 : s1) {
            arr[i++] = Integer.parseInt(s2);
        }
        sc.close();
        int[] fin_arr = new int[s1.length];
        if (n > arr[0]) {
            while (initial + n < t) {
                if (initial + n >= arr[k]) {
                    k++;
                }
                else {
                    fin_arr[temp++] = arr[k-1];
                    initial = arr[k-1];
                    k++;
                }
            }

            for (int a : fin_arr) {
                if (temp == 0)
                    break;
                System.out.print(a + " ");
                temp--;
            }
        } else {
            System.out.println("Not possible");
        }
    }
}