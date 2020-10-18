import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int arr[] = new int[n];
      for(int i = 0 ; i<n ; i++)
      {
        arr[i] = in.nextInt();
      }
      int value = in.nextInt();
      sum_val(n,arr,value);
    }
  public static void sum_val(int n , int arr[],int value)
  {
    for(int i = 0 ; i<n ; i++)
    {
      for(int j = i+1 ; j<n ; j++)
      {
        int sum = arr[i]+arr[j];
        if(sum==value)
        {
          System.out.println(arr[i]+","+" "+arr[j]);
        }
      }
    }
  }
}