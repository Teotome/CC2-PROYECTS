package cc2;
import java.util.Scanner;

public class Cc2 {

    public static void main (String[]args) {
        Scanner sc = new Scanner (System.in);
        String user;
        String password;
        String passver;
        
         System.out.println("Course : \n"); 
         user = sc.nextLine();
         System.out.print("Enter Password: ");
         password = sc.nextLine();
         System.out.print("Please re-enter your password: ");   
         passver = sc.nextLine();
         
         if (passver.equals(password))
             System.out.println("Correct Password!");
         else {
             System.out.println("Invalid Password!");
         
         }
    
    }
    
    


}
