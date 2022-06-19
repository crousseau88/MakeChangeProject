package com.skilldistillery.makechange;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How much is the item?");
		double itemAmount = input.nextDouble();
		
		System.out.println("How much money was tendered?");
		double tendered = input.nextDouble();

		if (tendered < itemAmount) {
			System.out.println("Error: You did not give enough money to cover the cost.                  ");
		}
		else if (tendered == itemAmount) {
			System.out.println("That is the correct amount, there is no change needed.");
		}
		input.close();
		
		double changeNeeded = tendered - itemAmount;
		
		
		int amount = (int) Math.ceil(changeNeeded * 100);  
		
		
		int twenty = amount / 2000;
		amount = amount %= 2000;
		
		int ten = amount / 1000;
		amount = amount %= 1000;
				
		int five = amount / 500;
		amount = amount %= 500;
		
		int dollar = amount / 100;    
		amount = amount % 100;    

		int quarter = amount / 25;     
		amount = amount % 25;     

		int dime = amount / 10;        
		amount = amount % 10;     

		int nickel = amount / 5;      
		amount = amount % 5;      

		
		int penny = amount / 1;
		amount = amount % 1;

		if (twenty < 2 && twenty == 1) {
		System.out.println(twenty +" Twenty dollar bill" );
		}
		else if (twenty >= 2) {
			System.out.println(twenty + " Twenties");
		}
	
		if (ten < 2 && ten == 1) {
		System.out.println(ten + " Ten dollar bill");
		}
		
		else if (ten >= 2) {
    	System.out.println(ten + " Tens");
		}
		
		if (five < 2 && five == 1) {
			System.out.println(five + " Five dollar bill");
		}
		else if (five >= 2) {
			System.out.println(five + " Fives");
		}
		
		if (dollar < 2 && dollar == 1) {
			System.out.println(dollar + " Dollar bill");
		}
		else if (dollar>= 2) {
			System.out.println(dollar + " Dollars");
		}
		if (quarter < 2 && quarter == 1) {
			System.out.println(quarter + " Quarter");
		}
		else if (quarter >= 2) {
			System.out.println(quarter + " Quarters");
		}
		
		if (dime < 2 && dime == 1) {
			System.out.println(dime + " Dime");
		}
		else if (dime >= 2) {
			System.out.println(dime + " dimes");
		}
		if (nickel < 2 && nickel == 1) {
			System.out.println(nickel + " Nickel");
		}
		
		else if (nickel >= 2) {
			System.out.println(nickel +" Nickels");
		}
		
		if (penny < 2 && penny == 1) {
			System.out.println(penny + " Penny");
		}
		else if (penny >= 2 ) {
			System.out.println(penny + " Pennies");
		}
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
	   
		
		
		
		
		
		
	
	
}
