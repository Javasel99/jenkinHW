package techpack2;

import java.util.Scanner;

public class LearningStringIsFun {

	public static void main(String[] args) {
		Scanner user2 = new Scanner(System.in);
		System.out.println("Please entre a String");
		String str = user2.nextLine();//assume the user enters “krishna"
		System.out.println("Enter Name: "+ str);
		System.out.println(str.toUpperCase());//Convert that string to all uppercase and print it (it should print “KRISHNA”)
		System.out.println(str.length());//Print the length of that string (it should print 7)
		System.out.println(str.replace('h', 'm'));//Give the last char of the string (it should print “Z”)
	
		System.out.println(str +" Test");//Concatenate the string from step 1 with string "Test" (it should print “hello Test”)
	}

}


