package task1;

import java.util.*;

import java.util.Scanner;

public class logic {

	public static void main(String[] args) {
		int input;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		input=sc.nextInt();
       double output = (Math.pow(input,input) + Math.pow(input,2));
       System.out.println(output);
	}
}
