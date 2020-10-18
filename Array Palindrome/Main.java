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
      boolean pal = true ;
      int front = 0;
      int end = n-1 ;
      while(front <= end)
      {
        if(arr[front] != arr[end])
        {
          pal = false ;
        }
        front++;
        end--;
      }
      if(pal==true)
      {
        System.out.print("Yes");
      }
      else
      {
        System.out.print("No");
      }
      
    }
    }
