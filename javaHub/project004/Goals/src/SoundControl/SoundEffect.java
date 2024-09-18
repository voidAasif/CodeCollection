package SoundControl;

import javax.sound.sampled.*;
import java.io.InputStream;
import java.io.IOException;


public class SoundEffect {
    public void playSound(String soundPath){
        System.out.println(soundPath); //debug, log;
        try {
            // Open an audio input stream
            // File audioFile = new File(soundPath);
            
            
            InputStream audioFile = getClass().getResourceAsStream(soundPath);
            if (audioFile == null) {
                System.out.println("Audio file not found: " + soundPath);
                return;
            }


            AudioInputStream audioInput = AudioSystem.getAudioInputStream(audioFile);
            
            // Get a sound clip resource
            Clip clip = AudioSystem.getClip();
            
            // Open the clip and load samples from the audio input stream
            clip.open(audioInput);
            
            // Play the sound
            clip.start();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
            System.out.println("Error playing sound.");
            ex.printStackTrace();
        }
    }
}
