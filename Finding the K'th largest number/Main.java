import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int arr[] = new int[n];
      for(int i = 0; i<n ; i++)
      {
        arr[i] = in.nextInt();
      }
      int k = in.nextInt();
      int min , temp ;
      for(int i = 0 ; i< n ; i++)
      {
        min = i ;
        for(int j = i+1 ; j<n ; j++)
        {
          if(arr[j]<arr[min])
          {
            min = j ;
          }
        }
        if(min != i)
        {
          temp = arr[i] ;
          arr[i] = arr[min] ;
          arr[min] = temp;
        }
      }
      int count = 1;
      for(int i = n-1; i>0 ; i--)
      {
        if(count == k)
        {
          System.out.print(arr[i]);
          break;
        }
        else
        {
          count++;
        }
      }
    }   
}