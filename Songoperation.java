package com.jspider.Playlist.music;

import java.util.ArrayList;
import java.util.Scanner;

public class Songoperation {

	ArrayList<Song> music = new ArrayList<Song>();
	
	Scanner scanner=new Scanner(System.in);
	boolean list = false;
	
	public void addSongs() {
		System.out.println("Enter the number of Songs to add:= ");
		int no = scanner.nextInt();
		for(int i=0;i<no;i++) {
			System.out.println("Enter the Song Name:= ");
			String s = scanner.next();
			music.add(i, new Song());
			music.get(i).setId(i+1);
			music.get(i).setSongName(s);
		}
	}
	public void displayListOfSong() {
		if (music.isEmpty()==true) {
			System.out.println("Song is not available in list......");
			
			throw new NullPointerException();
		}
		else
			System.out.println(music);
	}
	public void removeSong() {
		try {
			this.displayListOfSong();
			System.out.println("Enter the number of Song Which you have to remove:= ");
			int j = scanner.nextInt();
			music.remove(j-1);
			this.displayListOfSong();
		} catch (Exception e) {
			System.out.println("Song is Not available in Music List, First Add the song....");
		}
		
	}
	public void ChooseSongtoPlay() {
		try {
			this.displayListOfSong();
			System.out.println("Enter the Number of Song:= ");
			int no = scanner.nextInt();
			try {
				System.out.println(music.get(no - 1).getSongName() + " Song is Played.");
			} catch (IndexOutOfBoundsException e) {
				System.out.println("No Songs Found");
			}
		} catch (Exception e) {
			System.out.println("No Song in List,Add Some song First");
		}
	}
	public void PlayAllSongs() {
		for(int i=0;i<music.size();i++) {
			System.out.println(music.get(i).getSongName()+" Song Played");
		}
		
	}
	public void PlayRandomSong() {
		double a =(Math.random()*(music.size()-0 + 1)) + 0 ;
		if(a<=music.size()) {
			System.out.println(music.get((int)a).getSongName()+" Song Played....");
		}
		else {
			System.out.println("Try Again");
			PlayRandomSong();
		}
	}
	public void update() {
		System.out.println(music);
		System.out.println("Choose Song Id:= ");
		int n =scanner.nextInt();
		System.out.println("1. Id \n"
				+ "2. Song \n"
				+ "3. Movie \n"
				+ "4. Composer \n"
				+ "5. Length \n"
				+ "6. Back ");
		int key = scanner.nextInt();
		switch (key) {
		case 1:
			System.out.println("Enter the New Id:= ");
			music.get(n-1).setId(scanner.nextInt());
			break;
		case 2:
			System.out.println("Enter the Song Name:= ");
			music.get(n-1).setSongName(scanner.next());
			break;
		case 3:
			System.out.println("Enter the New Movie Name:= ");
			music.get(n-1).setMovieName(scanner.next());
			break;
		case 4:
			System.out.println("Enter the Composer Name of Song:= ");
			music.get(n-1).setComposer(scanner.next());
			break;
		case 5:
			System.out.println("Enter the Song Duration:= ");
			music.get(n-1).setLength(scanner.nextDouble());
			break;
		case 6:
			break;
		
		}
	}
	
}






