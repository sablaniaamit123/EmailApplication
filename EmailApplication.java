/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package email.application;

import static java.time.Clock.system;
import static java.time.InstantSource.system;

/**
 *
 * @author SWAMI COMPUTERS
 */
public class EmailApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
  Employee emp1=new Employee("amit","kumar");
  String email=emp1.generateEmailAddress();
  System.out.println("Your Email id is:-"+email);
  String password=emp1.generatePassword();
  System.out.println("Your password is:-"+ password);
    }
    
}
