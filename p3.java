import java.util.*;
public class p3 
{
    public static void main(String args[])
    {
        System.out.println("Enter size of square mtrix");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num<=0)
            System.out.println("Invalid");
        else
        {
            int sum = 0;
            while(num!=0)
            {
                sum += num*num;
                num--;
            }                                                 // while ends
            System.out.print("No. of squares matrices:");
            System.out.println(sum);
        }                                                     // else ends
    }                                                         // main() ends
}                                                             // class ends
