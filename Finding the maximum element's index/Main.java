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
    max_element(n,arr);
  }
  public static void max_element(int n , int arr[])
  {
    int max = 0 ;
    int count = 0;
    for(int i=0 ; i<n ; i++)
    {
      if(arr[i]>max)
      {
        max = arr[i];
        count = i ;
      }
    }
    System.out.print(count);
  }
}