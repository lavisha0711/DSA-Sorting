import java.util.Scanner;
public class Selectionsort{
 public static void printarr(int[] arr)
  {
    for(int i=0;i<arr.length;i++)
    {
      System.out.print( arr[i] + " ");
    }

  }
  public static void sort(int[] arr)
  {
    int n = arr.length;
    for(int i=0;i<n;i++)
    {
      int min = Integer.MAX_VALUE;
      int minidx = -1;
      for(int j=i; j<n; j++)
      {
        if(arr[j]<min)
        {
          min = arr[j];
          minidx=j;
        }
      }
      int temp = arr[i];
      arr[i] = arr[minidx];
      arr[minidx] =temp;
    }
    printarr(arr);
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of the array:");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.print("Entert he elements of the array:");
    for(int i=0; i<n-1; i++)
    {
      arr[i] = sc.nextInt();
    }
    sort(arr);
  }

  }
