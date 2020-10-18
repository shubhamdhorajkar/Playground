import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int array[] = new int[n];
      for(int i = 0 ; i<n ; i++)
      {
        array[i]= in.nextInt();
      }
      int num1 = in.nextInt();
      int num2 = in.nextInt();
      
      int flag1 = 0;
      int flag2 = 0;
      int index = 0;
      int index1 = 0;
      for(int i=0 ; i<n ;i++)
      {
        if(array[i] == num1)
        {
         index = i;
         flag1 = 1;
          break;
        }
      }
      for(int i=0 ; i<n ;i++)
      {
        if(array[i] == num2)
        {
         index1 = i;
         flag2 = 1;
          break;
        }
      }
      if(flag1 == 1)
      {
        System.out.println(index);
      }
      else
      {
        System.out.println("-1");
      }
      if(flag2 == 1)
      {
        System.out.println(index1);
      }
      else
      {
        System.out.println("-1");
      }
        }
        
}