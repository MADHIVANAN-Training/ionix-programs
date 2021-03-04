package task1;

import java.util.*;

import java.util.Scanner;

public class chat {
	
	static int chatCount;
	private static List chars = new ArrayList();
	
	public static void main(String[] args) {
	System.out.println("Enter End String:");
	Scanner sc = new Scanner(System.in);
	System.out.println();
	String endCommand = sc.nextLine();
	int countAConv = 0;
	int countBConv = 0;
	String atotalConv= "";
	String btotalConv= "";
	String totalChatConv= "";
	while(true){
		System.out.println("A: ");
		String aChat = sc.nextLine();
		
		System.out.println();
		if (aChat.equals(endCommand)){
			break;
		}
		atotalConv = atotalConv + " "+aChat;
		countAConv++;
		System.out.println("B: ");
		String bChat = sc.nextLine();
		
		System.out.println();
		if (bChat.equals(endCommand)){
			break;
		}
		btotalConv = btotalConv + " "+bChat;
		countBConv++;
	}
	chatCount = countAConv + countBConv;
	totalChatConv = atotalConv + btotalConv ;
	chatConvDetails(totalChatConv);
	}
	private static void chatConvDetails(String totalChatConv){
		System.out.println("1. Find repeated character");
		System.out.println("2. Find repeated word");
		System.out.println("3. Total Chat Length");
		System.out.println("4. Close the menu");
		System.out.println("1. Choose the question: ");
		Scanner sc = new Scanner(System.in);
		System.out.println();
		int questNumber = sc.nextInt();
		
		switch (questNumber) {
		case 1:
			findRepeatedChar(totalChatConv);
			System.out.println();
			chatConvDetails(totalChatConv);
			break;
		case 2:
			findRepeatedWord(totalChatConv);
			System.out.println();
			chatConvDetails(totalChatConv);
			break;
		case 3:
			System.out.println("Total Chat Lengt: " + chatCount);
			System.out.println();
			chatConvDetails(totalChatConv);
			break;
		case 4:
			System.out.println("Terminating Menu");
			break;
			default:
				System.out.println("Invalid Menu Option");
				break;
		}
				
	}
	private static void findRepeatedWord(String totalChatConv) {
		
		int count=0;
		
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter character to know its repetition: ");
	String input = sc.nextLine();
	
	for(int i=0;i<input.length();i++){
		char ch=input.charAt(i);
	
		for(int j=0;j<input.length();j++){
			if(ch==input.charAt(j)) {
				count++;
			}
		}
		System.out.println(ch + " : " + count);
	}
  
	System.out.println("Number of times character repeted: "+ count);
	}
    private static void findRepeatedChar(String totalChatConv) {
    	String input;
    	int wrc=1;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter word to know its repetition: ");
	String input1 = sc.nextLine();
	String[] words = input1.split(" ");
	for(int i=0;i<words.length;i++){
		for(int j=i+1;j<words.length;j++){
			if(words[i].equals(words[j]))
			{
				wrc=wrc+1;
				words[j]="0";
			}
		}
		if(words[i]!="0")
			System.out.println("Number of times character repeted: "+ words[i] + ":" + wrc);
		wrc=1;
	}
}
}