package Mini_Prject;
import java.util.*;

public class ATM_Machine {
   
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("...........Wellcome to ATM Machine..........");
        System.out.println("Enter your ATM Card....");
        System.out.println("Please wait while a minute....");
        
        int truepin = 1234;
        int ch;
        int balance = 7000 , Deposite;
        
        
        do{ 
            System.out.print("Enter the ATM Pin : ");
            int Pin = sc.nextInt();
            if(Pin == truepin){
            

        System.out.println("Enter following Option..");
        System.out.println("1. Withdraw Cash");
        System.out.println("2. Deposite Cash");
        System.out.println("3. Check Balance");
        System.out.println("4. Change Pin");

        

        int option = sc.nextInt();

        switch(option){
            case 1: System.out.print("Enter the Ammount : ");
                    double amount = sc.nextDouble();
                    if(balance>amount){
                        balance -= amount;
                        System.out.println("Your withdraw Ammount is " + amount);
                        System.out.println("Total Balance is : " + balance);

                    }
                    else{
                        System.out.println("Sorry! Your Balance is not enough.");
                    }
                    break;
            
            case 2: System.out.print("Enter How much Cash you deposite : ");
                    Deposite = sc.nextInt();
                    balance += Deposite;
                    System.out.println("Total Balance is " + balance);
                    break;

            case 3: System.out.println("Your Total Amount is : " + balance);
                    break;

            case 4: System.out.print("Enter the New Pin : ");
                    int new_pin = sc.nextInt();
                    truepin = new_pin;
                    System.out.println("New pin has been changed!");
                    break;

            default : System.out.println("Enter Valid option!");
        }
        
        }
        else{
            System.out.println("Sorry Your ATM Pin is not valid.....");
        }

        System.out.print("Do you want to Continue (1/0) : ");
        ch = sc.nextInt();
        }
        while (ch == 1);
        sc.close();
       

        
    }
    
}
