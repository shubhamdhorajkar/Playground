import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in= new Scanner(System.in);
      String str = in.nextLine();
      StringBuilder sb = new StringBuilder(str);
      int len = sb.length();
      int stat[] = new int[26];
      for(int i = 0 ; i<26 ; i++)
      {
        stat[i] = 0 ;
      }
      for(int i = 0 ; i<len ; i++)
      {
        if(sb.charAt(i) >= 'A' && sb.charAt(i) <= 'Z')
        {
          int offset = sb.charAt(i) - 'A' ;
          char ch = (char)(offset + 'a');
          sb.setCharAt(i,ch);
        }
        if(sb.charAt(i) <= 'z' && sb.charAt(i)>='a')
        {
          int offset = sb.charAt(i)-'a';
          stat[offset]++;
        }
      }
      for(int i = 0 ; i<len ; i++)
      {
        if(stat[sb.charAt(i)-'a']!=0)
        {
          System.out.print(sb.charAt(i)+""+stat[sb.charAt(i)-'a']+" ");
          stat[sb.charAt(i)-'a']=0;
        }
      }
      
    }
}