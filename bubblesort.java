import java.util.Scanner;
public class bubblesort
{
    public static void sort(int[] arr)
    {
        int n = arr.length;
        for(int i=0; i<n-1; i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int n= sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the elements of the array:");
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        sort(arr);

    System.out.print("Sorted array:");
    for(int i=0; i<arr.length; i++)
    {
        System.out.print(arr[i] +" ");
    }

    }

}