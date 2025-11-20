
/**
 * Write a description of class W3_WQ2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Grade_Evaluator
{   public static void main ( String[] args){
    Scanner in =new Scanner(System.in);
    System.out.println("Input numeric grade :");
    int a=in.nextInt();
    String assign = (a>40) ? "Pass\tCan go to next class" : "Fail \n cannot go to next class";
    System.out.println(assign);
    





}
}