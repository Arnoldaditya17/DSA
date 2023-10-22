package Arrays;

public class palindrom2 {
    public static void main(String arg[])
    {
        int array[]={1,1,0,0,1,1};
        int flag=0;
        for(int i=0;i<array.length;i++)
        {
            if( array[i]!=array[array.length-i-1])
            {
                flag=1;
                System.out.println("Not a palindrom");
                break;
            }
        }
        if(flag==0)
        {
          System.out.println("palindrom");
        }
    }
    
}
