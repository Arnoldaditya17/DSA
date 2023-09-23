import java.util.*;
import org.apache.commons.lang3.tuple.Pair;

public class MaxMinElement {
    static int  maxmin(int []arr,int n)
    {  int min=arr[0];
    int max=arr[0];
    for(int i=0;i<n;i++)
    {

if(arr[i]<min)
{
    min=arr[i];
}
else if(arr[i]>max)
{
    max=arr[i];
}
    }
    
    Pair p=new Pair(min,max);
    return p;

    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter values of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    int result=maxmin(arr,n);

    }
}
