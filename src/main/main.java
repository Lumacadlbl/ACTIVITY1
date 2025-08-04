
package main;

import banking.bankapp;
import java.util.Scanner;


public class main {
    
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        bankapp bnk = new bankapp();
        int attemp = 3;
       
        System.out.println("----WELCOME TO MY BANKING SYSTEM----");
        System.out.println("\nWhat do you feel like doing today?");
        System.out.println("\n1. Banking");
        System.out.println("2. Shopping");
        System.out.println("3. Pay Bills");
         System.out.println("\n------------------------------------");
       
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
       
             switch( choice ){
                case 1:
                    while( attemp != 0 ){
                        
                        System.out.print("Enter Account No : ");
                        int acc = sc.nextInt();

                        System.out.print("Enter Pin No : ");
                        int pin = sc.nextInt();

                            if (bnk.verifyAccount(acc, pin)){
                                System.out.println("Login Success!");
                                System.exit(0);
                            }
                            else{
                                attemp--;
                                System.out.println("Invalid Account No or Pin! Left attemp " + attemp);
                                
                            }
                            
                            if ( attemp == 0 ){
                                System.out.println("Try Again later!");
                            }
                    }
                    break;
                case 2:
                    break;
                case 3:
                    break;
                default:
             }
    }
    
}
