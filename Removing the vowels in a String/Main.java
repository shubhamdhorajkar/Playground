import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    String r = remove(str);
    System.out.print(r);
  }
  public static String remove(String str)
  {
    String n = "";
    int i ;
    for(i = 0 ; i<str.length();i++)
    {
      if(!vovel(Character.toLowerCase(str.charAt(i))))
      {
        n = n + str.charAt(i) ;
      }
    }
    return n ;
  }
  public static boolean vovel(char c)
  {
    String vov = "aeiou";
    for(int i = 0 ; i<5 ; i++)
    {
      if(c == vov.charAt(i))
      {
        return true ;
      }
       
    }
    return false;
  }
}
