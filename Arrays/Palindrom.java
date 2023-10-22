package Arrays;

public class Palindrom {
    public static void main(String arg[])
    {
        char array[]={'a','b','c','a'};
        int flag=1;
        for(int i=0;i<=array.length/2;i++)
        {
            if(array[i]==array[array.length-i-1])
            {
                flag=2;
            }
            else{
                flag=1;
                break;
            }
        }
        if(flag==2)
        {
            System.out.println("palindrom");
        }
        else{
            System.out.println("not a palindrom");
        }
    }
    
}
