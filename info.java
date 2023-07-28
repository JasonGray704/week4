package com.promineotech;

public class  info{
	//Question 7
	static String repeatWord(String userWord, int numTimes) {
		
	    String x = "";
        for (int i = 0; i < numTimes; i++) {
            x = x + "" + userWord;
        }
	       return x;
	}
	//This method is repeating a word and will keep repeating the word until it is repeated numTimes as stated by the variable.
	//Question 8 
	static String names(String FirstName, String LastName) {
		FirstName = "Jason";
		LastName = "Gray";
		String FullName = FirstName + "" + LastName;
		return FullName;
	}
	//this code is combining two names to make a persons full name.
	//Question 9
	static boolean numbers() {
		int t = 0;
		int[] numbersArr = {8, 13, 41, 27, 12};
		for (int i = 0; i < numbersArr.length; i++) {
		t += numbersArr[i];
	}
	if(t <= 100) {
		return true; 
	}else {
		return false;
	}
	}
	//this code is going to show if all the numbers in the array add up to 100 or not.
	//Question 10
	static double numbers2() {
		int sum = 0;
        int [] nums = {4, 7, 9, 14, 19};
        for ( int i = 0; i < nums.length; i++ ) {
        	sum += nums[i];
        }
        return sum / (nums.length - 1);
	}
	//this method is a double method that finds the average of the array.
	//Quesion 11
	static double numbersArr() {
		int sum1 = 0;
		int sum2 = 0;
		int [] arrNums = { 5, 8 , 2, 10, 22};
		int [] arrNums2 = {7, 4, 9, 14, 16};
        for ( int i = 0; i < arrNums.length; i++ ) {
        	sum1 += arrNums[i];
        	double avg1 = sum1 / (arrNums.length - 1);

        for ( int x = 0; x < arrNums2.length; x++ ) {
        	sum2 += arrNums2[x];
        	double avg2 = sum2 / (arrNums2.length - 1);
       
        if(avg1 > avg2) {
        	return avg1; 
        }
        
        }
        }
        return 0;
	}
	//this is finding the average of two array then seeing if the first is larger than second.
	//Question 12
	public String willBuyDrink(double MoneyInPocket, boolean isHotOutside) {

		  if (isHotOutside && MoneyInPocket > 10.50) {

		    return "I want a drink";

		  }
		  return "My name is Jason Gray";
		}
	//this is using 3 types of variables to make a choice.
	//Question 13
	static int[] createArr (int a, int b, int c) {
		a = 4;
		b = 7;
		c = 22;
		int[] array = {4, 7, 22};
		return array; 
	}
	// This creates an Integer array in a method.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		//Question 7
		int numTimes = 3;
		String userWord = "Hello";
		System.out.println(repeatWord(userWord,numTimes));
		
		//Question 1
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		int subtraction = ages[ages.length - 1] - ages[0];
		System.out.println(subtraction);
		
		//This part is doing the subtraction of the first and last number in th array.

		int[] ages2 = {6, 12, 27, 45, 7, 13, 33, 87, 74};
		int x = 0;
		for (int i = 0; i < ages2.length; i++) {
			x += ages2[i];	
		}
		System.out.println(x / ages2.length);
		
		//This is looping through the second array and adding all the numbers together.
		//The print statement is finding the average.
		
		//Question 2
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		 int j = 0;
	        for ( int i = 0; i < names.length; i++ ) {
			   j += names[i].length();
			}
	        System.out.println(j / names.length);//getting the average length of names.
	        
	        for ( int i = 0; i < names.length; i++ ) {
	        	System.out.println(names[i] + " ");
	        }
	        
	        //This code is using for loops to iterate through the array and print off all of the names.
	        
	        
	 //first element arr[0] - Question 3
	 //last element arr[arr.length-1] - Question 4
	        
	        
	        //Questions 5 & 6
	        int sum = 0;
	        int [] nameLengths = new int[names.length];
	        for ( int i = 0; i < names.length; i++ ) {
	        	nameLengths[i] = names[i].length();
	        }
	        for ( int i = 0; i < nameLengths.length; i++ ) {
	        	sum += nameLengths[i];
	        }
	        System.out.println(sum);
	        
	        //this is making a new array while iterating over the old one.
	        //then it is calculating the sum of all of the lengths of the name.
	        
	        
	}
}