package edu.unca.csi201;

public class PlacateITDepartment {
	static int digits=0;
	static int letters=0;
static int upperCaseLetters=0;
static int Numbers=0;
static int specialCharacters=0;
  static boolean finalPassword=false;
	public static String passwordCheck(String password) throws PasswordTooShort,PasswordNeedsCapitals,PasswordNeedsNumbers,PasswordNeedsSpecialCharacters{ 
		
	int[] NumbersArray=new int[]{0,1,2,3,4,5,6,7,8,9};
	String[] SpecialsArray= new String[]{"!","@","#","$","%","^","&","*","(",")","-","+","="};
	
		char[] Password=password.toCharArray();
		for(char i=0;i<Password.length;i++) {
			
			if(Password[i]>='A'&& Password[i]<='Z') {
				 upperCaseLetters+=1;
			}
			
			if(Character.isDigit(password.charAt(i))) {
				Numbers+=1;
			}
			
			 if (Character.isDigit(password.charAt(i))) {
			    digits++;
			} else if (Character.isLetter(password.charAt(i))) {
			    letters++;
			} else { 
			  specialCharacters++;
			}
			
			
		}
		//checking for passwordTooShortException
		if(password.length()<10)
			throw new PasswordTooShort();	
		
		//checking for passwordNeedsCapitalsException
		
		if(upperCaseLetters<1){
			throw new PasswordNeedsCapitals();	
		}
		//checking for passwordNeedsNumbersException
		
		if(Numbers<2){
			throw new PasswordNeedsNumbers();	
		}
		//checking for passwordNeedsSpecialCharactersException
		
		if(specialCharacters<1){
			throw new PasswordNeedsSpecialCharacters();	
		}
		
		//program end 
		finalPassword=true;
		
	return password;
	}

	
	
}

