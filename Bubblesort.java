import java.util.*;
public class Bubblesort{
  public static void printarr(int[] arr)
  {
    for(int i=0; i<arr.length; i++)
    {
      System.out.println(arr[i]);
    }
  }
  public static void sort(int[] arr)
  {
    int n= arr.length;
    for(int i=0;i<n-1;i++)
    {
      int swaps = 0;
      for(int j =0; j<n-1-i;j++)
      {
        if(arr[j]>arr[j+1])
        {
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
          swaps++;
        }
      }
      if (swaps==0) break;
    }
    printarr(arr);
  }
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.print("Enter the size of the array:");
    int[] arr = new int[n];
    System.out.print("Enter the elemts of the array youy want to sort:");
    for(int i=0; i<n; i++)
    {
      arr[i] = sc.nextInt();
    }
    sort(arr);
  }
}

