package Selftaught._05162023;

import java.io.*;
import java.util.Scanner;

import javax.sound.sampled.*;

public class DemoMakeSound {
	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {

		Scanner input = new Scanner(System.in);

		File f1 = new File("guitar.wav");
		AudioInputStream wav = AudioSystem.getAudioInputStream(f1);
		Clip c1 = AudioSystem.getClip();
		c1.open(wav);

		String response = "";

		while (!response.equals("Q")) {
			System.out.println("P=play, S=stop , R=reset, Q= quit");
			System.out.print("Enter your choice : ");
			response = input.next();
			response = response.toUpperCase();

			switch (response) {
			case "P": {
				c1.start();
				break;
			}
			case "S": {
				c1.stop();
				break;
			}
			case "R": {
				c1.setMicrosecondPosition(0);
				break;
			}
			case "Q": {
				c1.close();
				break;
			}
			default:
				System.out.println("Please try again");
			}

		}
		System.out.println("\nGood bye");

	}
}