package java_A_Beginners._05_DataType;

import java.util.Scanner;

public class StringSwitch {
	public static void main(String args[]) {
		System.out.print("commands : ");
		System.out.println("connect, cancel, disconnect");
		
		
		System.out.print("Enter your command here : ");
		Scanner input=new Scanner(System.in);
		String command = input.nextLine();
		
		
	
		
		switch (command) {
		case "connect":
			System.out.println("Connecting");
			break;
		case "cancel":
			System.out.println("Canceling");
			break;
		case "disconnect":
			System.out.println("Disconnecting");
			break;
		default:
			System.out.println("Command Error!");
			break;
		}
	}

}
