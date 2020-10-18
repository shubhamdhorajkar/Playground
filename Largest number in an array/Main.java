import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int array[] = new int[n];
      for(int i= 0 ; i<n ; i++)
      {
        array[i] = in.nextInt();
      }
      int max = array[0];
      for(int i= 0 ; i<n ; i++)
      {
        if(array[i]>max)
        {
          max = array[i];
        }
      }
      System.out.println(max);
      }
    }
