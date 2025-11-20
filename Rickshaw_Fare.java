import java.util.Scanner;

public class Rickshaw_Fare{
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        System.out.println("----------WELCOME TO LOCAL RICKSHAW SERVICE , BIRATNAGAR----------");
        System.out.println("------------------------------------------------------------------");
        System.out.println("----------OUR BASE FARE = \'RS. 20\' IN NRP-----------");
        System.out.println("----------OUR CHARGE PER MINUTE = \'RS. 1.25\' IN NRP----------");
        System.out.println("------------------------------------------------------------------");
        System.out.println("----------WE ALSO PROVIDE DISCOUNTS FOR OUR LOCAL CUSTOMERS----------");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Total Fare Calculation = { (dist_travelled*base_fare)+(time_taken*charge_per_minute)+(surcharge) } - Discount");
        System.out.println("------------------------------------------------------------------");
        System.out.println("Enter Distance travelled in KM");
        double dist=in.nextDouble();
        System.out.println("Enter Time Taken in Minutes");
        int min=in.nextInt();
        System.out.println("If the customer is local enter \"LOCAL\" , if the customer is non-local enter \"NON-LOCAL\"");
        in.nextLine();// for buffer
        String locality=in.nextLine();
        System.out.println("If the customer is travelling in day enter \"DAY\" , if the customer is travelling in night enter \"NIGHT\"");
        String dn=in.nextLine();
        int base=20;//base fare
        double time_price=1.25;//charge per minute  
        int discount=(dist>=10 && locality=="LOCAL") ? 60 : 0;// if both statement true ,  will get 60 discount else no discount
        int extracharge=(dn=="DAY") ? 0 : 50;// no surcharge in day , +50RS. surcharge at night
        double totalfare=((dist*base)+(min*time_price)+extracharge) - discount;
        System.out.println("Distance_Travelled(in km)\tTime_Taken(in minutes)\tLocality\tTravelling_During_DAY/NIGHT\tTOTAL_FARE");
        System.out.println(dist+"\t\t\t\t"+min+"\t\t\t"+locality+"\t\t"+dn+"\t\t\t\t"+totalfare);
        
        
    
    
    
    
    
    
    
    
    
  
    }
}










