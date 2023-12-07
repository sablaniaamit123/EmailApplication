
package email.application;
import java.util.Scanner;
/**
 *
 * @author SWAMI COMPUTERS
 */
Public class Employee
{
        private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailboxcapacity=999;
	private String email;
	private int defaultPasswordLength=10;
	private String alternateEmail;
	private String companySuffix="greatlearning.com";
        private String firstname;
        private String lastname;
        int length=8;
   public Employee(String firstName, String lastName) 
   {
    this.firstName=firstName;
    this.lastName=lastName;    
   }

    private Employee() 
    {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   String generatePassword() 
   {
		String passwordSet= "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		char[] password=new char[length];
		for(int i=0;i<length;i++) 
                {
			int rand=(int) (Math.random()*passwordSet.length());
			password[i]=passwordSet.charAt(rand);
		}
		return new String(password);
   }
   String setDepartment() 
   {
		System.out.print("New Worker: "+firstName + "\nDEPARTMENT CODES:\n1 for Technical\n2 for Admin\n3 for Human Resource\n4 for Legal\nEnter the department code: ");
		Scanner in=new Scanner(System.in);
		int depchoice=in.nextInt();
		if(depchoice==1) 
                {
			
                        System.out.println("Technical");
                        String Technial = "Technical";
                        return Technial;
		}
		else if(depchoice==2) 
                {
                        System.out.println("Admin");
                        String Admin = "Admin";
                        return Admin;
		}
		else if(depchoice==3) 
                {
                        System.out.println("HumanResource");
                        String HumanResource = "Human Resource";
                        return HumanResource;
		}
		else if(depchoice==4)
                {
			String Legal="Legal";
                        System.out.println("Legal");
                        return Legal;
		}
		else 
                {
			return "";
		}
        
                
	}
   public String generateEmailAddress()
   {
        email=firstName.toLowerCase()+"."+lastName.toLowerCase()+"@" +setDepartment()+"."+companySuffix;
        return email;
   }
   
   public String Display()
   {   
    return firstName+"."+lastName+"@";	
   }
}
