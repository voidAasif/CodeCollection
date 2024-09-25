package SoundControl;

import javax.sound.sampled.*;
import java.io.InputStream;
import java.io.IOException;


public class SoundEffect {
    public void playSound(String soundPath){ //path of audio file;
        // System.out.println(soundPath); //debug, log;
        try {     
            
            InputStream audioFile = getClass().getResourceAsStream(soundPath); //convert file into stream;
            if (audioFile == null) {
                System.out.println("Audio file not found: " + soundPath);
                return;
            }


            AudioInputStream audioInput = AudioSystem.getAudioInputStream(audioFile); //convert stream into audioStream;
            
            //Get a sound clip resource
            Clip clip = AudioSystem.getClip();
            
            //Open the clip and load samples from the audio input stream
            clip.open(audioInput);
            
            //Play the sound
            clip.start();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
            System.out.println("Error playing sound.");
            ex.printStackTrace();
        }
    }
}
