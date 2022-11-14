/* whitney khoi
 * thisis coming up with interactive program that informs the user on data entry if the year is qualified in becoming a leap year
 * the user enters the year and the prgram checks and determine if it is a leapyear or not
*/
package Khoi;

import java.util.Scanner;

public class leapyeargame 
{
	
	public static void main(String[]args)
	{
	int year;
	Scanner input =new Scanner(System.in);
	System.out.print("hey kid,kindly enter the year to be tested");
	year=input.nextInt();
//we use modulus because when we divide by 4 it should  be divisible by 4 for it to be a leap year
	System.out.print("\n");
if (year  %4==0) 
{
	System.out.println(" we have entered into a leap year"+year+"is not a leap year");//outputs leap year if true
}


else {
	System.out.println( "we have not yet reached the leap year");//outputs have not yet reached if false
  //remember a year is only a leap year if it is divisible by 4 without a reminder
}}


}
