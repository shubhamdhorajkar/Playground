import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner (System.in);
      
      int n1 = in.nextInt();
      int n2 = in.nextInt();
      int n3 = in.nextInt();
      int n = greatest_num(n1,n2,n3);
      System.out.print(n);
	}
  public static int greatest_num(int n1 , int n2 ,int n3)
  {
    int n ;
    if(n1 > n2)
    {
      n = n1 ;
    }
    else
    {
      n =n2;
    }
    if(n>n3)
    {
      n = n ;
    }
    else
    {
      n = n3;
    }
    return n ;
  }
}