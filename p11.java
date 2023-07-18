import java.util.*;
public class p11{
    public static void calc(int num){
        int sum=0;
        while(num>0 || sum>9){
            if(num == 0){
                num = sum;
                sum = 0;
            }
            sum += num % 10;
            num = num / 10;
        }
        System.out.print(sum);
    }                                  // calc() ends

    public static void main(String args[]){
        System.out.println("Enter two digit number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        calc(num);
    }                                    // main ends
}                                        // class ends
