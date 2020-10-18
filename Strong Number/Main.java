import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      int a = num;
      int real = num;
      int digit = 0;
      while(num>0){
        digit++;
        num = num / 10;
        
      }
      int sum = 0 ;
      for(int i = 0 ; i< digit ; i++)
      {
        int dig = a % 10;
        int fact= 1;
        while(dig>1)
        {
          fact = fact * dig;
          dig--;
        }
        sum = sum + fact;
        
        a = a / 10;
      }
          
        if(sum == real)
        {
          System.out.println("Yes");
        }
      	else
        {
          System.out.println("No");
        }
        
	}
}