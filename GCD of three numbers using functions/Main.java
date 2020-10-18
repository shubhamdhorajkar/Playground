import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n1 = in.nextInt();
      int n2 = in.nextInt();
      int n3 = in.nextInt();
      int gcd1 = gcd_num(n1,n2,n3);
      System.out.print(gcd1);
	}
  public static int gcd_num(int n1 , int n2 , int n3)
  {
    int min_element , gcd = 0 , gcd1=0;
    if(n1>n2)
    {
      min_element = n2;
    }
    else
    {
      min_element=n1;
    }
    while (min_element >= 1)
    {
      if(n1%min_element==0 && n2%min_element==0)
      {
        gcd=min_element;
        break;
      }
      min_element--;
    }
    if(gcd > n3)
    {
      min_element = n3 ;
    }
    else
    {
      min_element=gcd;
    }
    while(min_element >= 1)
    {
      if (n3%min_element==0 && gcd%min_element==0)
      {
        gcd1 = min_element;
        break;
      }
      min_element--;
    }
    return gcd1;
  }
      
}