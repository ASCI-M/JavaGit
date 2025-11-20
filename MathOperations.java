
/**
 * Write a description of class Week3_Instance_W here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MathOperations
{  
    public static void main (String[] args){
         int a=10;
         int b = 20;
         int c= a+b;
         int d= a-b;
         int e= a*b;
         int f= a/b;
         int g=a%b;
         int h = a++;
         int i=--a;
         int j = a;
         System.out.println("Sum is : "+c);
         System.out.println("Subs is : "+d);
         System.out.println("multi is : "+e);
         System.out.println("division is : "+f);
         System.out.println("mod is : "+g);
         System.out.println("post increment of 10  is : "+h);
         System.out.println("pre decrement of 11 is : "+i);
         System.out.println("assignment of a in j is : "+j);

         if(a>b && c>a)
             System.out.println("C is largest number");

         else if(b>a || c>a)
             System.out.println("Either B or C is larger than a");
             
         int age=21;
         String arg=(age>18) ? " Can drive " : "Cannot drive" ;   
         System.out.println(arg);

         
    
      








}
}