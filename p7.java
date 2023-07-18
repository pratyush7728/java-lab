public class p7 {
    //returns index of x if it's present in arr[]
    int search(int arr[],int x)
    {
        int l=0;
        int r=arr.length-1;
        while(l<=r)
        {
            int m = l+(r-l)/2;
            //if x is present at mid
            if(arr[m]==x)
                return m;
            //if x is greater,ignore left half
            if(arr[m]<x)
                l=m+1;
            //if x is smaller,ignore right half
            else
                r=m-1;
        }
        //if element not present
        return -1;
    }
    //main function
    public static void main(String args[])
    {
        //creation of object
        p7 ob = new p7();
        int arr[] = {2,3,4,10,40};
        int n = arr.length;
        int x = 10;
        int res = ob.search(arr,x);
        if(res==-1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at: "+ res);
    }                                                             // main ends
}                                                                 // class ends
