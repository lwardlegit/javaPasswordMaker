package edu.unca.csi201;

import java.util.Scanner;

public class PasswordChecker {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.print("enter a password");
		
		while(PlacateITDepartment.finalPassword != true) {
		String UserInput=scan.nextLine();
		
		//check password

			try {
				PlacateITDepartment.passwordCheck(UserInput);
				
		} catch (PasswordTooShort e) {
			System.out.print(PasswordTooShort.msg);
			e.printStackTrace();
		
		} catch (PasswordNeedsCapitals e) {
			System.out.print(PasswordNeedsCapitals.msg);
			e.printStackTrace();
		} catch (PasswordNeedsNumbers e) {
			System.out.print(PasswordNeedsNumbers.msg);
			e.printStackTrace();
		} catch (PasswordNeedsSpecialCharacters e) {
			System.out.print(PasswordNeedsSpecialCharacters.msg);
			e.printStackTrace();
		}
			System.out.println("congrats your password has been set!: "+UserInput);
			
	
		}
	}


}
