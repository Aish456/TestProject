package emailapp;
import java.util.Scanner;
import java.util.Random;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int defaultPasswordLength=10;
	private int mailboxCapacity;
	private String alternateEmail;
	private String email;
	private String companySuffix="ebay.com";

	//Constructor to receive first name and last name
	public Email(String firstName,String lastName){
		this.firstName=firstName;
		this.lastName=lastName;
		System.out.println("Email created..."+this.firstName+" "+this.lastName);
		//Call a method asking for department
		this.department=setDepartment();
		System.out.println("Department is :"+department);
		this.password=randomPassword(defaultPasswordLength);
		System.out.println("Your password is: " +this.password);
		//Combine elements to generate email
		email=firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+companySuffix;
		System.out.println("Your email is :"+email);
	}
	private String setDepartment(){
		System.out.print("DEPARTMENT CODES: \n 1 for Sales \n 2 for Developement \n 3 for Accounting \n 0 for none \n ENTER THE DEPARTMENT CODE:");
		Scanner in=new Scanner(System.in);
		int deptChoice=in.nextInt();
		if(deptChoice==1){
			return"Sales";
		}
		else if(deptChoice==2){
			return"Developement";
		}
		else if(deptChoice==3){return"Acct";
			}
		else return"";
	}
	//Generate a random password
	private String randomPassword(int length){
		String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyz!@#$%";
		char[] pass=new char[length];
		for(int i=0;i<length;i++){
			int rand=(int)(Math.random()*passwordSet.length());
			pass[i]=passwordSet.charAt(rand);
		}
		return new String(pass);
	}
	//Set the mailbox capacity
	public void setMailboxCapacity(int capacity){
		this.mailboxCapacity=capacity;
	}
	
	//Set the alternate email
	public void setAlternateEmail(String altEmail){
		this.alternateEmail=altEmail;
		
	}
	//Change the password
	public void changePassword(String password){
	this.password=password;
	}
	public int getMailboxCapacity(){
		return mailboxCapacity;
	}
	public String getAlternativeEmail(){return alternateEmail;
	}
	public String getChangePassword()
	{
		return password;
	}
}