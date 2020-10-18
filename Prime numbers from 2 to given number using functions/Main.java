import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner (System.in);
      int n = in.nextInt();
      for(int i = 2 ; i <= n ; i++)
      {
        if (prime(i))
        {
          System.out.println(i);
        }
      }
	}
  public static boolean prime(int n)
  {
    boolean prime=true;
    for(int num = 2 ; num<= n/2 ; num++)
    {
      if(n%num==0)
      {
        prime = false;
      }
    }
    return prime ; 
  }
}
