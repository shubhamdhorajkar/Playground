import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner in = new Scanner(System.in);
      String str = in.nextLine();
      int len = str.length();
      int front = 0 ;
      int end = len -1;
      boolean match = true;
      while(front<end)
      {
        if(str.charAt(front)!=str.charAt(end))
        {
          match = false ;
        }
        front++;
        end--;
      }
      if(match == true)
      {
        System.out.print("Yes");
      }
      else
      {
        System.out.print("No");
      }
    } 
}