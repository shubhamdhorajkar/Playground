import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int arr[] = new int[n];
      for(int i = 0 ; i<n ; i++)
      {
        arr[i] = in.nextInt();
      }
      for(int i = 1 ; i<n ; i++)
      {
        boolean match = true;
        for(int j = 0 ; j<n ; j++)
        {
          if(arr[j] == i)
          {
            match = false ;
            break;
          }
        }
        if(match == true)
        {
          System.out.print(i);
        }
      }
    }
}