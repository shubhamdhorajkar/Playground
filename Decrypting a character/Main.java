import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner in = new Scanner(System.in);
      char ch = in.next().charAt(0);
      int key = in.nextInt();
      if(ch < 'z' && ch >'a')
      {
        ch = (char)(ch - key);
        if(ch<'a')
        {
          ch = (char)(ch+26);
        }
      }
     else if(ch < 'Z' && ch >'A')
      {
        ch = (char)(ch - key);
        if(ch<'A')
        {
          ch = (char)(ch+26);
        }
      }
      System.out.print(ch);
      
      
    }
}