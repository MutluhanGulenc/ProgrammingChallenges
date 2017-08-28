package com.mutluhan004;

import java.util.*;

public class Encryption_Decryption {
	
	String text = "abcdefghijklmnoprstuvyz";
	
	String chip = "zyvutsrponmlkjihgfedcba";
	
	
	public static void main(String args[]) {
		
		Encryption_Decryption enc = new Encryption_Decryption();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Şifrelenecek metini giriniz:");
		
		String input = sc.nextLine();
		
		String output = "";
		
		for(int i=0;i<input.length();i++) {
			
			for(int j=0;j<enc.text.length();j++) {
				
				if(input.charAt(i) == ' ') {
					output += " ";
					break;
				}
				
				if(enc.text.charAt(j) == input.charAt(i))
				{
					output += enc.chip.charAt(j);
				}	
			}
		}
		
		System.out.println("Şifrelenmiş hali : " + output);

	
	}
	
	
	
	

}
