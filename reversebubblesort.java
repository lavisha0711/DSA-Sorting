import java.util.Scanner;
public class reversebubblesort
{
  public static void printarr(int[] arr)
  {
    for(int i=0; i<arr.length; i++)
    {
      System.out.print("The sorted array is:" +arr[i]+ " ");
    }
  }
  public static void reversesort(int[] arr)
  {
    int n = arr.length;
    for(int i= 0; i<n-1; i++)
    {
      int swaps =0;
      for(int j=0;j<n-1-i;j++)
      {
        if(arr[j]<arr[j+1])
        {
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
          swaps++
        }
      }
      if(swaps==0) break;
    }
    printarr(arr);
  }
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of the array:");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.print("Enterthe elements to sort them in descending order:");
    for(int i=0;i<n;i++)
    {
      arr[i] = sc.nextInt();
    }
    reversesort(arr);
  }
}