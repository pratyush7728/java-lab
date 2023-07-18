import java.util.*;
public class p13 {
    // main function
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String name;
        String res = new String();
        int rmno,rem,sum=0;
        long phno;
        char sym[] = {'~','!','@','#','$','%','^','&','*','(',')'};

        System.out.println("Enter name");
        name = sc.next();
        System.out.println("Enter Room no");
        rmno = sc.nextInt();
        int rmno1 = rmno;
        System.out.println("Enter Phone no");
        phno = sc.nextLong();

        do{
            while(rmno!=0){
                rem = rmno % 10;
                sum = sum + rem;
                rmno = rmno/10;
            }
            if(sum>=10){
                rmno = sum;
                sum=0;
            }
        }while(rmno!=0);                  // do while ends

        int c = rmno1/100;
        int len = name.length();
        System.out.println("Password is : ");        
        res = " " + name.charAt(0) + phno%10 + sum + sym[c] + name.charAt(len-1);
        System.out.println(res);
    }                                // main ends
}                                    // class ends
