package cs2;

import java.io.File;
import java.io.IOException; 
import java.util.Scanner; 

import javax.sound.sampled.AudioInputStream; 
import javax.sound.sampled.AudioSystem; 
import javax.sound.sampled.Clip; 
import javax.sound.sampled.LineUnavailableException; 
import javax.sound.sampled.UnsupportedAudioFileException;

public class MusicPlayer {
	static String filePath;

	public void play() {
		try
		{ 
			// https://freesound.org/people/joshuaempyre/sounds/250856/
			/*
			 * This is a loop-capable segment of an epic orchestra I made with Logic Pro X. It is great for battle scenes, tension scenes, video games, etc.

Credit me Joshua Empyre in your work! :)

Check out my music at empyreanma.com/music-licensing


			 */
			filePath = "C:/Users/EvertJ/git/Sp2021CyoAg/325611__shadydave__my-love-piano-loop.mp3"; 
			SimpleAudioPlayer audioPlayer =  
					new SimpleAudioPlayer(filePath); 

			audioPlayer.play(); 
			Scanner sc = new Scanner(System.in); 

			while (true) 
			{ 
				System.out.println("1. pause"); 
				System.out.println("2. resume"); 
				System.out.println("3. restart"); 
				System.out.println("4. stop"); 
				System.out.println("5. Jump to specific time"); 
				int c = sc.nextInt(); 
				audioPlayer.gotoChoice(c); 
				if (c == 4) 
					break; 
			} 
			sc.close(); 
		}  

		catch (Exception ex)  
		{ 
			System.out.println("Error with playing sound."); 
			ex.printStackTrace(); 

		} 

	}

}
