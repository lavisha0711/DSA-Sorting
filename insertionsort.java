// best case time complexity = 0(n) average and worst is 0(n2)
import java.util.Scanner;
public class insertionsort
{
    public static void insertionsort(int[] arr)
    {
        int n= arr.length;
        for(int i=1;i<arr.length;i++)
        {
            int j=i;
            while(j>0 && arr[j]<arr[j-1])
            {
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;

            }
        }
        for(int ele:arr)
        {
            System.out.print(ele +" ");
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENter te size of the array:");
        int n = sc.nextInt();
        System.out.print("enter the elemnts of the array:");
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        insertionsort(arr);
    }
}