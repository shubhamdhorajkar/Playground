import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int p = n ;
      int isArm = n;
      int digit = 0;
      while(n>0)
      {
        n = n / 10 ;
        digit++;
      }
      int num = 0 ;
      int sum = 0 ;
      for(int i = 0 ; i<digit ; i++)
      {
        num = p % 10;
        int cube = 1 ;
        for(int j = 0 ; j< digit ; j++)
        {
          cube = cube * num; 
        }
        sum = sum + cube;
        p = p / 10 ;
        
      }
        
      if(isArm == sum){
      	System.out.println("Armstrong Number");
      }
      else{
        System.out.println("Not a Armstrong Number");
      }
	}
}