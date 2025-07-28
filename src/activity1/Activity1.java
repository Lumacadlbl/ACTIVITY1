
package activity1;

import java.util.Scanner;

public class Activity1 {
    
    public static void main(String[] args) {
       Scanner gr = new Scanner(System.in);
       
       String name;
       int grade = 0;
       
        System.out.print("Enter Student Name: ");
        name = gr.nextLine();
        System.out.print("Enter number of subjects: ");
        int sub = gr.nextInt();
        
        
             for (int x = 1; x <= sub; x++){
                 System.out.print("Enter grade for sub"+x+": ");
                 grade += gr.nextInt();
        }
               
             float aver = grade/sub;
             
             System.out.println("Average: "+aver);
             
             if (aver <= 75){
                 System.out.println("Remarks: FAILED!");
             }else{
                 System.out.println("Remarks: PASSED!");
             }
    }
    
}
