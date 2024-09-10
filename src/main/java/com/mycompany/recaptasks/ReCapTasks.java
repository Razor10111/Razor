/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.recaptasks;

import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class ReCapTasks {

    public static void main(String[] args) {
     
        //Declarations
        String name;
        String lastname;
        String dateofbirth;
        String age;
        String gender;
       
   //Create object of the scanner
   
         Scanner sc = new Scanner (System.in);
     
   //Prompt the user for details
        System.out.println ("Enter your name:");
           name = sc.next();

        System.out.println ("Enter your last name: ");
          lastname = sc.next();

        System.out.println ("Enter date of birth:");
          dateofbirth = sc.next();
       
        System.out.println ("Enter your gender:");
          gender = sc.next();
                
        System.out.println ("Enter your age:");
         age = sc.next();
        
         String txt = "name";
        System.out.println("The length of the name string is: " + txt.length());
         txt = "lastname";
        System.out.println("The length of the lastname string is: " + txt.length());
        
          
         

         
          
          
    }
}
