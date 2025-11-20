
/**
 * Write a description of class DataTypeInspector here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DefaultValues
{   byte a;
    short b;
    int c;
    long d;
    float e;
    double f;
    public static void main(String[] args){
        DefaultValues in= new DefaultValues();
        System.out.println("Byte : "+in.a);//this wont work for local variable as it need initializtion at time of declaration
        System.out.println("Short : "+in.b);
        System.out.println("Integer : "+in.c);
        System.out.println("Long : "+in.d);
        System.out.println("Float : "+in.e);
        System.out.println("Double : "+in.f);
    
    
    }
}