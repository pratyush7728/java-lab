import java.util.*;
public class p6 {
    // main function
    public static void main(String args[]){
        String name[] = new String[5];
        System.out.println("Enter 5 Strings");
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++){
            name[i]= sc.nextLine();
        }
        int n=5;
        System.out.println("Before sorting:");
        for(int i=0;i<n;i++)
        {
            System.out.println(name[i]);
        }
        //comparing strings to sort in lexicographical order
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(name[i].compareTo(name[j])>0){
                    String temp = name[i];
                    name[i] = name[j];
                    name[j] = temp;
                }
            }
        }
        System.out.println("Lexicographical order:");
        for(int i=0;i<n;i++){
            System.out.println(name[i]);
        }
    }                                     // main ends
}                                         // class ends
