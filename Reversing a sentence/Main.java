import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here 
      Scanner in = new Scanner (System.in);
      String str = in.nextLine();
      StringBuilder sb = new StringBuilder(str);
      int len = sb.length();
      reverse_string(sb,0,len-1);
      int start = 0 ;
      for(int i = 0; i<len ;i++)
      {
        if(sb.charAt(i) == ' ')
        {
          reverse_string(sb,start,i-1);
          start = i+1;
        }
        else if(i ==(len-1))
        {
          reverse_string(sb,start,i);
          start = i+1;
        }
      }
      System.out.print(sb);
    }
      
    
    // Function to reverse a string
    public static void reverse_string(StringBuilder sb, int start_idx, int end_idx)
    {
        // Type your code here
      int front = start_idx ; 
      int end = end_idx;
      while(front<end)
      {
        char ch = sb.charAt(front);
        sb.setCharAt(front, sb.charAt(end));
        sb.setCharAt(end, ch);
        front++;
        end--;
      }
    }
}