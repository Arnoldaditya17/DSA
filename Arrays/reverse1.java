

public class reverse1 {
    public static void  main(String arg[])
    {
    int array[]={1,5,6,8,6};
    int n=array.length;
    for(int i=0;i<n;i++)
    {int temp=array[i];
        array[i]=array[n-i-1];
        array[n-i-1]=temp;
        
    }
    System.out.println(array[0]);
    }
    
}
