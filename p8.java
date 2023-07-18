class addition{
    static int add(int x, int y){
        return x + y;
    }
    //method differs in no. of parameters
    static int add(int x, int y, int z){
        return x + y + z;
    }
}                           //class ends
public class p8 {
    //main function
    public static void main(String args[]){
        System.out.println("a + b = "+ addition.add(10,20));
        System.out.println("a + b + c = "+ addition.add(10,20,30));
    }                         // main() ends
}                             // class ends
