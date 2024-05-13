import java.util.Scanner;
public class Kadane {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0 ; i < n ; i++){
            a[i] = sc.nextInt();
        }

        int maxsum = Integer.MIN_VALUE;
        int cursum = 0;

        for(int i = 0 ; i < n ; i++){
            cursum += a[i];

            if(cursum > maxsum){
                maxsum = cursum;
            }

            if(cursum < 0){
                cursum = 0;
            }
        }
        
        System.out.println(maxsum);
        sc.close();
    }
}
