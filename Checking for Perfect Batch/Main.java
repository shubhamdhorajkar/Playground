import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int arr[] = new int[n];
    for(int i = 0 ; i<n ; i++)
    {
      arr[i] = in.nextInt();
    }
    batch(n,arr);
  }
  public static void batch(int n , int arr[])
  {
    int f_batch = arr[0]+arr[1]+arr[2] ;
    int current = 0;
    for(int i=3 ; i < n ; i=i+3)
    {
      current = arr[i]+arr[i+1]+arr[i+2] ;
      
    }
    if(f_batch == current)
    {
      System.out.print("Perfect Batch");
    }
    else
    {
      System.out.print("Not a Perfect Batch");
    }
  }
}