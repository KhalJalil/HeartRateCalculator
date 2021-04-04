
import java.util.Scanner;
import  javax.swing.JOptionPane;
public class HeartRateMain {

    public static void main (String[] args){


        Scanner scanme = new Scanner(System.in);

        //System.out.println("**************** Welcome **************");
        // System.out.print("Hello, what's your  First name ? \n");
        String fName =JOptionPane.showInputDialog("Hello, what's your  First name ?");

        //Prompt Last Name
        String lName =JOptionPane.showInputDialog("And your Last name");

        //Prompt Birth Year
        //System.out.print("Whats your birthday \n" + "Day? -> ");
        int birthDay  = Integer.parseInt(JOptionPane.showInputDialog(null,"Whats Your Birth Day"));

        //Prompt Birth Month
        //System.out.print("Month? -> ");
        int birthMonth = Integer.parseInt(JOptionPane.showInputDialog(null,"Whats Your Birth Month"));

        //Prompt Birth Day
        //System.out.print("Year? -> ");
        int birthYear = Integer.parseInt(JOptionPane.showInputDialog(null,"Whats Your Birth Year"));


        HeartRates heartObject = new HeartRates(fName,lName,birthMonth,birthDay,birthYear);
        heartObject.setFirstName(fName);
        heartObject.setLastName(lName);
        heartObject.setDay(birthDay);
        heartObject.setMonth(birthMonth);
        heartObject.setYear(birthYear);


        JOptionPane.showMessageDialog(null,"Hi There "+heartObject.getFirstName()+" "+heartObject.getLastName()+"\n"
                +"\nYour Birth day is: "+ heartObject.getDay()+" "+heartObject.getMonth()+" "+heartObject.getYear()+
                "\nYou are: "+heartObject.calculateAge()+" years "+"\nMax Heart Rate is: "+heartObject.maxHeartRate()
                +"\nAcceptable Range for your Heart Rate: "+heartObject.getTargetRange());
        /**System.out.println("**************** Thank You **************");

         System.out.printf("Hi There "+ heartObject.getFirstName()+" "+heartObject.getLastName()+"\n");
         System.out.printf("Your Birth day is %d %d %d \n",heartObject.getDay(),heartObject.getMonth(),heartObject.getYear());
         System.out.println("You are "+heartObject.calculateAge()+" years this 2021");
         System.out.println("Max Heart Rate is: "+heartObject.maxHeartRate());
         System.out.println("Acceptable Range for your Heart Rate: "+heartObject.getTargetRange());

         System.out.println("**************** Thank You **************");
         */




    }
}

