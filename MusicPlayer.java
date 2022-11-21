package com.jspider.Playlist.music;

import java.util.Scanner;

public class MusicPlayer {
	
	static boolean loop = true;
	static Songoperation operation = new Songoperation();
	
	public static void main(String[] args) {
		musicList();
		
		while (loop) {
			musicList();
		}
	}
	public static void musicList() {
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("Menu := \n"
				+ "1. Add/Remove Song \n"
				+ "2. Play Song \n"
				+ "3. Edit Song\n"
				+ "4. Exit \n");
		
		System.out.println("Choose option:= ");
		int option = scanner.nextInt();
		
		switch (option) {
		case 1:{
			System.out.println("1. Add Song \n"
					+ "2. Remove Song \n"
					+ "3. Back");
			System.out.println("Choose Option:= ");
			int option2 = scanner.nextInt();
			switch (option2) {
			case 1:
				operation.addSongs();
				break;

			case 2:
				operation.removeSong();
				break;
			
			case 3:
				break;
			}
			loop = false;
			musicList();
			break;
		}
		case 2:
			System.out.println("1. Choose Song \n"
					+ "2. Play All Songs \n"
					+ "3. Play a Random Song \n"
					+ "4. Go Back");
			
			System.out.println("Choose Option:= ");
			int option1 = scanner.nextInt();
			switch (option1) {
			case 1:
				operation.ChooseSongtoPlay();
				break;
			case 2:
				operation.PlayAllSongs();
				break;
			case 3:
				operation.PlayRandomSong();
				break;
			case 4:
				break;
			}
			
		case 3:{
			operation.update();
			loop = false;
			musicList();
			break;
		}
			
		case 4:
			System.out.println("Exit");
			loop = false;
			musicList();
			break;
		}

	}

}
