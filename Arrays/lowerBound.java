import java.util.Scanner;

public class lowerBound {
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 2, 9, 17, 17, 36, 65,74};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");

        System.out.print("Enter target element:");
        int target = sc.nextInt();
int result=-1;
        int low = 0;
        int high = arr.length-1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
 result=mid;
                high=mid-1;
                
              
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        if(result==-1)
        {
            System.out.println("No Such elements is found");
        }
        else{
            System.out.println("element found :"+result);
        }

    }
    
}
