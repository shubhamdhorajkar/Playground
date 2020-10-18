//import required packages
import java.util.Scanner;

class Faculty
{
  
  public void salary(int baseSal)
  {
    //write your Faculty class statements
    System.out.println("Base Salary: "+baseSal);
    
  }
}
class CSE extends Faculty
{
 
  public void salary(int baseSal)
  {
    //write your CSE class statements
    System.out.println("CSE Faculty: "+(baseSal+3000));
    
  }
}
class IT extends Faculty
{
 
  public void salary(int baseSal)
  {
    //write your IT class statements
    System.out.println("IT Faculty: "+(baseSal+5000));
  }
}
class ECE extends Faculty
{
  
  public void salary(int baseSal)
  {
    //write your ECE class statements
    System.out.println("ECE Faculty: "+(baseSal+4500));
  }
}

class Main
{
  public static void main(String[] args)
  {
    
    //implement your required concept here
    Scanner in = new Scanner(System.in);
    int baseSal = in.nextInt();
    Faculty f = new Faculty();
    f.salary(baseSal);
    CSE c = new CSE();
    c.salary(baseSal);
    IT i = new IT();
    i.salary(baseSal);
    ECE e = new ECE();
    e.salary(baseSal);
  }
}